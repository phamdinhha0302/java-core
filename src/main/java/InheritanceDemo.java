public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        // mục đích : tái sử dụng code
        // từ khóa : extends
        // Đơn kế thừa
        Dog dog = new Dog("cho",3);
        dog.run();
        // this : tham chiếu đến class đó
        // super : tham chiếu đến class cha
    }
}
