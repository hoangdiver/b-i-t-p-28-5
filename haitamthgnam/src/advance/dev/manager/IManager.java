package advance.dev.manager;

import advance.dev.model.TaiLieu;

public interface IManager {
    void add(TaiLieu tl); // Thêm tài liệu
    void print(); // In danh sách tài liệu
    void sortByName(int order); // Sắp xếp tên
}
