package com.java8practice.model;

public class Stock {

  // 資料年月
  private String dataMonth;

  // 張數
  private int share;

  // 單價
  private int unitPrice;

  public Stock(String dataMonth, int share, int unitPrice) {
    this.dataMonth = dataMonth;
    this.share = share;
    this.unitPrice = unitPrice;
  }



  public String getDataMonth() {
    return dataMonth;
  }

  public int getShare() {
    return share;
  }

  public int getUnitPrice() {
    return unitPrice;
  }
}
