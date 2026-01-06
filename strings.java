public class strings {
    public static void main(String[] args) {
        
        char letters[] = {'P', 'a', 't', 'i', 'l'};

        String name = "Ayush";
        String name1 = new String("Ayush");
        String surname = new String(letters);

        System.out.println("Hello" + name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(name1));
        System.out.println(surname);

    }
}
