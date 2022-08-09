import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import Securities from './Securities'
import Trades from './Trades'

export default function BondRoutes() {
    return(
            <Routes>
                <Route path='/dashboard' element={<Securities/>}/>
                <Route path='/security/:securityId' element={<Trades/>}/>
            </Routes>
    );
}