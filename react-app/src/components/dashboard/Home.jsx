import React, { useState, useEffect } from "react";
import {
  makeStyles,
  AppBar,
  CssBaseline,
  Toolbar,
  Typography,
  IconButton,
  Grid,
  Tooltip,
} from "@material-ui/core";
import {
  ExitToApp,
} from "@material-ui/icons";
import { IoPersonSharp } from 'react-icons/io5'
import { FaQuestion } from 'react-icons/fa'
import clsx from "clsx";
import { useNavigate, useLocation } from "react-router-dom";
import Axios from "axios";
import { VpnKey, AccessibilityNew } from "@material-ui/icons";
import MainRoutes from "./MainRoutes"

const drawerWidth = 400;

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
  },
  appBar: {
    zIndex: theme.zIndex.drawer + 1,
  },
  logo: { marginRight: theme.spacing(2) },
  title: {
    fontFamily: "'Pacifico', cursive",
    flexGrow: 1,
    display: "none",
    [theme.breakpoints.up("sm")]: {
      display: "block",
    },
  },
  paper: {
    padding: theme.spacing(0, 8),
    height: "100%",
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    // backgroundColor: "#F5F5DC",
    // boxShadow: "0 2px 150px rgba(0, 0, 0, 0.4)",
  },
  drawerPaper: {
    width: drawerWidth,
  },
  drawerContainer: {
    overflowX: "none",
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
    // backgroundColor: "rgba(69,69,69,0.8)",
  },
  listItem: {
    padding: "0 auto",
  },
}));

export default function Home() {
  const classes = useStyles();

  const location = useLocation();
  const history = useNavigate();

  const handleLogout = () => {
    sessionStorage.removeItem("usertoken");
    history("");
  };

  const handleProfile = () => {
      history("/home/profile")
  }

  // useEffect(() => {
  //   let user = sessionStorage.getItem("usertoken");
  //   if (!user) {
  //     history("/");
  //   }
  // });

  return (
    <div className={classes.root}>
      <CssBaseline />
      <AppBar position="fixed" className={classes.appBar} color="primary">
        <Toolbar>
          
          <Typography variant="h5" className={classes.title}>
            BONDS-17
          </Typography>
          <IconButton onClick={handleProfile} style={{marginRight: "5px"}}>
            <Tooltip title="Profile">
              <IoPersonSharp style={{ height: "22px", color: "#ffffff" }} />
            </Tooltip>
          </IconButton>
          <IconButton onClick={handleLogout}>
            <Tooltip title="Logout">
              <ExitToApp style={{ height: "25px", color: "#ffffff" }} />
            </Tooltip>
          </IconButton>
        </Toolbar>
      </AppBar>
      <main className={classes.content}>
        <Toolbar />
        <Grid container spacing={1} direction="row">
          <MainRoutes />
        </Grid>
      </main>
    </div>
  );
}