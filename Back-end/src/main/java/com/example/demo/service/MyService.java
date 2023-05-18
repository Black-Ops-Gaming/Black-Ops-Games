package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import com.example.demo.Model.Game;

@Service
public class MyService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    public List<Game> getAllGames() {
        String url = "https://www.freetogame.com/api/games";
        ResponseEntity<Game[]> response = restTemplate.getForEntity(url, Game[].class);
        return Arrays.asList(response.getBody());
    }
    
    public List<Game> getGamesByPlatform(String platform) {
        String url = "https://www.freetogame.com/api/games?platform={platform}";
        ResponseEntity<Game[]> response = restTemplate.getForEntity(url, Game[].class, platform);
        return Arrays.asList(response.getBody());
    }
    
    public List<Game> getGamesByCategory(String category) {
        String url = "https://www.freetogame.com/api/games?category={category}";
        ResponseEntity<Game[]> response = restTemplate.getForEntity(url, Game[].class, category);
        return Arrays.asList(response.getBody());
    }
    
}


