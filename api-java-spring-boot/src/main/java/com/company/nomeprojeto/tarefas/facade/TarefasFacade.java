package com.company.nomeprojeto.tarefas.facade;

import com.company.nomeprojeto.tarefas.dto.TarefaDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TarefasFacade {
    private static final Map<int, TarefaDTO> tarefas = new HashMap<>();

    public TarefaDTO criar(TarefaDTO tarefaDTO){
        int proximoId = tarefas.keySet().size() + 1;
        tarefaDTO.setId(proximoId);
        tarefas.put(proximoId, tarefaDTO);
        return tarefaDTO;
    }

    public TarefaDTO atualizar(TarefaDTO tarefaDTO, int tarefaId) {
        tarefas.put(tarefaId, tarefaDTO);
        return tarefaDTO;
    }

    public TarefaDTO getById(int tarefaId) {
        return tarefas.get(tarefaId);
    }

    public List<TarefaDTO> getAll () {
        return new ArrayList<>(tarefas.values());
    }
    
    public String delete(int tarefaId) {
        tarefas.remove(tarefaId);
        return "Deleted";
    }
}
