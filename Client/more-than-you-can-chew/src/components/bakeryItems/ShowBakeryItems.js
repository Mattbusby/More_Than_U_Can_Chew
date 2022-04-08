import NavBar from '../NavBar';
import React, {useState} from 'react'
import "../stylesheets/Main.css";
import BakeryItem from './BakeryItem';

const showBakeryItems = ({selectedBakery}) => {

    const findBakeryItemsOfBakery = selectedBakery.availableItems.map((item, index) => {
        return <BakeryItem item={item} key={index}/>
    })


return(
    <div className='ShowBakeryItemsContainer'>
        <h2>
            Items Available
        </h2>
        <ul >
            {findBakeryItemsOfBakery}
        </ul>
        hello
    </div>
)}


export default showBakeryItems;