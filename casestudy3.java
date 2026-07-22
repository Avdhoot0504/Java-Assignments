import java.util.*;
class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }

}

class ShoppingCart{
    ArrayList<Product> products=new ArrayList<>();
    
    public void addproduct(Product p){
        products.add(p);
    }

    public void removeproduct(String Productname){
        for(int i=0;i<products.size();i++){
            if(products.get(i).name.equals(Productname)){
                products.remove(i);
                break;
            }
        }
    }

    double calctotalcost(){
        double sum=0;
        for(int i=0;i<products.size();i++){
            sum= sum +products.get(i).price;
        }
        return sum;
    }

    void Displaycart(){
        for(int i=0;i<products.size();i++){
            System.out.println("Product"+(i+1)+":"+ products.get(i).name);
            System.out.println("Price:"+products.get(i).price);
            System.out.println();


        }

    }
}

public class casestudy3{
    public static void main(String[] args) {
        ShoppingCart s=new ShoppingCart();
        Product p1=new Product("oreo",10);
        Product p2=new Product("parle",10.5);
        Product p3=new Product("jim jam",20);
        Product p4=new Product("Biscoff",100);

        
        s.addproduct(p1);
        s.addproduct(p2);
        s.addproduct(p3);
        s.addproduct(p4);
        
        s.Displaycart(); 
        System.out.println("\nTotal Cost is:"+s.calctotalcost());
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product name to remove: ");
        String productName = sc.nextLine();
        s.removeproduct(productName);
        System.err.println("Product removed successfuly");
        
        System.err.println("Updated list:");
        s.Displaycart(); 
        System.out.println("\nTotal Cost is:"+s.calctotalcost());



    }

  

}

