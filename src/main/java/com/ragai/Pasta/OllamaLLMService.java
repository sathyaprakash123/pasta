package com.ragai.Pasta;


import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;


import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OllamaLLMService {

    @Autowired
    OllamaChatModel chatModel;

    /*  public String askQuery(String query) {
          return chatModel.call(query);
      } */

    // Using post method so that we can upload images in near future

    public String askQuery(String query) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        query,
                        OllamaOptions.builder()
                                .model(OllamaModel.LLAVA)
                                .temperature(0.4)
                                .build()
                ));

return response.toString();

    }

    
}

