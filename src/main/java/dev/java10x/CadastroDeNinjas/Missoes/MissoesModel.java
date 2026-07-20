package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    private String nome;
    private String descricao;
    private DificuldadeRank dificuldade;
}
