public class AbstractionDemo {
    public static void main(String[] args) {
       // tính trừ tượng
       // 1. không thểkhoiwrir tạo đối tượng từ abstract class
       // 2. class con phải là abstract
        // hoặc phải triển khai abstract method của class cha
        // 3.abstract class có thể không có abstract method nào
        // ỉnterface
        // mặc định method : public abstruct
        // - không có contructor
        // - không thể khởi tạo đối tượng
        // từ khóa : implement
        // đa kế thừa
        Cat cat = new Cat();
        cat.makeSound();
        Birl birl = new Birl();
        birl.fly();
    }

}
