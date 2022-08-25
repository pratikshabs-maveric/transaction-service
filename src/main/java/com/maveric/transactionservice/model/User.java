package com.maveric.transactionservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
public class User {
    private int uniqueId;

    private String type;

    private Number amount;

    private String accountId;

    private Date createdAt;

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User(int uniqueId, String type, Number amount, String accountId, Date createdAt) {
        this.uniqueId = uniqueId;
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.createdAt = createdAt;
    }
}
