const app = require('./App.css');
const api = require('./API/axiosConfig');
import {useState, useEffect} from 'react';

function App() {

  const [games, setGames] = useState();
  const getGames = async () => {
    try{
        const response = await api.get("/api/v1/games");

        console.log(response.data);

        setGames(response.data);
    } catch(err){
      console.error(err);
    }
    const response = await api.get('/api/v1/games')
  }

useEffect(() =>{
  getGames();
}, [])

  return (
    <div className="App">

    </div>  
  );
}

export default App;
