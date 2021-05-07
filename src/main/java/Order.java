
public class Order {
   private Customer orderedBy ;
   private orderLine orderLine;
   private orderHeader orderHeader;
   
   public Order ()
   {
       //Composition
       this.orderLine = new orderLine();
       this.orderHeader = new orderHeader();
   }
   
    public void setOrderedBy (Customer orderedBy)
    {
        this.orderedBy = orderedBy;
    }
    
      public Customer getOrderedBy ()
    {
        return this.orderedBy;
    }
    

    public void orderByConsumer (Consumer consumer ){
         
     }

    public void orderByMerchant ( Merchent merchant){
         
     }

    
}
