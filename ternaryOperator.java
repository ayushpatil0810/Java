public class ternaryOperator {
    public static void main(String[] args) {
        int n = 10;
        boolean result = false; 
        if(n % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        result = (n % 2 == 0) ? true : false;


    }
}
