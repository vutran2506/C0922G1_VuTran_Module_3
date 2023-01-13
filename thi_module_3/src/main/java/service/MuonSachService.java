package service;

import model.MuonSach;
import repository.IMuonSachRepository;
import repository.MuonSachRepository;

import java.util.List;

public class MuonSachService implements IMuonSachService{
    private final IMuonSachRepository muonSachRepository = new MuonSachRepository();
    @Override
    public List<MuonSach> selectMuonSach() {
        return this.muonSachRepository.selectMuonSach();
    }
}
