class Calculator {

    int a;

    public int add(int a, int b) {
        
        return a + b;
    }
    
}

public class OOP {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        int result = calc.add(4, 6);
        System.out.println(result);
    }
}
