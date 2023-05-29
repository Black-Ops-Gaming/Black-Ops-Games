import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter, Route, Routes } from 'react-router-dom';

ReactDOM.createRoot(
  <React.StrictMode>
      <BrowserRouter>
        <Routes>
          <Route path="/*" element= {<App />} />
        </Routes>
      </BrowserRouter>
    
  </React.StrictMode>,
  document.getElementById('createRoot')
);
