public class Demo {
    public static void main(String[] args) {
        //1. default constructor 
        //it initializes your atributes (variables) with default values
        Circle C1 = new Circle();
        Circle C2 = new Circle();
        Circle C3 = new Circle(5.0);
        Circle C4 = new Circle(4,"blue");

        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());
        System.out.println(C4.toString());
        C2.setRadius(3);
        C2.setColor("pink");
        C3.setColor("yellow");

        
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        
    
        System.out.println(C1.getArea());
        System.out.println(C2.getArea());
        System.out.println(C3.getArea());
        System.out.println(C4.getArea());
    }
}
