package Ex05TypeCasting;

public class Type_Casting_intques {
    public static void main(String[] args) {
        byte b = 10;
//        int a = b; // Valid - > Implicit Casting- Automatically
        int a = (int)b; // Valid - > Explicit Casting- Automatically
        byte c= 20;
        int d = (int)c;
        int val  = 200;
//        byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte e = (byte)val; // // // Valid -> Explicit Casting -  allowed
        // Data Loss:
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit ?
    }
}
