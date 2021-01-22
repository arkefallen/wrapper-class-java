package Percobaan;

// Konversi antar Wrapper

public class Percobaan4 {
    public static void main(String[] args) {
        Integer i = 7;
        Long l = 345L;

        i = l.intValue();
        System.out.println("Nilai pada Integer = " + i);

        l = i.longValue();
        System.out.println("Nilai pada Long = " + l);
    }
}

