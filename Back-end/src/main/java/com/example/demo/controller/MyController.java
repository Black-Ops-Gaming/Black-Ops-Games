package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Game;
import com.example.demo.service.MyService;

@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/")
    public String home() {
        return "Welcome to the Game Store API!";
    }

    @GetMapping("/games")
    public List<Game> getGames(@RequestParam(required = false) String platform,
                               @RequestParam(required = false) String category) {
        if (platform != null) {
            return myService.getGamesByPlatform(platform);
        } else if (category != null) {
            return myService.getGamesByCategory(category);
        } else {
            return myService.getAllGames();
        }
    }
}
