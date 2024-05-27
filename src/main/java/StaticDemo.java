public class StaticDemo {
    public static void main(String[] args) {
        // static thuộc về class
        Student student1 = new Student("khoa",20);
        Student student2 = new Student("hoa",15);
        student1.count = 10;
        System.out.println("count"+ student2.count );
        // truy cập thông qua tên class
    }

}

