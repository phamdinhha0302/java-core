public class Pet {
    protected String name;
    private int age ;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run (){
        System.out.println("pet running");
    }

    public String getName() {
        return name;
    }
}
