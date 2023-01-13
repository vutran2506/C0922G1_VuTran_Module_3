package service;

import model.Nha;

import java.util.List;

public interface INhaService {
    List<Nha> selectAllNha();
    Nha selectNha(int id);
    boolean insertNha(Nha nha);
    boolean deleteNha(int id);
    boolean editNha(int id, Nha nha);
    List<Nha> search(String name, int tenLoaiPhong, int tenTrangThai);
}
