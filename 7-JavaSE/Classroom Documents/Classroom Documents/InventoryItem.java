/**
 *
 * @author Sai Baba
 */
class InventoryItem {
    
    float price = 5000.0f;
    
    String condition = "Available";
    
    void sayHello()
    {
        System.out.println(" Welcome to Inventory Item ");
    }
    
    public static void main(String arg[])
    {
        InventoryItem iobj = new InventoryItem();
        System.out.println(iobj);
    }
    

	@Override
    public String toString() {
        return "InventoryItem{" + "price=" + price + ", condition=" + condition + '}';
    }
    
 }