import axios from 'axios';

export default axios.create({
    baseURL: 'https://www.freetogame.com/api/games',
    headers: {"ngrok-skip-browser-warning": true}
})