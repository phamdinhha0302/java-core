public class StringDemo {
    public static void main(String[] args) {
        // Primitive
        String s1 = "abc";
        String s2 = "abc";
        // non primitive
        String s3 = new String("abc");
        String s4 = new String("abc");
        // == so sánh địa chỉ
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        // equals : so sánh giá trị
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
