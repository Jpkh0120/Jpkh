class Stock{
   String symbol;
   String name; 
   double previousClosingprice; 
   double currentPrice; 
   //constructor to recieve argument()
  
   Stock (String symbol, String name){
      this.symbol=symbol;
      this.name=name;
   }
   //method to calculate changePercent
   double getChangePercent(){
      double changePercent=Math.abs((currentPrice-previousClosingprice)/previousClosingprice)*100;
      return changePercent;
   }   
}
