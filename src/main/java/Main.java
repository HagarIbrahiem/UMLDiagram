
public class Main {
    public static void main(String[] args) {
        
        Merchent _merchant = new Merchent();
        Consumer _consumer = new  Consumer();
        Product _product = new Product ();
        orderLine _orderLine = new orderLine();
        orderHeader _orderHeader = new orderHeader();
 
        //Aggregation
        ProductList _productList = new ProductList(_product);
        
        //Composition - Declaring object in Constructor of Order - Not Sure
        Order _order = new Order();
         
         
        //Association 
        _merchant.GetOrder(_order);
        _consumer.GetOrder(_order);
        
        //Inheritance
        _merchant.GetCustomerInfo();
        _consumer.GetCustomerInfo();
                
    }
}
