public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ayush");
        System.out.println(sb.capacity()); // 16 + 5(Ayush)
        System.out.println(sb.length()); // 5
        sb.append(" Patil");

        String str = sb.toString(); // convert string buffer into string

        sb.delete(2, 0); // deletes u
        sb.insert(6, "Java ");

        sb.setLength(30);
        sb.ensureCapacity(20);
    }
}
