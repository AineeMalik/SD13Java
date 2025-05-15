public class demo {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,6);
        MyPoint p2 = new MyPoint(6,8);

        System.out.println(p1);

        System.out.println(p1.distance(6,8));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
        System.out.println(p2.distance());
    }
}
