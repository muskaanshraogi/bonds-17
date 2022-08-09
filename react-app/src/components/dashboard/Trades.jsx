import React, { useState, useEffect } from "react";
import {
  makeStyles,
  Grid,
  Button,
  Typography,
  Divider
} from "@material-ui/core";
import { useNavigate, useLocation, useParams, Navigate } from "react-router-dom";
import Axios from "axios";
import TradeTable from './TradeTable'
import { hostNameUrl } from "../../config/api";
import { BiArrowBack } from 'react-icons/bi'
import { Table, Badge } from 'react-bootstrap'
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';

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
  },
  details: {
    fontSize: '16px',
    marginBottom: '3%'
  }
}));

export default function Trades(props) {

  const classes = useStyles();      
    const navigate = useNavigate()

    const {securityId} = useParams()
    const [security, setSecurity] = useState(null)
    const [modal, setModal] = useState(false)

    useEffect(() => {
        getSecurity()
    }, [])

    const getSecurity = () => {
        Axios.get(`${hostNameUrl}/security/${securityId}`, {
            headers: {
              "Content-Type": "application/json",
              Authorization: `Bearer ${sessionStorage.getItem("usertoken")}`
            },
        })
        .then((res) => {
            console.log(res.data)
            setSecurity(res.data)
        })
        .catch((err) => {
            // openSnackbar("Failed to retrieve answer");
            // setLoader(false)
        });
    }

    const handleClick = () => {
        setModal(true)
    }

    const handleClose = () => {
        setModal(false)
    }

    const handleUpdate = () => {
        Axios.put(`${hostNameUrl}/securitystatus/${securityId}`, {
            headers: {
              "Content-Type": "application/json",
              Authorization: `Bearer ${sessionStorage.getItem("usertoken")}`
            },
        })
        .then((res) => {
            console.log(res.data)
            setModal(false)
            getSecurity()
        })
        .catch((err) => {
            // openSnackbar("Failed to retrieve answer");
            // setLoader(false)
        });
    }

  return (
    <div className={classes.root}>
      <Grid container>
        <Grid className={classes.paper}>
            <div>
                <Typography variant="h4" className={classes.text}>
                    <Button onClick={() => navigate(-1)}>
                        <BiArrowBack className={classes.icon}/>
                    </Button>
                    Security: {security ? security.isin : null}
                </Typography>
            </div>
            {security ?
            <Table borderless striped="columns" className={classes.details}>
                <tbody>
                    <tr>
                        <td><b>ISIN</b></td>
                        <td>{security.isin}</td>
                        <td><b>CUSIP</b></td>
                        <td>{security.cusip}</td>
                    </tr>
                    <tr>
                        <td><b>Issuer</b></td>
                        <td>{security.issuer}</td>
                        <td><b>Type</b></td>
                        <td>{security.type}</td>
                    </tr>
                    <tr>
                        <td><b>Face Value</b></td>
                        <td>{security.facevalue}</td>
                        <td><b>Coupon</b></td>
                        <td>{security.coupon}</td>
                    </tr>
                    <tr>
                        <td><b>Maturity Date</b></td>
                        <td>{security.maturitydate}</td>
                        <td><b>Status</b></td>
                        <td>{security.status ? <Badge bg="success">OK</Badge> : <Badge bg="danger">CRITICAL</Badge>}</td>
                    </tr>
                </tbody>
                </Table>:
                null}

            <Typography variant="h5" style={{color: "#6C63FF", fontWeight: 500}}>
                TRADES
            </Typography>
            <TradeTable/>
            <div>
                <Button disabled={!security || security.status} onClick={handleClick} variant="contained" color="primary" style={{float: "right", width: "12%"}}>Mark OK</Button>
            </div>
        </Grid>
      </Grid>
      <Dialog
            open={modal}
            onClose={handleClose}
            aria-labelledby="alert-dialog-title"
            aria-describedby="alert-dialog-description"
        >
            <DialogTitle id="alert-dialog-title">
            {"Are you sure you want to mark current security OK?"}
            </DialogTitle>
            <DialogActions>
            <Button onClick={handleClose}>Disagree</Button>
            <Button onClick={handleUpdate} autoFocus>
                Agree
            </Button>
            </DialogActions>
        </Dialog>
    </div>
  );
}