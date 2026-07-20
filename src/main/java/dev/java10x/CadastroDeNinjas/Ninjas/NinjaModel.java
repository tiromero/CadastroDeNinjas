package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Entity ele transforma uma Classe comum em uma entidade do Banco de Dados (tabela)
@Table( name = "tb_cadastro")
@NoArgsConstructor //criando construtor sem argumentos
@AllArgsConstructor // criando construtores com argumentos
@Data //criando getters e setters
public class NinjaModel {
    @Id //Pegar o atributo abaixo (Long id) e transformar em ID na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //organizar estregicamente por id
    private Long id;

    private String nome;

    @Column(unique = true) //Criando um email unico para 1 usario
    private String email;
    private int idade;

}
