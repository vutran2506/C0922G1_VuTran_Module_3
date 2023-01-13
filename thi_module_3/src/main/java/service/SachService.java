package service;

import model.Sach;
import repository.ISachRepository;
import repository.SachRepository;

import java.util.List;

public class SachService implements ISachService{
    private  final ISachRepository sachRepository = new SachRepository();
    @Override
    public List<Sach> getAllSach() {
        return this.sachRepository.getAllSach();
    }
}
