import axios from 'axios';

const instance = axios.create({
  baseURL: 'http://localhost:8080/api/games',
  headers: { 'ngrok-skip-browser-warning': true },
});

export default instance;
