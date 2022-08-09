import React, { useState, useEffect } from "react";
import {
  makeStyles,
  Grid,
  Button,
  Typography
} from "@material-ui/core";
import { useNavigate, useLocation } from "react-router-dom";
import Axios from "axios";
import Loader from "react-js-loader";
import SecurityTable from './SecurityTable'
import { hostNameUrl } from "../../config/api";
import { GrSecure } from 'react-icons/gr'

const useStyles = makeStyles((theme) => ({
  avatar2: {
    color: "#FFFFFF",
    backgroundColor: "#E50058",
  },
  avatar: {
    color: "#FFFFFF",
    backgroundColor: "#193B55",
  },
  root: {
    display: "flex",
    width: '100%',
    padding: '1% 3%'
  },
  logo: { marginRight: theme.spacing(2) },
  title: {
    flexGrow: 1,
    display: "none",
    color: "#6C63FF",
    fontWeight: '500',
    fontSize: '16px',
    textTransform: 'uppercase',
    [theme.breakpoints.up("sm")]: {
      display: "block",
    },
  },
  paper: {
    padding: theme.spacing(5),
    margin: '1%',
    width: "100%",
    display: "flex",
    flexDirection: "column",
    justifyContent: "center",
    backgroundColor: "#FFFFFF",
    boxShadow: "0 2px 50px rgba(0, 0, 0, 0.4)",
  },
  content: {
    flexGrow: 1,
    padding: theme.spacing(3),
  },
  list: {
    paddingLeft: theme.spacing(1),
  },
  backDrop: {
    backdropFilter: "blur(3px)",
    backgroundColor: "rgba(69,69,69,0.8)",
  },
  listItem: {
    padding: "0 auto",
  },
  submit: {
    marginTop: '1%'
  },
  text: {
    float: "left",
    paddingBottom: "2%"
  },
  icon: {
    fontSize: '30px',
    paddingBottom: '3px',
    marginRight:'2px'
  }
}));

export default function Securities() {
  const options = {
    position: 'bottom-left',
    style: {
      fontSize: '15px',
      textAlign: 'center',
    }
  }

  const classes = useStyles();    
  

  return (
    <div className={classes.root}>
      <Grid container>
        <Grid className={classes.paper}>
            <Typography variant="h4" className={classes.text}>
                <GrSecure className={classes.icon}/>Securities
            </Typography>
            <SecurityTable/>
        </Grid>
      </Grid>
    </div>
  );
}