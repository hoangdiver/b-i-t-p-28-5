package advance.dev.dao;

import advance.dev.model.TaiLieu;
import advance.dev.manager.IManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
    private List<TaiLieu> taiLieuList = new ArrayList<>();

    @Override
    public void add(TaiLieu tl) {
        taiLieuList.add(tl);
    }

    @Override
    public void print() {
        for (TaiLieu tl : taiLieuList) {
            System.out.println("Ma Tai Lieu: " + tl.getMaTaiLieu() + ", Ten Nha Xuat Ban: " + tl.getTenNhaXuatBan() + ", So Luong Phat Hanh: " + tl.getSoLuongPhatHanh());
        }
    }

    @Override
    public void sortByName(int order) {
        if (order == 1) {
            Collections.sort(taiLieuList, Comparator.comparing(TaiLieu::getTenNhaXuatBan));
        } else if (order == -1) {
            Collections.sort(taiLieuList, Comparator.comparing(TaiLieu::getTenNhaXuatBan).reversed());
        } else {
            throw new IllegalArgumentException("Order must be 1 (ascending) or -1 (descending)");
        }
    }
}
