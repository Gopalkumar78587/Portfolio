package com.portfolio.backend.service;

import org.hibernate.mapping.List;
import org.springframework.stereotype.*;

import com.portfolio.backend.entity.ChatMessage;
import com.portfolio.backend.repository.ChatMessageRepository;

@Service
public class ChatService {

    private final ChatMessageRepository repo;

    public ChatService(ChatMessageRepository repo) {
        this.repo = repo;
    }

    public ChatMessage save(String cid, String sender, String msg) {
        ChatMessage cm = new ChatMessage();
        cm.setConversationId(cid);
        cm.setSender(sender);
        cm.setMessage(msg);
        return repo.save(cm);
    }

    public List getMessages(String cid) {
        return repo.findByConversationIdOrderByTimestampAsc(cid);
    }
}

