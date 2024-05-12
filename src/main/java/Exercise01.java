public class Exercise01 {


    void question01(){
        Department department = new Department();
        department.name = "bao ve";
        Account account = new Account();
        account.department = department;
        if ( account.department == null){
            System.out.println("nhan vien nay chua co phong ban");
        }else {
            System.out.println("Phong ban cua nhan vien nay la "+account.department.name);
        }
    }
}
