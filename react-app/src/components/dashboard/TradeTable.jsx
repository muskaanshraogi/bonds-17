import React from "react";
import { makeStyles } from "@material-ui/core";
import { useEffect } from "react";
import Axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
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


export default function TradeTable(props) {

  const classes = useStyles();
  const history = useNavigate();
  const {securityId} = useParams()
  const [data, setData] = useState(null)

  const handleClick = (e) => {
    console.log(e.target.id)
    history(`/home/security/${e.target.id}`)
  }

  useEffect(() => {
    Axios.get(`${hostNameUrl}/securitytrade/${securityId}`, {
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
        console.log(err)
    });
}, [])

  return (
        
      <Table hover className={classes.table}>
      <thead>
        <tr>
            <th className={classes.cell}>ID</th>
            <th className={classes.cell}>Book</th>
            <th className={classes.cell}>Counterparty</th>
            <th className={classes.cell}>Type</th>
            <th className={classes.cell}>Price</th>
            <th className={classes.cell}>Quantity</th>
            <th className={classes.cell}>Trade Date</th>
            <th className={classes.cell}>Settlement Date</th>
            <th className={classes.cell}>Status</th>
        </tr>
      </thead>
      <tbody>
      
      {data ? data.map((row) => (
            <tr>
              <td className={classes.cell}>{row.id}</td>
              <td className={classes.cell}>{row.bookid}</td>
              <td className={classes.cell}>{row.counterpartyid}</td>
              <td className={classes.cell}>{row.buy_sell}</td>
              <td className={classes.cell}>{row.price}</td>
              <td className={classes.cell}>{row.quantity}</td>
              <td className={classes.cell}>{row.tradedate}</td>
              <td className={classes.cell}>{row.settlementdate}</td>
              <td className={classes.cell}>{row.status ? <Badge bg="success">SUCCESS</Badge> : <Badge bg="danger">FAIL</Badge>}</td>
            </tr>
          )) : null}
      </tbody>
    </Table>
  )
}