public class EncapsudationDemo {
    // tính đóng gói
    // 1. thêm private cho tất cả thuộc tính
    // 2. truy cập thông qua getter / setter

    public static void main(String[] args) {
        Student student = new Student("ha");
        System.out.println("student = " + student);
    }
}
