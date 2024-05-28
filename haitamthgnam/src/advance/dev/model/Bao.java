package advance.dev.model;

import java.util.Date;

public class Bao extends TaiLieu {
    private Date ngayPhatHanh;

    // Constructor
    public Bao(String maTaiLieu, String tenNhaXuatBan, int soLuongPhatHanh, Date ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    // Getter and Setter methods
    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
