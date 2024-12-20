package inf.unideb.beadando.service.impl;

import inf.unideb.beadando.data.entity.TermekEntity;
import inf.unideb.beadando.data.repository.TermekRepository;
import inf.unideb.beadando.service.dto.TermekDto;
import inf.unideb.beadando.service.mapper.TermekManagementService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TermekManagementServiceImpl implements TermekManagementService {

    @Autowired
    TermekRepository repo;
    @Autowired
    ModelMapper mapper;

    @Override
    public TermekDto findById(Long id) {
        TermekEntity entity =repo.getReferenceById(id);
        TermekDto dto = new TermekDto();

        dto.setId(entity.getId());
        dto.setAr(entity.getAr());
        dto.setNev(entity.getNev());
        dto.setMennyiseg(entity.getMennyiseg());

        return dto;
    }

    @Override
    public List<TermekDto> findAll() {
        List<TermekEntity> entities = repo.findAll();
        List<TermekDto> dtos = new ArrayList<>();

        dtos = mapper.map(entities, new TypeToken<List<TermekDto>>(){}.getType());
        return dtos;
    }

    @Override
    public TermekDto save(TermekDto termek) {

        TermekEntity entity = mapper.map(termek, TermekEntity.class);
        entity= repo.save(entity);

        TermekDto dto = new TermekDto();
        dto=mapper.map(entity, TermekDto.class);

        return dto;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<TermekDto> findByNev(String nev) {
        List<TermekEntity> szurt = new ArrayList<>();

        szurt=repo.findAll().stream().filter(x -> x.getNev().contains(nev)).collect(Collectors.toList());

        return mapper.map(szurt, new TypeToken<List<TermekDto>>(){}.getType());
    }

}
