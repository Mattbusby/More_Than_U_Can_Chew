import React, {useState, useEffect} from 'react'
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet'
import "../../App.css"
import MapOnly from './MapOnly'

const MapBox = ({bakery, selectedUser}) => {
    // console.log({bakery});
  
    const [BakeryLat, setBakeryLat] = useState(null);
    const [BakeryLong, setBakeryLong] = useState(null);
    const [UserLat, setUserLat] = useState(null);
    const [UserLong, setUserLong] = useState(null);
    const [Distance, setDistance] = useState(null);


    useEffect(() => {
      getBakeryLatLong();
      getUserLatLong();
    }, [])

    

    let bakeryPostcode = bakery.location
    let userPostcode = selectedUser.location


    const getBakeryLatLong = () => {
      fetch('https://api.postcodes.io/postcodes/' + bakeryPostcode)
      .then(res => res.json())
      .then(data => {
        setBakeryLat(data.result.latitude)
        setBakeryLong(data.result.longitude)
      })
  }


  const getUserLatLong = () => {
    fetch('https://api.postcodes.io/postcodes/' + userPostcode)
    .then(res => res.json())
    .then(data => {
      setUserLat(data.result.latitude)
      setUserLong(data.result.longitude)
    })
  }

  useEffect(() => {
    getDistance();
  }, [UserLat && UserLong && BakeryLat && BakeryLong])

  const getDistance = () => {
    const R = 6371; // metres
    const φ1 = UserLat * Math.PI/180; // φ, λ in radians
    const φ2 = BakeryLat * Math.PI/180;
    const Δφ = (BakeryLat-UserLat) * Math.PI/180;
    const Δλ = (BakeryLong-UserLong) * Math.PI/180;

    const a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
          Math.cos(φ1) * Math.cos(φ2) *
          Math.sin(Δλ/2) * Math.sin(Δλ/2);
    const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
    const d = R * c; 
    if(d<0){d = -d}
    setDistance(d);
  }
return(<>
  {BakeryLat && BakeryLong && UserLat && UserLong && <MapOnly bakery={bakery} BakeryLat={BakeryLat} BakeryLong={BakeryLong} UserLat={UserLat} UserLong={UserLong}/>}
</>
)
}

export default MapBox;