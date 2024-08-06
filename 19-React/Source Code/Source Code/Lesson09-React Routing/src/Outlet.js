import React from 'react';

import {Routes, Route} from 'react-router-dom';
import Home from './Home';
import About from './About';
import Contact from './Contact';

const Outlet = () => {
    return(
        
        <Routes>
            <Route path="/"  element = { <Home /> } > </Route>
            <Route path="/about" element = { <About /> }> </Route> 
            <Route path="/contact" element = { <Contact /> }> </Route>
        </Routes>
    )
}
export default Outlet