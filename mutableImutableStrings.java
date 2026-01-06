public class mutableImutableStrings {
    public static void main(String[] args) {
        
        //both strings are created at same memory location, and variable m and n are pointing towards the same location in the string constant pool
        String n = "Ayush";
        String m = "Ayush";
        System.out.println(n == m);

         n = "ayush";
         System.out.println(m);
    }
}
