package br.com.crud.mineracao.service;

import br.com.crud.mineracao.repository.IFuncionarioRepository;
import br.com.crud.mineracao.model.FuncionarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private IFuncionarioRepository funcionarioRepository;

    public FuncionarioModel criar(FuncionarioModel funcionario) {

        return funcionarioRepository.save(funcionario);
    }

    public List<FuncionarioModel> listar(){

        return funcionarioRepository.findAll();
    }

    public FuncionarioModel buscarPorId(Long id){
        return funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id não encontrado"));
    }

    public FuncionarioModel atualizar(Long id, FuncionarioModel dadosAtualizados){

        FuncionarioModel funcionarioExiste = buscarPorId(id);

        funcionarioExiste.setNome(dadosAtualizados.getNome());
        funcionarioExiste.setEmail(dadosAtualizados.getEmail());
        funcionarioExiste.setCargo(dadosAtualizados.getCargo());


        return funcionarioRepository.save(funcionarioExiste);
    }

    public void remover(Long id) {
        FuncionarioModel funcionarioExiste = buscarPorId(id);
        funcionarioRepository.delete(funcionarioExiste);
    }

}
