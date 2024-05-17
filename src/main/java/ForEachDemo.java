public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = { 3,4,5,6 };
        // number tượng trung cho các biến trong mảng
        for ( int number : numbers){
            System.out.println("number = "+number);
        }
    }
}
