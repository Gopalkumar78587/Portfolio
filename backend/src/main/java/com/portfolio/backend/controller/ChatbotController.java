package com.portfolio.backend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.dto.ChatRequest;
import com.portfolio.backend.service.ChatService;
import com.portfolio.backend.service.ChatbotService;

@RestController
@RequestMapping("/api/chatbot")
@CrossOrigin
public class ChatbotController {

    private final ChatbotService bot;
    private final ChatService chat;

    public ChatbotController(ChatbotService bot, ChatService chat) {
        this.bot = bot;
        this.chat = chat;
    }

    @PostMapping("/ask")
    public ResponseEntity<?> ask(@RequestBody ChatRequest req) {

        chat.save(req.getConversationId(), "USER", req.getMessage());

        String reply = bot.reply(req.getMessage());

        chat.save(req.getConversationId(), "BOT", reply);

        return ResponseEntity.ok(Map.of("reply", reply));
    }
}

