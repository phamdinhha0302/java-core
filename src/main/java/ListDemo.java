import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();

        //thêm phần tử vào cuối
        list1.add("con bò");
        list1.add("con trâu");
        //thêm vào vị trí bất kì
        list1.add(1,"con mèo");
        // kích thước
        System.out.println("list1.size() = " + list1.size());
        //kiểm tra rỗng
        System.out.println("list1.isEmpty() = " + list1.isEmpty());
        // kiểm tra chức phần tử
        System.out.println("list1.contains(\"con chó\") = " + list1.contains("con chó"));
        // lấy ra chỉ số
        System.out.println("list1.indexOf(\"con bò\") = " + list1.indexOf("con bò"));
        // truy cập theo chỉ số
        System.out.println("list1.get(2) = " + list1.get(2));
        // xóa theo chỉ số
        list1.remove(2);
        // xóa theo dối tượng
        list1.remove("con bò");
        // xóa toàn bộ
        list1.clear();
        // xóa theo điều kiện
        list1.removeIf(animal -> animal.length() > 5);
        System.out.println(list1);
    }
}
