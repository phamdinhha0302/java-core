public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioitinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioitinh, diaChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", gioitinh=" + gioitinh +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
