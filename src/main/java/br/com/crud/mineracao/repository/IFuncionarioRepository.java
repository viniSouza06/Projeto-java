package br.com.crud.mineracao.repository;

import br.com.crud.mineracao.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IFuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<FuncionarioModel> findByEmail(String email);
    boolean existsByEmail(String email);
}
