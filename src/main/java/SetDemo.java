import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(1);
        set2.add(6);
        set2.add(2);
        set2.add(4);
        System.out.println(set2);
    }
}
