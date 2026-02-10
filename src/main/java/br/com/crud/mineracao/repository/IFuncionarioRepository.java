package br.com.crud.mineracao.repository;

import br.com.crud.mineracao.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}
