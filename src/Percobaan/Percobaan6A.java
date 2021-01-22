package Percobaan;

// Unboxing : konversi dari wrapper ke primitive dengan diassign ke variabel baru

public class Percobaan6A {
    public static void main(String[] args) {
        int i;
        Integer j;
        i = 1;
        j = new Integer(2);

        i = j.intValue(); // Auto-unboxing

        j = new Integer(i);
    }
}
