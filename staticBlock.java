class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("calls static block only once");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("Constructor is being called every time");
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}


public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Smartphone";

        // Mobile obj2 = new Mobile();

        Class.forName("Mobile"); //loads a Class

    }
}
