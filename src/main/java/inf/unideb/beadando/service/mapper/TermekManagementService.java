package inf.unideb.beadando.service.mapper;

import inf.unideb.beadando.service.dto.TermekDto;

import java.util.List;

public interface TermekManagementService {

    TermekDto findById(Long id);
    List<TermekDto> findAll();
    TermekDto save(TermekDto termek);
    void delete(Long id);

    List<TermekDto> findByNev(String nev);
    List<TermekDto> findByNevDb(String nev);

}
