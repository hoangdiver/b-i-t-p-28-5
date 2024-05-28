package advance.dev.manager;

import advance.dev.model.TaiLieu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManager implements IManager {
    private List<TaiLieu> taiLieus = new ArrayList<>();

    @Override
    public void add(TaiLieu tl) {
        taiLieus.add(tl);
    }

    @Override
    public void print() {
        for (TaiLieu tl : taiLieus) {
            System.out.println("Ma Tai Lieu: " + tl.getMaTaiLieu() + ", Ten Nha Xuat Ban: " + tl.getTenNhaXuatBan() + ", So Luong Phat Hanh: " + tl.getSoLuongPhatHanh());
        }
    }

    @Override
    public void sortByName(int order) {
        if (order == 1) {
            Collections.sort(taiLieus, Comparator.comparing(TaiLieu::getTenNhaXuatBan));
        } else if (order == -1) {
            Collections.sort(taiLieus, Comparator.comparing(TaiLieu::getTenNhaXuatBan).reversed());
        } else {
            throw new IllegalArgumentException("Order must be 1 (ascending) or -1 (descending)");
        }
    }
}
