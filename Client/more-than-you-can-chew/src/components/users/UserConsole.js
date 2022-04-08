import React from 'react'
import BakeriesNearYou from './BakeriesNearYou'
import "../stylesheets/Main.css";
import UserNavBar from './UserNavBar';

function UserConsole({selectedUser, bakeries, handleDelete}) {


  if(selectedUser.name){
    return (
      <>
      <UserNavBar selectedUser={selectedUser} handleDelete={handleDelete}/>
      <div className='UserConsoleContainer'>
        <BakeriesNearYou bakeries={bakeries}/>
  
      </div>
      </>
    )
  }else{
    return(
      <p>Loading.....</p>
    )
  }


}

export default UserConsole