package org.mishrashu.supporting.classes;

import java.util.Date;

public class Transaction {

  Integer id;
  Date transactionDate;
  Double amount;


  public Transaction(Integer id, Date transactionDate, Double amount) {
    this.id = id;
    this.transactionDate = transactionDate;
    this.amount = amount;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
