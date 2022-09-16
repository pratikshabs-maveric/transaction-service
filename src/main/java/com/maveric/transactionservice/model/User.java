package com.maveric.transactionservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(collection = "users")
public class User {

    @Id
    private int _id;
    @NotBlank(message = "Id is mandatory")

    private String type;
    @NotNull(message = "Type is mandatory")


    private Number amount;
    @NotNull(message = "Amount is mandatory")


    private String accountId;
    @NotNull(message = "AccountId is mandatory")

    private Date createdAt;

    @NotNull(message = "Date is mandatory")


    public User(int _id, String type, Number amount, String accountId, Date createdAt) {
        this._id = _id;
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.createdAt = createdAt;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
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
}
