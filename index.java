public class index {

    public static void main(String[] args) {
      
    }
}

class Product{
    private String name;
    public void getname(){
        System.out.println("");
    }
    public void setName(String name){
        System.out.println("chair");
    }
    
    private double price;
    public void getprice(){
        System.out.println("");
    }
    public void setprice(double price){
        System.out.println("500");
    }
}

class book extends Product{
    private String author;
    public void getauthor(){
        System.out.println("");
    }
    public void setauthor(){
        System.out.println("John Doe");
    }
     private int pages;
    public void getpages(){
        System.out.println("");
        
    }
    public void setPages(){
        System.out.println("300");
    }
    private String name;
    public void getname(){
        System.out.println("");
    }
    public void setname(){
        System.out.println("OOP Programming");
    }
    private double price;
    public void getprice(){
        System.out.println("");
    }
    public void setprice(){
        System.out.println("250.0");
    }
}

class Electronics extends Product{
    private String brand;
    public void getbrand(){
        System.out.println("");
    }
    public void setbrand(){
        System.out.println("Samsung");
    }

    private String model;
    public void getmodel(){
        System.out.println();
    }
    public void setmodel(){
        System.out.println("Neo Qled");
    }
    private double price;
    public void getpirce(){
        System.out.println("");
    }
    public void setprice(){
        System.out.println("20000");
    }
}

class Smartphone extends Electronics{

    private String OperatingSystem;
    public void getname(){
        System.out.println();
    }
    public void setname(){
        System.out.println("Iphone");
    }
    private double price;
    public void getprice(){
        System.out.println();
    }

}
