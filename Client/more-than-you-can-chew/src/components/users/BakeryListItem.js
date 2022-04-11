import React from 'react'
import "../stylesheets/Main.css";
import MapBox from '../maps/MapBox';

const BakeryListItem = ({bakery}) => {


  return (
    <ul className="bakeriesNearContainer">
      <h2>{bakery.name}</h2>
      <span> Location: {bakery.location}</span>
      <span> Contact Email: {bakery.email}</span>
      <span> Collection Time: {bakery.collectionTime}</span>
      <div className="App">
        <MapBox bakery={bakery}/> 
      </div>
    </ul>
  )
}

export default BakeryListItem