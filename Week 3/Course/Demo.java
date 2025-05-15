public class Demo {
    public static void main(String[] args) {
        TextBook JavaTextBook = new TextBook("Java: Advanced Programming", "Dietel 7 Dietel", "Pearson");
        System.out.println(JavaTextBook);

        Instructor Joey = new Instructor("Thomas","Joey","J03Y");
        System.out.println(Joey);

        Course Java = new Course("Advanced Programming using Java", Joey, JavaTextBook);
        System.out.println(Java);


    }
    
}
