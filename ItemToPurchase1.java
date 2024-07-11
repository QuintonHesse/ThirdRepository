package lab5Shopping;

public class ItemToPurchase {
	   //Private fields - itemName, itemPrice, and itemQuanity
	   private String itemName;
	   private int itemPrice;
	   private int itemQuantity;
	   /*Default Constructor
	    itemName - Initialized to "none"
	    itemPrice - Initialized to 0
	    itemQuantity - Initialized ito 0
	   */
	public ItemToPurchase() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	//public member methods (mutators & accessors)
	   public void setName(String name) { // mutator
	      itemName = name;
	   }
	   public String getName() { //accessor
	      return itemName;
	   }
	   public void setPrice(int price) {
	      itemPrice = price;
	   }
	   public int getPrice() {
	      return itemPrice;
	   }
	   public void setQuantity(int quantity) {
	      itemQuantity = quantity;
	   }
	   public int getQuantity() {
	      return itemQuantity;
	   }
	   //setName() & getName() 
	   //setPrice() & getPrice() 
	   //setQuantity() & getQuantity() 
	   
	   //print item to purchase
	   
	   public void printItemPurchase() {
	      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
	                         " = $" + (itemPrice * itemQuantity));
	   }
	}
