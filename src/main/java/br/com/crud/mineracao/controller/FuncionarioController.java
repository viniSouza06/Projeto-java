package br.com.crud.mineracao.controller;
import br.com.crud.mineracao.service.FuncionarioService;
import br.com.crud.mineracao.model.FuncionarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController   {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<FuncionarioModel> criar(@RequestBody FuncionarioModel funcionario){

        FuncionarioModel novoFuncionario = funcionarioService.criar(funcionario);
        return ResponseEntity.ok(novoFuncionario);

    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> listar(){
        return ResponseEntity.ok(funcionarioService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(funcionarioService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioModel> atualizar(@PathVariable Long id,@RequestBody FuncionarioModel dadosAtualizados){
        return ResponseEntity.ok(funcionarioService.atualizar(id, dadosAtualizados));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }


}
