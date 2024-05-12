import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a);
        //  giá trị b ( 0 < b < 100 )
        int b = random.nextInt(100);
        System.out.println("b = "+b );
        String[] fruits = { "cam " , " tao" , "oi" , "le" , "dao"};
        System.out.println(fruits[random.nextInt(fruits.length)]);
    }
}
