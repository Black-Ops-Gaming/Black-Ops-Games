import React from 'react'
import './Hero.css'
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';

const Hero = ({ games }) => {
  return (
    <div>
      <Carousel>
        {games.map((game) => {
          return (
            <Paper key={game.id}>
              <div className='game-card-container'>
                <div
                  className="game-card"
                  style={{ "--img": `url(${game.backdrops[0]})` }} // Fix: double curly braces
                >
                  <div className="game-detail">
                    <div className="game-poster">
                      <img src={game.poster} alt="Games displayed" />
                    </div>
                    <div className="game-title">
                      <h4>{game.title}</h4>
                    </div>
                  </div>
                </div>
              </div>
            </Paper>
          )
        })}
      </Carousel>
    </div>
  )
}

export default Hero;
