public class Store {
  // instance fields
  String productType;
    
  // constructor method
  public Store(String product) {
    productType = product;
    System.out.println("Selling " + product + "!" );
  }
    
  // Add advertise method below
  public void advertise(){
    System.out.println("Come spend some money!" );

  }
    
}