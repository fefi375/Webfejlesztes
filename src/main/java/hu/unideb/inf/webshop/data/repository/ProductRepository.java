package hu.unideb.inf.webshop.data.repository;

import hu.unideb.inf.webshop.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
