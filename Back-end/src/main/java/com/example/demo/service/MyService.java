package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Game;

@Service
public class MyService {

    private static final String API_BASE_URL = "https://www.freetogame.com/api/games";

    @Autowired
    private RestTemplate restTemplate;

    public List<Game> getAllGames() {
        String url = API_BASE_URL;
        Game[] games = restTemplate.getForObject(url, Game[].class);
        return Arrays.asList(games);
    }

    public List<Game> getGamesByPlatform(String platform) {
        String url = API_BASE_URL + "?platform=" + platform;
        Game[] games = restTemplate.getForObject(url, Game[].class);
        return Arrays.asList(games);
    }

    public List<Game> getGamesByCategory(String category) {
        String url = API_BASE_URL + "?category=" + category;
        Game[] games = restTemplate.getForObject(url, Game[].class);
        return Arrays.asList(games);
    }
}


