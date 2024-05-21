public class PolymorphismDemo {
    public static void main(String[] args) {
        // tính đa hình
       Runnable cat = new Cat();

        }
    static void callRun(Runnable runnable){
        runnable.run();
    }
}
