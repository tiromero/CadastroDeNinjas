package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMissoes;

    private String nome;
    private String descricao;
    private DificuldadeRank dificuldade;

    @OneToMany(mappedBy = "missoes") //Uma missao para varios ninjas //mapped é mapiar a COLUNA que estou usando la em NinjaMOdel
    private NinjaModel ninja;
}
