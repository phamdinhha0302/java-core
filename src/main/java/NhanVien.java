public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioitinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioitinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
