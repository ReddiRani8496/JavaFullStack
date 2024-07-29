package oe;

import java.io.Serializable;

public class OrderItem implements Serializable
{
  private int lineNbr;
  private int quantity;
  private double unitPrice;
  private Product product;
  
  
    public OrderItem(Product newProduct) {
        this.product = newProduct;
        this.quantity = 1;
        if (product != null) {
            this.unitPrice = product.getRetailPrice();
        } else {          
            this.unitPrice = 0.0; 
        }
    }


  public int getLineNbr() 
  {
    return lineNbr;
  }

  public int getQuantity() 
  {
    return quantity;
  }

  public double getUnitPrice()
  {
    return unitPrice;
  }

  public double getItemTotal()
  {
    return quantity * unitPrice;
  }

  public void setLineNbr(int newLineNbr)
  {
    lineNbr = newLineNbr;
  }

  public void setQuantity(int newQuantity)
  {
    quantity = newQuantity;
  }

  public void setUnitPrice(double newUnitPrice)
  {
    unitPrice = newUnitPrice;
  }

//  4b
  public String toString()
  {
//      System.out.println("Output");
    return product +" "+ lineNbr + " " + quantity + " $" + Util.toMoney(getItemTotal())
            +  Util.toMoney(getTax());
  }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
    
    public double getTax() {
        double itemTax = 0.0;
        if(product instanceof Taxable) {
            itemTax = ((Taxable) product).getTax(getItemTotal());
        }
        return itemTax;
    }
}
