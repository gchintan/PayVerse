package com.payverse.transaction_service.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
@Table(name ="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sender_Id",nullable = false)
    private Long senderId;

    @Column(name="receiver_Id",nullable = false)
    private Long receiverId;

    @Column(nullable = false)
    @Positive(message="Amount must be positive")
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private String status;

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Positive(message = "Amount must be positive") Double getAmount() {
        return amount;
    }

    public void setAmount(@Positive(message = "Amount must be positive") Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    public Transaction(Long id, String status, LocalDateTime timestamp, Double amount, Long receiverId, Long senderId) {
        this.id = id;
        this.status = status;
        this.timestamp = timestamp;
        this.amount = amount;
        this.receiverId = receiverId;
        this.senderId = senderId;
    }

    public Transaction() {
    }
}
