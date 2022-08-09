import React, { useState } from "react";
import {
  Hidden,
  Typography,
  Button,
  CssBaseline,
  TextField,
  Link,
  Paper,
  Grid,
  Avatar,
  Snackbar
} from "@material-ui/core";
import { FaUserCheck } from "react-icons/fa";
import { makeStyles } from "@material-ui/styles";
import { Link as RRDLink, useNavigate } from "react-router-dom";
// import { useSnackbar } from 'react-simple-snackbar'
import Axios from "axios";
import { hostNameUrl } from "../../config/api";

const useStyles = makeStyles((theme) => ({
  root: {
    height: "100vh",
    fontSize: "15px",
  },
  paper: {
    padding: "5%",
    height: "100%",
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "#F5F5DC",
    // boxShadow: "0 2px 150px rgba(0, 0, 0, 0.4)",
  },
  image: {
    backgroundColor: "#6C63FF",
    backgroundSize: "cover",
    backgroundPosition: "30%",
  },
  target: {
    fontFamily: "'Pacifico', cursive",
    height: "90%",
    fontSize: "120px",
    textShadow: "4px 6px rgba(0, 0, 0, 0.4)",
    display: "flex",
    alignItems: "center",
    justifyContent: "center",
    color: "#FFFFFF",
  },
  form: {
    width: "100%", // Fix IE 11 issue.
    marginTop: "1px",
  },
  submit: {
    margin: "3% 0 2% 0",
    fontSize: "18px",
  },
  avatar: {
    backgroundColor: "#6C63FF",
    fontSize: "25px",
    height: "7%",
    width: "9%",
  },
}));

export default function Login() {
 
  const classes = useStyles();
  const history = useNavigate();

  const [details, setDetails] = useState({
    email: "",
    password: "",
  });
  const [open, setOpen] = useState(false)
  const [message, setMessage] = useState("")

  const handleClose = (e) => {
    setOpen(false)
    setMessage("")
  }

  const handleChange = (e) => {
    const et = e.target;
    if (!!et.id) setDetails({ ...details, [et.id]: et.value });
    else setDetails({ ...details, [et.name]: et.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!details.email || !details.password) {
        setOpen(true)
        setMessage("Please enter valid credentials")
      return;
    }
    Axios.get(`${hostNameUrl}/login/`, {
      headers: {
        "Content-Type": "application/json",
      },
      params: {
        email: details.email,
        pass: details.password
      },
    })
      .then((res) => {
        if(res.data != "Incorrect Email or Password") {
          sessionStorage.setItem("usertoken", res.data);
          setOpen(true)
          setMessage("Login successful")
          history("/home/dashboard")
        }
        else {
          setOpen(true)
          setMessage("Please enter valid credentials")
        }
      })
      .catch((err) => {
        setOpen(true)
        setMessage("Please enter valid credentials")
      });
  };

  return (
    <Grid container component="main" className={classes.root}>
      <CssBaseline />
      <Grid
        item
        xs={false}
        sm={4}
        md={7}
        alignContents="center"
        className={classes.image}
      >
        <Hidden smDown>
          <Typography component="h1" variant="h1" className={classes.target}>
            BONDS-17
          </Typography>
        </Hidden>      
      </Grid>
      <Grid item xs={12} sm={8} md={5} component={Paper} elevation={6} square>
        <div className={classes.paper}>
          <Hidden smDown>
            <Avatar className={classes.avatar}>
              <FaUserCheck />
            </Avatar>
          </Hidden>
          <form className={classes.form} noValidate onSubmit={handleSubmit}>
            <TextField
              variant="outlined"
              margin="normal"
              required
              fullWidth
              id="email"
              label="Email Address"
              name="email"
              autoComplete="email"
              autoFocus
              onChange={handleChange}
            />
            <TextField
              variant="outlined"
              margin="normal"
              required
              fullWidth
              name="password"
              label="Password"
              type="password"
              id="password"
              autoComplete="current-password"
              onChange={handleChange}
            />
            <Button
              type="submit"
              fullWidth
              variant="contained"
              color="primary"
              className={classes.submit}
              onClick={handleSubmit}
            >
              Login
            </Button>
            <Grid container>
              <Grid item xs>
                <div style={{float: 'right'}}>
                  <Link component={RRDLink} to="/reset">
                    Forgot password?
                  </Link>
                </div>
              </Grid>
            </Grid>
          </form>
        </div>
      </Grid>
      <Snackbar
        open={open}
        autoHideDuration={6000}
        onClose={handleClose}
        message={message}
        anchorOrigin={{
          vertical: "bottom",
          horizontal: "left"
         }}
        />
    </Grid>
  );
}