package advance.dev.model;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soLuongPhatHanh;

    // Constructor
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soLuongPhatHanh = soLuongPhatHanh;
    }

    // Getter and Setter methods
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoLuongPhatHanh() {
        return soLuongPhatHanh;
    }

    public void setSoLuongPhatHanh(int soLuongPhatHanh) {
        this.soLuongPhatHanh = soLuongPhatHanh;
    }
}
