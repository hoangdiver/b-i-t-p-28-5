package advance.dev.model;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    // Constructor
    public Sach(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    // Getter and Setter methods
    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
