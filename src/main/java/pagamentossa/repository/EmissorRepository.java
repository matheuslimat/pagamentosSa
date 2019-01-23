package pagamentossa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pagamentossa.domain.Emissor;

@Repository
public interface EmissorRepository extends JpaRepository<Emissor, Long>{

}
