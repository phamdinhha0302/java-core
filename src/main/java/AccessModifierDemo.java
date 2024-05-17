import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // public : truy cap tu moi noi
        Dog dog = new Dog();
        dog.age = 3 ;
        System.out.println("dog.age = " + dog.age);
        // protected : có thể truy cập được trong cùng package
        // dèault
        // private : chỉ truy cập trong class
    }
}
