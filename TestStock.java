public class TestStock {
   public static void main (String [] args) {
      // Create a Stock object with symbol "ORCL" and name "Oracle Corporation"
      Stock stock = new Stock("ORCL", "Oracle Corporation");
      
      // Set previous closing price and current price of the stock
      stock.previousClosingprice = 34.6;
      stock.currentPrice = 34.35;
      
      // Display stock details
      System.out.println("Stock: " + stock.name + " (" + stock.symbol + ")");
      
      // Display previous closing price with formatted output
      System.out.printf("Previous Closing Price: RM %.2f\n", stock.previousClosingprice);
      
      // Display current price of the stock
      System.out.println("Current Price: RM" + stock.currentPrice);
      
      // Display the price change percentage with formatted output
      System.out.printf("Price Change Percentage: %.2f%%\n", stock.getChangePercent());
   }
}
