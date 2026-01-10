class Mobile {
    String brand;
    int price;
    String network;
    // static String name = "Smartphone";
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticKeyword {
    public static void main(String[] args) {

        Mobile.name = "Smartphone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name = "SmartPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name = "SmartPhone";
        
        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
