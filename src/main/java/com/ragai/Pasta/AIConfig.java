package com.ragai.Pasta;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;

public class AIConfig {


    @Bean
    ChatClient chatClient(ChatClient.Builder builder) {
        return builder.build();
    }
}
