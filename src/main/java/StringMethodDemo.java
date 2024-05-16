public class StringMethodDemo {
    public static void main(String[] args) {
       String s = " abca ";
       String sear = " sdf  ";
       String name = " pham dinh ha";
       // chuyển kí tự thành thường
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        // chuyển kí tự thành hoa
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.isBlank() = " + s.isBlank());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("s.contains(\"ab\") = " + s.contains("ab"));
        System.out.println("sear.trim() = " + sear.trim());
        String[] words = name.split(" ");
        for (String word : words){
            System.out.println("word = " + word);
        }
        System.out.println("s.substring(0,3) = " + s.substring(0, 3));
    }
}
