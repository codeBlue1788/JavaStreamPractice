import com.java8practice.model.Stock;
import com.java8practice.model.Transaction;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Java8Test {

  /**
   * 將此陣列內數值絕對值大小由大至小排列並去除重複數值轉換為List輸出
   */
  @Test
  void test1() {
    Integer[] arr = {-5, 2, -1, 2, 6, 29, 433, 129, 6, 1, -129};


  }

  /**
   * 將B開頭的輸出為一個陣列
   */
  @Test
  void test2() {
    String[] arr = {"Apple", "Cat", "Bob", "Blue", "Dog", "Bank", "Elephant"};
  }

  /**
   * 1. 按第一個字母排序由小至大，並只擷取頭兩個元素輸出為一個List 2. 按第一個字母排序由小至大，並只擷取尾兩個元素輸出為一個List
   */
  @Test
  void test3() {
    String[] arr = {"Apple", "Cat", "Bob", "Flower", "Dog", "Good", "Elephant"};

  }

  /**
   * 計算各年度的總交易額並輸出一個Map<年分,總交易額>
   */
  @Test
  void test4() {
    List<Transaction> transactions = givenTransactions();

  }

  /**
   * 找出2011年最大筆的交易額
   */
  @Test
  void test5() {
    List<Transaction> transactions = givenTransactions();

  }

  /**
   * 將交易額先按年分再按交易額由大到小排序
   */
  @Test
  void test6() {
    List<Transaction> transactions = givenTransactions();

  }

  /**
   * 將Stock物件轉換為Transaction物件，交易額等於張數*單價
   */
  @Test
  void test7() {
    List<Stock> stocks = givenStocks();

  }

  /**
   * 承上題，按照年份將交易額加總轉換為transaction物件。
   * Ex: Stock: year: 202202, share: 5 ,unitPrice: 6
   *     Stock: year: 202202, share: 4 ,unitPrice: 5
   *     轉換為 Transaction Year: 2022, amount: 50
   */
  @Test
  void test8() {
    List<Stock> stocks = givenStocks();


  }

  private List<Transaction> givenTransactions() {
    return Arrays.asList(
        new Transaction("2011", 40),
        new Transaction("2012", 20),
        new Transaction("2011", 90),
        new Transaction("2012", 10),
        new Transaction("2011", 20),
        new Transaction("2013", 50),
        new Transaction("2011", 30),
        new Transaction("2020", 20),
        new Transaction("2019", 10),
        new Transaction("2011", 20),
        new Transaction("2015", 60)
    );
  }

  private List<Stock> givenStocks() {
    return Arrays.asList(
        new Stock("202202", 5, 3),
        new Stock("201805", 6, 5),
        new Stock("201703", 4, 5),
        new Stock("202202", 5, 8),
        new Stock("202202", 5, 4),
        new Stock("202202", 6, 10),
        new Stock("201703", 5, 2),
        new Stock("201805", 5, 6),
        new Stock("202202", 5, 10),
        new Stock("202107", 8, 5)
    );
  }
}
