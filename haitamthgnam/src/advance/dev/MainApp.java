package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.manager.IManager;
import advance.dev.model.Sach;
import advance.dev.model.TapChi;
import advance.dev.model.Bao;
import advance.dev.model.TaiLieu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        IManager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại tài liệu để thêm (1: Sách, 2: Tạp chí, 3: Báo, 0: Kết thúc): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            if (choice == 0) {
                break;
            }

            System.out.print("Nhập mã tài liệu: ");
            String maTaiLieu = scanner.nextLine();

            System.out.print("Nhập tên nhà xuất bản: ");
            String tenNhaXuatBan = scanner.nextLine();

            System.out.print("Nhập số lượng phát hành: ");
            int soLuongPhatHanh = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên tác giả: ");
                    String tenTacGia = scanner.nextLine();

                    System.out.print("Nhập số trang: ");
                    int soTrang = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    manager.add(new Sach(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh, tenTacGia, soTrang));
                    break;
                case 2:
                    System.out.print("Nhập số phát hành: ");
                    int soPhatHanh = scanner.nextInt();

                    System.out.print("Nhập tháng phát hành: ");
                    int thangPhatHanh = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    manager.add(new TapChi(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh, soPhatHanh, thangPhatHanh));
                    break;
                case 3:
                    System.out.print("Nhập ngày phát hành (yyyy-MM-dd): ");
                    String ngayPhatHanhStr = scanner.nextLine();
                    Date ngayPhatHanh = parseDate(ngayPhatHanhStr);

                    manager.add(new Bao(maTaiLieu, tenNhaXuatBan, soLuongPhatHanh, ngayPhatHanh));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }

        // In danh sách tài liệu
        System.out.println("Danh sách tài liệu:");
        manager.print();

        // Sắp xếp danh sách tài liệu theo tên nhà xuất bản tăng dần
        manager.sortByName(1);
        System.out.println("\nDanh sách tài liệu sau khi sắp xếp tăng dần theo tên nhà xuất bản:");
        manager.print();

        // Sắp xếp danh sách tài liệu theo tên nhà xuất bản giảm dần
        manager.sortByName(-1);
        System.out.println("\nDanh sách tài liệu sau khi sắp xếp giảm dần theo tên nhà xuất bản:");
        manager.print();
    }

    // Phương thức hỗ trợ để chuyển đổi chuỗi ngày tháng sang đối tượng Date
    private static Date parseDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
