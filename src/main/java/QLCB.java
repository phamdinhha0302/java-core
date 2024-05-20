import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themCanBo(){

        System.out.println(" 1. Công nhân ");
        System.out.println(" 2. Kỹ sư ");
        System.out.println(" 3. Nhân viên");
        System.out.println("chon loai can bo muon them");
        String menu = scanner.nextLine();
        if(menu.equals("1")){
            CongNhan congNhan = nhapVaoCongNhan();
            canBoList.add(congNhan);
        } else if (menu.equals("2")){
            KySu kySu = nhapVaoKySu();
            canBoList.add(kySu);
        } else if(menu.equals("3")){
            NhanVien nhanVien = nhapVaoNhanVien();
            canBoList.add(nhanVien);
        }
    }
    private CongNhan nhapVaoCongNhan(){
        System.out.println(" Mời bạn nhập vào thông tin công nhân");
        System.out.println("Nhập vào họ tên");
        String hoTen = scanner.nextLine();

    }
}
