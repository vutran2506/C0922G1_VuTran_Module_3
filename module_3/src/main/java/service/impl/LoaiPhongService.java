package service.impl;

import model.LoaiPhong;
import repository.ILoaiPhongRepository;
import repository.impl.LoaiPhongRepository;
import service.ILoaiPhongService;

import java.util.List;

public class LoaiPhongService implements ILoaiPhongService {
    private final ILoaiPhongRepository loaiPhongRepository = new LoaiPhongRepository();
    @Override
    public List<LoaiPhong> getAllLoaiPhong() {
        return this.loaiPhongRepository.getAllLoaiPhong();
    }
}
