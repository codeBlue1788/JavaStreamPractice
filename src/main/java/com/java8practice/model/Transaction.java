package com.java8practice.model;

public class Transaction {

  // 年份
  private String year;

  // 交易額
  private int amount;

  public Transaction(String year, int amount) {
    this.year = year;
    this.amount = amount;
  }

  public Transaction() {
  }

  public void setYear(String year) {
    this.year = year;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getYear() {
    return year;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "year='" + year + '\'' +
        ", amount=" + amount +
        '}';
  }
}
