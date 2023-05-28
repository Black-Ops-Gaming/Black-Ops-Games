import React from 'react';
import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';

const Hero = ({ games }) => {
  if (!games) {
    // Return loading indicator or placeholder while games are being fetched
    return <div>Loading...</div>;
  }

  return (
    <div>
      <Carousel>
        {games.map((game) => (
          <Paper key={game.id}>
            <div className='game-card-container'>
              <div className='game-card'>
                <div className='game-detail'>
                  <div className='game-poster'>
                    <img src={game.poster} alt='Games displayed' />
                  </div>
                  <div className='game-title'>
                    <h4>{game.title}</h4>
                  </div>
                </div>
              </div>
            </div>
          </Paper>
        ))}
      </Carousel>
    </div>
  );
};

export default Hero;
