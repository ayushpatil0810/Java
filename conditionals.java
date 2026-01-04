public class conditionals {
    public static void main(String[] args) {
        int age = 19;
        int y = 30;

        // if(age > 18 && age <= 20) 
        //     System.out.println("Eligible for voting");
        
        if (age > y)
            System.out.println(age);
        else
            System.out.println(y);

        // && -> and operator
        // || -> or operator


        int a = 2;
        int b = 6;
        int c = 9;


        if (a > b && a > c) 
            System.out.println(a);
        else if (b > a && b > c) 
            System.out.println(b);
        else 
            System.out.println(c);
    }
}