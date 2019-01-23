package pagamentossa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pagamentossa.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
