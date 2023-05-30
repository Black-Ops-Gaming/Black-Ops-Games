import React, { useState, useEffect } from 'react';
import './App.css';
import api from './API/axiosConfig';
import Layout from './components/Layout'
import {Routes, Route } from 'react-router-dom'
import Home from './components/home/Home';
import 'cors';


function App() {
  const [games, setGames] = useState([]);

  const getGames = async () => {
    try {
      const response = await api.get('/api');
      console.log(response.data);
      setGames(response.data);
    } catch (err) {
      console.error(err);
    }
  };

  useEffect(() => {
    getGames();
  }, []);

  return (
    <div className="App">

      <Routes>
         <Route path ="/" element= {<Layout/>}>
          <Route path = "/" element = {<Home games ={games}/>}> </Route>

         </Route>
      </Routes>

    </div>
  );
}

export default App;

