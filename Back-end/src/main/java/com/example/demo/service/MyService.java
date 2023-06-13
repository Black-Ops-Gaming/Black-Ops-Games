package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import com.example.demo.Model.Game;

@Service
public class MyService {

    private static final String API_BASE_URL = "https://www.freetogame.com/api/games";

    private final WebClient webClient;

    public MyService() {
        this.webClient = WebClient.create();
    }

    public List<Game> getAllGames() {
        String url = API_BASE_URL;
        Game[] games = webClient.get().uri(url).retrieve().bodyToMono(Game[].class).block();
        return Arrays.asList(games);
    }

    public List<Game> getGamesByPlatform(String platform) {
        String url = API_BASE_URL + "?platform=" + platform;
        Game[] games = webClient.get().uri(url).retrieve().bodyToMono(Game[].class).block();
        return Arrays.asList(games);
    }

    public List<Game> getGamesByCategory(String category) {
        String url = API_BASE_URL + "?category=" + category;
        Game[] games = webClient.get().uri(url).retrieve().bodyToMono(Game[].class).block();
        return Arrays.asList(games);
    }
}


