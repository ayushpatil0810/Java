public class TypeCastingAndConversion {
    public static void main() {
        // byte b = 127;
        // // byte b = 256; // error
        // int a = b;
        // byte k = 2;

        int a = 257;
        byte k = (byte) a; // 257 % 256(total range of the byte) -> 8
        System.out.println(k);

        float f = 8.09f;
        int t = (int) f;

        System.out.println(t); // 8


        byte x = 10;
        byte y = 3;
        int result = x * y;
        System.out.println(result);
    }
}
