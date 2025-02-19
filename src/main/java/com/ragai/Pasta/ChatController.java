package com.ragai.Pasta;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    @Autowired
    OllamaLLMService ollamaLLMService;



    @PostMapping("/api/chat")
    public String processRequest(@RequestBody ChatQuery query) {
        {
            return ollamaLLMService.askQuery(query.getQuery());
        }


    }
}
