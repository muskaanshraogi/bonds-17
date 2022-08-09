import React from "react";
import { makeStyles } from "@material-ui/core";
import { useEffect } from "react";
import Axios from "axios";
import { useNavigate } from "react-router-dom";
import { hostNameUrl } from "../../config/api";
import { useState } from "react";
import { Table, Badge, Button } from 'react-bootstrap';

const useStyles = makeStyles((theme) => ({
  table: {
    fontFamily: "Roboto",
    fontWeight: 400,
    lineHeight: 2,
    fontSize: '16px',
    borderSpacing:'15px',
    width: "100%",
    padding: "5%"
  },
  cell: {
    padding: "5%"
  }
}));


export default function SecurityTable(props) {

  const classes = useStyles();
  const history = useNavigate();

  const [data, setData] = useState(null)

  const handleClick = (e) => {
    console.log(e.target.id)
    history(`/home/security/${e.target.id}`)
  }

  useEffect(() => {
    Axios.get(`${hostNameUrl}/security/`, {
        headers: {
          "Content-Type": "application/json",
          Authorization: `Bearer ${sessionStorage.getItem("usertoken")}`
        },
    })
    .then((res) => {
        setData(res.data)
    })
    .catch((err) => {
        // openSnackbar("Failed to retrieve answer");
        // setLoader(false)
    });
}, []);

  return (
        
      <Table hover className={classes.table}>
      <thead>
        <tr>
            <th className={classes.cell}>ISIN</th>
            <th className={classes.cell}>CUSIP</th>
            <th className={classes.cell}>Issuer</th>
            <th className={classes.cell}>Type</th>
            <th className={classes.cell}>Maturity Date</th>
            <th className={classes.cell}>Face Value</th>
            <th className={classes.cell}>Coupon</th>
            <th className={classes.cell}>Status</th>
        </tr>
      </thead>
      <tbody>
      
      {data ? data.map((row) => (
            <tr>
              <td className={classes.cell}><Button variant="link" onClick={handleClick} id={row.id}>{row.isin}</Button></td>
              <td className={classes.cell}>{row.cusip}</td>
              <td className={classes.cell}>{row.issuer}</td>
              <td className={classes.cell}>{row.type}</td>
              <td className={classes.cell}>{row.maturitydate}</td>
              <td className={classes.cell}>{row.facevalue}</td>
              <td className={classes.cell}>{row.coupon}</td>
              <td className={classes.cell}>{row.status ? <Badge bg="danger">ACTIVE</Badge> : <Badge bg="success">SETTLED</Badge>}</td>
            </tr>
          )) : null}
      </tbody>
    </Table>
  )
}