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

class Menu {

    protected void ConvertType() {
        Scanner input = new Scanner(System.in);

        System.out.println("CONVERT FROM ");
        System.out.println("What type of data ?");
        System.out.println("1. Primitive");
        System.out.println("2. Wrapper Class");
        System.out.print("Your choice : ");

        byte typeChoice = input.nextByte();

        ConvertFrom(typeChoice);
    }

    private void ConvertFrom(byte typeChoice) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the data ?");

        if (typeChoice == 1) {
            MenuPrimitive();
        } else if (typeChoice == 2) {
            MenuWrapper();
        }
        System.out.print("Your choice");

        byte dataChoice = input.nextByte();

        ConvertControl(typeChoice, dataChoice);
    }

    private void MenuPrimitive() {
        System.out.println("1. Byte");
        System.out.println("2. Short");
        System.out.println("3. Integer");
        System.out.println("4. Float");
        System.out.println("5. Long");
        System.out.println("6. Double");
    }

    private void MenuWrapper() {
        System.out.println("1. String");
        System.out.println("2. Byte");
        System.out.println("3. Short");
        System.out.println("4. Integer");
        System.out.println("5. Float");
        System.out.println("6. Long");
        System.out.println("7. Double");
    }

    private void ConvertControl(byte typeChoice, byte dataChoice) {
        Scanner input = new Scanner(System.in);
        byte endpoint;

        System.out.println("CONVERT INTO");
        System.out.println("What is the data ?");

        if (typeChoice == 1) {
            if (dataChoice == 3) {
                System.out.println("1. String");
                System.out.println("2. Integer");

                System.out.print("Your choice :");
                endpoint = input.nextByte();

                ConvertInto(typeChoice,dataChoice,endpoint);
            } else {
                ConvertInto(typeChoice,dataChoice,(byte)1);
            }
        } else if (typeChoice == 2) {
            if (dataChoice == 1) {
                System.out.println("1. Primitive Integer");
                System.out.println("2. Wrapper Integer");

                System.out.print("Your choice :");
                endpoint = input.nextByte();

                ConvertInto(typeChoice,dataChoice,endpoint);
            } else if (dataChoice == 4) {
                System.out.println("1. Primitive Integer");
                System.out.println("2. String");
                System.out.println("3. Byte");
                System.out.println("4. Short");
                System.out.println("5. Float");
                System.out.println("6. Long");
                System.out.println("7. Double");

                System.out.print("Your choice :");
                endpoint = input.nextByte();

                ConvertInto(typeChoice,dataChoice,endpoint);
            } else {
                ConvertInto(typeChoice,dataChoice,(byte)1);
            }
        } else {
            System.out.println("Wrong numbers !");
            ConvertFrom(typeChoice);
        }
    }

    private void ConvertInto ( byte typeChoice, byte dataChoice, byte endpoint){
        Conversion convert = new Conversion();
        Scanner input = new Scanner(System.in);

        System.out.print("Input your data : ");
        if (typeChoice == 1) {
            // From Primitive Integer
            if (dataChoice == 3) {
                int data = input.nextInt();
                // Into String
                if ( endpoint == 1 ) {
                    System.out.println("Your converted data : " + convert.returnString(data));
                }
                // Into Wrapper Integer
                else System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Primitive Byte Into Wrapper Integer
            else if ( dataChoice == 1 ) {
                byte data = input.nextByte();
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Primitive Short Into Wrapper Integer
            else if ( dataChoice == 2 ) {
                short data = input.nextShort();
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Primitive Float Into Wrapper Integer
            else if ( dataChoice == 4 ) {
                float data = input.nextFloat();
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Primitive Long Into Wrapper Integer
            else if ( dataChoice == 5 ) {
                long data = input.nextLong();
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Primitive Double Into Wrapper Integer
            else  {
                double data = input.nextDouble();
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
        }
        else if ( typeChoice == 2 ) {
            // From String
            if ( dataChoice == 1 ) {
                String data = input.next();
                // Into Primitive Integer
                if ( endpoint == 1) System.out.println("Your converted data : " + convert.primitiveInt(data));
                // Into Wrapper Integer
                else System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Wrapper Integer
            else if ( dataChoice == 4 ) {
                Integer data = input.nextInt();
                // Into Primitive Integer
                if ( endpoint == 1 ) System.out.println("Your converted data : " + convert.primitiveInt(data));
                // Into String
                else if ( endpoint == 2 ) System.out.println("Your converted data : " + convert.returnString(data));
                // Into WrapperByte
                else if ( endpoint == 3 ) System.out.println("Your converted data : " + convert.wrapperByte(data));
                // Into WrapperShort
                else if ( endpoint == 4 ) System.out.println("Your converted data : " + convert.wrapperShort(data));
                // Into Wrapper Float
                else if ( endpoint == 5 ) System.out.println("Your converted data : " + convert.wrapperFloat(data));
                // Into Wrapper Long
                else if ( endpoint == 6 ) System.out.println("Your converted data : " + convert.wrapperLong(data));
                // Into Double
                else if ( endpoint == 7 ) System.out.println("Your converted data : " + convert.wrapperDouble(data));
            }
            // From Wrapper Byte
            else if ( dataChoice == 2 ) {
                // Into Wrapper Integer
                Byte data = new Byte(input.nextByte());
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Wrapper Short
            else if ( dataChoice == 3 ) {
                // Into Wrapper Integer
                Short data = new Short(input.nextShort());
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Wrapper Float
            else if ( dataChoice == 5 ) {
                // Into Wrapper Integer
                Long data = new Long(input.nextLong());
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Wrapper Double
            else if ( dataChoice == 7 ) {
                // Into Wrapper Integer
                Double data = new Double(input.nextByte());
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
            // From Wrapper Long
            else if ( dataChoice == 6 ) {
                // Into Wrapper Integer
                Long data = new Long(input.nextLong());
                System.out.println("Your converted data : " + convert.returnWrapperInt(data));
            }
        }
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