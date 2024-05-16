public class WrapperClassDemo {
    public static void main(String[] args) {
        // byte     ==>     Byte
        // short    -->     Short
        // int      -->     Integer
        // float    -->     Float
        // double   -->     Double
        // long     -->     Long
        // char     -->     Character
        // boolean  -->     Bloolean
     // boxing : primave --> wrapper class
         Integer a = Integer.valueOf(100);
     // unboxing : wrapper class --> primave
        int b = a.intValue();

    }
}
