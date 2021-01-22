package Percobaan;

// Konversi integer jadi biner,octal, dan heksa dengan wrapper

public class Percobaan3 {
    public static void main(String[] args) {
        Integer i1 = new Integer(345);
        System.out.println("Int = " + i1);
        System.out.println("Binary : "+ Integer.toBinaryString(i1) );
        System.out.println("Hexa : " + Integer.toHexString(i1));
        System.out.println("Octal : " + Integer.toOctalString(i1));

        Integer i2 = new Integer(675);
        System.out.println("Int = " + i2);
        System.out.println("Binary : "+ Integer.toString(i2,2) );
        System.out.println("Hexa : " + Integer.toString(i2,8));
        System.out.println("Octal : " + Integer.toString(i2,16));


    }
}
