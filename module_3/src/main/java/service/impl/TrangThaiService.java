package service.impl;

import model.TrangThai;
import repository.ITrangThaiRepository;
import repository.impl.TrangThaiRepository;
import service.ITrangThaiService;

import java.util.List;

public class TrangThaiService implements ITrangThaiService {
    private final ITrangThaiRepository trangThaiRepository =new TrangThaiRepository();

    @Override
    public List<TrangThai> getAllTrangThai() {
        return this.trangThaiRepository.getAllTrangThai();
    }
}
