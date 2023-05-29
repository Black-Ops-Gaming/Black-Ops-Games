package com.example.demo.config;

import com.example.demo.Model.Game;
import com.example.demo.Model.GameSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(Game.class, new GameSerializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}


