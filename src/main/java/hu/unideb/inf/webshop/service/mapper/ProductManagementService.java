package hu.unideb.inf.webshop.service.mapper;

import hu.unideb.inf.webshop.service.dto.ProductDto;

import java.util.List;

public interface ProductManagementService {

    ProductDto findById(Long id);

    List<ProductDto> findAll();

    ProductDto save(ProductDto product);

    void delete (Long id);
}
