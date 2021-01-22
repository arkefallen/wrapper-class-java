package Percobaan;

// Menampilkan nilai maksimum dan minimum wrapper class

public class Percobaan2 {
    public static void main(String[] args) {
        System.out.println("Nilai Maximum");

        Byte byteObj = new Byte(Byte.MAX_VALUE);
        System.out.println("byte " + byteObj);

        Short shortObj = new Short(Short.MAX_VALUE);
        System.out.println("short " +shortObj);

        Integer intObj = new Integer(Integer.MAX_VALUE);
        System.out.println("short " +intObj);

        Long longObj = new Long(Long.MAX_VALUE);
        System.out.println("long " +longObj);

        Float floatObj = new Float(Float.MAX_VALUE);
        System.out.println("float " +floatObj);

        Double doubleObj = new Double(Double.MAX_VALUE);
        System.out.println("double " +doubleObj);

        System.out.println("\nMinimum Value");

        Byte byteObj1 = new Byte(Byte.MIN_VALUE);
        System.out.println("byte " + byteObj1);

        Short shortObj1 = new Short(Short.MIN_VALUE);
        System.out.println("short " +shortObj1);

        Integer intObj1 = new Integer(Integer.MIN_VALUE);
        System.out.println("short " +intObj1);

        Long longObj1 = new Long(Long.MIN_VALUE);
        System.out.println("long " +longObj1);

        Float floatObj1 = new Float(Float.MIN_VALUE);
        System.out.println("float " +floatObj1);

        Double doubleObj1 = new Double(Double.MIN_VALUE);
        System.out.println("double " +doubleObj1);
    }
}
