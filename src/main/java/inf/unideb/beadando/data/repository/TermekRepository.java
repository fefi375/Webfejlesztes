package inf.unideb.beadando.data.repository;

import inf.unideb.beadando.data.entity.TermekEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermekRepository extends JpaRepository<TermekEntity, Long> {


}
