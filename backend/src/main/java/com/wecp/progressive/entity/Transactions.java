package com.wecp.progressive.entity;
import java.util.Date;
 
public class Transactions {
    
    private int transactionId;
   
    private int accountId;
 
    private Double amount;
 
    private Date transactionDate;
 
    private String transactionType;
 
    public Transactions() {
    }
 
    public Transactions(int transactionId, int accountId, Double amount, Date timeStamp, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = timeStamp;
        this.transactionType = transactionType;
    }
 
    public int getTransactionId() {
        return transactionId;
    }
 
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
 
    public int getAccountId() {
        return accountId;
    }
 
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
 
    public Double getAmount() {
        return amount;
    }
 
    public void setAmount(Double amount) {
        this.amount = amount;
    }
 
    public Date getTransactionDate() {
        return transactionDate;
    }
 
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
 
    public String getTransactionType() {
        return transactionType;
    }
 
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}