public class Student {
    private String name;
    private int age;
    public static int count;
    public Student( String name , int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
