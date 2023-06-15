package br.com.helberfood.pagamentos.repository;

import br.com.helberfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentosRepository extends JpaRepository<Pagamento, Long> {
}
