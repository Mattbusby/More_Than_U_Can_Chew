import React from 'react';
import BakeryOrder from './BakeryOrder';
import "../stylesheets/Main.css";
import CreateBakeryItem from '../bakeryItems/CreateBakeryItem';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';
import BakeryNavBar from './BakeryNavBar';
import ShowBakeryItems from '../bakeryItems/ShowBakeryItems';



const BakeryConsole = ({selectedBakery, images, orders, users, items, selectedItem, onUpdate, setSelectedItem}) => {



  return (
    <>
      <BakeryNavBar selectedBakery={selectedBakery}/>
      {/* <h3>Bakery ID: {selectedBakery.id}</h3>
      <h3>Location: {selectedBakery.location.replace(/"/g, '')}</h3>
      <h3>email: {selectedBakery.email.replace(/"/g, '')}</h3> */}
       <div className='ViewOrdersButton'>
      <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"orders"}><button className='ButtonItem' type="button">View Orders</button></Link>
      </div>
      <div className='ViewItemsButton'>
      <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"items"}><button className='ButtonItem' type="button">View Menu Items</button></Link>
      </div>
      <div className='CreateNewItemButton'>
      <Link style={{textDecoration:"none"}} className="ButtonContainer" to={"create_item"}><button className='ButtonItem' type="button">Create Bakery Item</button></Link>
      </div>
      <div className='orders-container'>
      {/* <ul>
        <li>
            <BakeryOrder items={items} users={users} selectedBakery={selectedBakery} orders={orders}/>
        </li>
      </ul> */}
      </div>

      {/* <ShowBakeryItems items={items} selectedBakery={selectedBakery} images={images}/> */}

    </>
  )
}

export default BakeryConsole