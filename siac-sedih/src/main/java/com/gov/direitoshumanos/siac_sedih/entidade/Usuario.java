package com.gov.direitoshumanos.siac_sedih.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Dados Pessoais
    private String nome;
    private String cpf;

    //Dados de Acesso

}
