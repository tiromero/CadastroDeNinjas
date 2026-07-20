package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //criando construtor sem argumentos
@AllArgsConstructor // criando construtores com argumentos
@Data //criando getters e setters
public class NinjaModel {
    private String nome;

    @Column(unique = true) //Criando um email unico para 1 usario
    private String email;
    private int idade;

}
