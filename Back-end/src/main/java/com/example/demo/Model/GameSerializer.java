package com.example.demo.Model;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class GameSerializer extends JsonSerializer<Game> {
    @Override
    public void serialize(Game game, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("title", game.getTitle());
        
        
        
        jsonGenerator.writeStringField("thumbnail", game.getThumbnail());
        jsonGenerator.writeStringField("short_description", game.getShort_description());
        jsonGenerator.writeStringField("gameurl", game.getGame_url());
        jsonGenerator.writeStringField("platform", game.getPlatform());
        jsonGenerator.writeEndObject();
    }
}
