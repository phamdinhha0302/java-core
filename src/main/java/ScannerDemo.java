import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " nhap vao ten cua ban ");
        String name  = scanner.nextLine();
        System.out.println("ten cua ban la "+name);
        System.out.println( " nhap vao tuoi cua ban ");
        int age = scanner.nextInt();
        System.out.println("tuoi cua ban la "+age);
    }
}
