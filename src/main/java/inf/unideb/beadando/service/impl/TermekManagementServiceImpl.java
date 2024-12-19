package inf.unideb.beadando.service.impl;

import inf.unideb.beadando.service.dto.TermekDto;
import inf.unideb.beadando.service.mapper.TermekManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermekManagementServiceImpl implements TermekManagementService {

    @Override
    public TermekDto findById(Long id) {
        return null;
    }

    @Override
    public List<TermekDto> findAll() {
        return null;
    }

    @Override
    public TermekDto save(TermekDto termek) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TermekDto> findByNev(String nev) {
        return null;
    }

    @Override
    public List<TermekDto> findByNevDb(String nev) {
        return null;
    }
}
