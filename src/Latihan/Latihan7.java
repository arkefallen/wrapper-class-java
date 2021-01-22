package Latihan;

import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer num = new Integer(n);
        System.out.println("biner : " + Integer.toBinaryString(num));
        System.out.println("desimal : " + Integer.toOctalString(num));
        System.out.println("heksa : " + Integer.toHexString(num));

    }
}
