import React, { Fragment } from "react";
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import BakeryContainer from "./BakeryContainer";


const MainContainer = () => {



    return(
        <Router>
            <Fragment>
                <Routes>
                    <Route path="/Bakeries" element={<BakeryContainer />} />
                </Routes>
            </Fragment>


        </Router>

    )
}

export default MainContainer