package com.portfolio.backend.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.backend.entity.ChatMessage;
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

List
findByConversationIdOrderByTimestampAsc(String conversationId);
}

