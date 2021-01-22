package Percobaan;

public class Percobaan5 {
    public static void main(String[] args) {

        // Rotate left : menggeser nilai sebanyak distance ke kiri saat didalam representasi biner
        System.out.println(Integer.rotateLeft(3,1));
        System.out.println(Integer.rotateLeft(5,2));

        // Rotate left : menggeser nilai sebanyak distance ke kanan saat didalam representasi biner
        System.out.println(Integer.rotateRight(20,1));
        System.out.println(Integer.rotateRight(32,1));


        System.out.println(Integer.reverse(20));

        // Highest One Bit : mengembalikan nilai bit tertinggi
        System.out.println(Integer.highestOneBit(20));

        // Lowest One Bit : mengembalikan nilai bit terendah
        System.out.println(Integer.lowestOneBit(20));

        // Bit count : Menghitung banyaknya bit
        System.out.println(Integer.bitCount(20));

        // Meqnghitung banyaknya 0 pada angka sebelum bit tertinggi lalu dikurangi dengan kelipatan 16 terdekat
        System.out.println(Integer.numberOfLeadingZeros(32));

        // Menghitung banyaknya 0 pada angka sebelum bit terendah
        System.out.println(Integer.numberOfTrailingZeros(32));
    }
}
