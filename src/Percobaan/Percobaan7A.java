package Percobaan;

public class Percobaan7A {
    public static void main(String[] args) {
        Integer y = new Integer(567);
        y++;
        System.out.println("y = " + y );
        int x = y.intValue(); // Auto-unboxing
        System.out.println("x = " + x);
        x++;
        y = new Integer(x);
        System.out.println(" y =" + y);
    }
}
