import java.util.*;

public class Lecture10_2
 {
    public static void main(String args[]){
        ArrayList<Product> cart=new ArrayList<Product>();
        Product p=new Product();

        Product q=new Product();
        q.Product_Name="Ear_Buds";
        q.Product_Price=50;
        cart.add(q);
        
        p.Product_Name="Headphone";
        p.Product_Price=15;
        cart.add(p);

        for(int i=0;i<cart.size();i++){
            System.out.println(cart.get(i).toString());

        }
        int sumOfPrices = 0;
        for(Product product : cart) {
            sumOfPrices += product.Product_Price;
        }

        System.out.println("TOTAL BILL IS: $" + sumOfPrices);
        

    }

}
class Product{
    String Product_Name;
    int Product_Price;

    @Override
    public String toString() {
        return "Product Name: " + Product_Name + ", Price: $" + Product_Price;
    }


}
