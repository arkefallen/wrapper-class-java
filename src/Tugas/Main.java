package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char decision;
        Menu menu = new Menu();

        do {
            System.out.println("Conversion Program");
            menu.ConvertType();

            System.out.print("Do you still wanna convert data again ? ");
            decision = input.next().charAt(0);
        } while (validateLoop(decision));
    }

    static boolean validateLoop(char decision) {
        return decision == 'y';
    }
}

class Conversion {

    public Integer returnWrapperInt(byte num) { return Integer.valueOf(num); }
    public Integer returnWrapperInt(short num) { return Integer.valueOf(num); }
    public Integer returnWrapperInt(int num) { return Integer.valueOf(num); }
    public Integer returnWrapperInt(double num) { return Integer.valueOf((int)num); }
    public Integer returnWrapperInt(float num) { return Integer.valueOf((int)num); }
    public Integer returnWrapperInt(long num) { return Integer.valueOf((int)num); }
    public Integer returnWrapperInt(String data) { return Integer.valueOf(data); }
    public Integer returnWrapperInt(Byte num) {
        int converted = num.intValue();
        return Integer.valueOf(converted);
    }
    public Integer returnWrapperInt(Short num) {
        int converted = num.intValue();
        return Integer.valueOf(converted);
    }
    public Integer returnWrapperInt(Float num) {
        int converted = num.intValue();
        return Integer.valueOf(converted);
    }
    public Integer returnWrapperInt(Long num) {
        int converted = num.intValue();
        return Integer.valueOf(converted);
    }
    public Integer returnWrapperInt(Double num) {
        int converted = num.intValue();
        return Integer.valueOf(converted);
    }

    public String returnString(int num) { return String.valueOf(num); }
    public String returnString(Integer num) {
        int converted = num.intValue();
        return String.valueOf(converted);
    }

    public int primitiveInt(Integer num) { return num.intValue(); }
    public int primitiveInt(String data) { return Integer.parseInt(data); }

    public byte primitiveByte(Integer num) { return num.byteValue(); }
    public Byte wrapperByte(Integer num) {
        byte data = num.byteValue();
        return Byte.valueOf(data);
    }

    public short primitiveShort(Integer num) { return num.shortValue(); }
    public Short wrapperShort(Integer num) {
        short data = num.shortValue();
        return Short.valueOf(data);
    }

    public float primitiveFloat(Integer num) { return num.floatValue(); }
    public Float wrapperFloat(Integer num) {
        float data = num.floatValue();
        return Float.valueOf(data);
    }

    public long primitiveLong(Integer num) { return num.longValue(); }
    public Long wrapperLong(Integer num) {
        long data = num.longValue();
        return Long.valueOf(data);
    }

    public double primitiveDouble(Integer num) { return num.doubleValue(); }
    public Double wrapperDouble(Integer num) {
        double data = num.doubleValue();
        return Double.valueOf(data);
    }
}