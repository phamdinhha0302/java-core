public class OutputDemo {
    //  \t --> tab
    // \n --> xuống dòng
    // %d --> số nguyên
    // %f --> số thực
    // %s --> String
    // %c --> kí tự char
    // %n --> xuống dòng



    public static void main(String[] args) {
        //  căn lề
        System.out.printf("| %8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abcxcvdfs");
        // làm tròn số
        System.out.printf(" PI = %.3f%n", 3.1415);
        // nhóm 3 số
        System.out.printf(" PI = %,3d%n", 345331415);
        // in hoa
        // %S , %C
        System.out.printf("ten %S","ha");
    }
}
