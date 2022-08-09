import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import Login from "./components/user/Login";
import Home from './components/dashboard/Home'

export default function BondRoutes() {
    return(
        <Router>
            <Routes>
                <Route exact path='/' element={<Login/>}/>
                <Route path='/home/*' element={<Home/>}/>
            </Routes>
        </Router>
    );
}