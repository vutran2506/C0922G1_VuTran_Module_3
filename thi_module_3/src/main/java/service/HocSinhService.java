package service;

import model.HocSinh;
import repository.HocSinhRepository;
import repository.IHocsinhRepository;

import java.util.List;

public class HocSinhService implements IHocSinhService{
    private final IHocsinhRepository hocsinhRepository = new HocSinhRepository();
    @Override
    public List<HocSinh> getAllHocSinh() {
        return this.hocsinhRepository.getAllHocSinh();
    }
}
