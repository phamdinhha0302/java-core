public class Birl extends  Animal implements Flyable, java.lang.Runnable {

    @Override
    public void makeSound() {
        System.out.println("liu lo..");
    }

    @Override
    public void fly() {
        System.out.println("birl is flying...");
    }

    @Override
    public void run() {
        System.out.println("birl can run...");
    }
}
