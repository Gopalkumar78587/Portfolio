package com.portfolio.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.dto.ChatRequest;
import com.portfolio.backend.service.ChatService;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestBody ChatRequest req) {
        return ResponseEntity.ok(
            chatService.save(
                req.getConversationId(),
                req.getSender(),
                req.getMessage()
            )
        );
    }

    @GetMapping("/messages/{cid}")
    public ResponseEntity<?> messages(@PathVariable String cid) {
        return ResponseEntity.ok(chatService.getMessages(cid));
    }
}

