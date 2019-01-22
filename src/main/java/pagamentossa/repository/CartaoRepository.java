package pagamentossa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pagamentossa.domain.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {
	
	public Optional<Cartao> findById(Long id);

}