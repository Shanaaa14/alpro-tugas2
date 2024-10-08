public class jawaban {
    public static void main(String[] args) {
        // Tipe data primitif
        System.out.println("A. TIPE DATA PRIMITIF");
        System.out.println("");

        // 1. byte
        byte byteValueMin = -128;
        byte byteValueMax = 127;
        System.out.println("    1. Byte: Untuk menyimpan bilangan bulat kecil");
        System.out.println("       dengan rentang nilai, Mulai Dari " + byteValueMin + ", Sampai " + byteValueMax);
        System.out.println(" ");

        // 2. short
        short shortValueMin = -32768;
        short shortValueMax = 32767;
        System.out.println("    2. Short: Untuk menyimpan bilangan bulat yang lebih besar dari byte,");
        System.out.println("       dengan rentang nilai Mulai Dari " + shortValueMin + ", Sampai " + shortValueMax);
        System.out.println("");

        // 3. int
        int intValueMin = -2147483648;
        int intValueMax	= 2147483647;
        System.out.println("    3. Int: Untuk menyimpan bilangan bulat");
        System.out.println("       dengan rentang nilai Mulai Dari " + intValueMin +", Sampai " + intValueMax);	
        System.out.println("");

        // 4. long
        long longValueMin 	= -922337203;
        long longValueMax	= 922337203;
        System.out.println("    4. Long: Untuk menyimpan bilangan bulat yang sangat besar");
        System.out.println("       dengan rentang nilai Mulai Dari " + longValueMin +"6854775808, Sampai " + longValueMax + "6854775807");	
        System.out.println("");

        // 5. float

        float floatValueMin = 1.4E-45f; 
        float floatValueMax = 3.4E+38f;
	    System.out.println("    5. Float: Untuk menyimpan nilai desimal dengan presisi tunggal");
        System.out.println("       dengan rentang nilai Mulai Dari " + floatValueMin + ", Sampai " + floatValueMax);
	    System.out.println("");

        // 6. double
        double doubleValueMin = 4.9E-324; 
        double doubleValueMax = 1.8E+30;
	    System.out.println("    6. Double: Untuk menyimpan nilai desimal dengan presisi Ganda");
        System.out.println("       dengan rentang nilai Mulai Dari " + doubleValueMin + ", Sampai " + doubleValueMax + "8");
	    System.out.println("");

        // 7. char
        char charValue = 'A';
        System.out.println("    7. Char: Tipe Data ini menyimpan karakter, Nilai: " + charValue);
        System.out.println("");

        // 8. boolean
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        System.out.println("    8. Boolean: Tipe Data: boolean, Nilai: " + booleanValue1 + " atau " + booleanValue2);
        System.out.println("");

        // Tipe data non-primitif
        System.out.println("B. TIPE DATA NON-PRIMITIF");
        System.out.println("");


        // 1. String
        String stringValue = "Hello, Java!";
        System.out.println("    1. String: Tipe Data: String, Nilai: " + stringValue);
    }
}
