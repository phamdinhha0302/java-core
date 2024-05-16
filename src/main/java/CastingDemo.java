public class CastingDemo {
    public static void main(String[] args) {
        // widenting
        // byte - short - int - long - float - double
        int a = 1000;
        long b = a ;
        // narrowing
        // double - float - long - int - short - byte
        long x = 8000000l;
        int y = (int) x ;
        System.out.println(y);
        int u = 1 ;
        int v = 2 ;
        System.out.println( u / (float)v );
    }
}
