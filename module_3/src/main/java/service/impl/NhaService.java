package service.impl;

import model.Nha;
import repository.INhaRepository;
import repository.impl.NhaRepository;
import service.INhaService;

import java.util.List;

public class NhaService implements INhaService {
    private final INhaRepository nhaRepository = new NhaRepository();
    @Override
    public List<Nha> selectAllNha() {
        return this.nhaRepository.selectAllNha();
    }

    @Override
    public Nha selectNha(int id) {
        return null;
    }

    @Override
    public boolean insertNha(Nha nha) {
        return this.nhaRepository.insertNha(nha);
    }

    @Override
    public boolean deleteNha(int id) {
        return this.nhaRepository.deleteNha(id);
    }

    @Override
    public boolean editNha(int id, Nha nha) {
        return false;
    }

    @Override
    public List<Nha> search(String name, int tenLoaiPhong, int tenTrangThai) {
        return this.nhaRepository.search(name,tenLoaiPhong,tenTrangThai);
    }
}
