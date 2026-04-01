package com.gov.direitoshumanos.siac_sedih.usuario;

import com.gov.direitoshumanos.siac_sedih.embeddable.ComposicaoFamiliar;
import com.gov.direitoshumanos.siac_sedih.embeddable.EnderecoEmbeddable;
import com.gov.direitoshumanos.siac_sedih.enums.*;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "numero_prontuario", unique = true, nullable = false)
    private String numeroProntuario;

    //Dados Pessoais
    @Column(name = "nome_usuario", nullable = false)
    private String nome;

    @Column(name = "nome_social")
    private String nomeSocial;

    @Column(name = "tipo_documento_usuario", nullable = false)
    private String tipoDocumentoUsuario;

    @Column(name = "num_documento_usuario", unique = true, nullable = false)
    private String numeroDocumentoUsuario;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "nome_da_mae")
    private String nomeDaMae;

    @Column(name = "nome_do_pai")
    private String nomeDoPai;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "ocupacao")
    private String ocupacao;

    @Column(name = "religiao")
    private String religiao;

    @Column(name = "grau_escolaridade")
    private String grauDeEscolaridade;

    @Column(name = "faixa_de_renda")
    private String faixaDeRenda;

    @Column(name = "condicao_de_moradia")
    private String condicaoDeMoradia;

    //Dados usando as enums
    @Column(name = "recebe_beneficio", nullable = false)
    private boolean recebeBeneficio = false;

    @Column(name = "possui_deficiencia", nullable = false)
    private boolean possuiDeficiencia = false;

    @Column(name = "tipo_de_deficiencia")
    private String tipoDeDeficiencia;

    @Column(name = "tipo_de_beneficio")
    @Enumerated(EnumType.STRING)
    private TipoDeBeneficio tipoDeBeneficio;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @Enumerated(EnumType.STRING)
    private IdentidadeDeGenero identidadeDeGenero;

    @Enumerated(EnumType.STRING)
    private OrientacaoSexual orientacaoSexual;

    @Enumerated(EnumType.STRING)
    private IdentidadeRacialEtnica identidadeRacialEtnica;

    //Dados embedabble
    @Embedded
    private EnderecoEmbeddable enderecoEmbeddable;

    @Embedded
    private ComposicaoFamiliar composicaoFamiliar;

    //Dados para auditória e acompanhamento
    @Column(name = "data_de_criacao", nullable = false)
    @CreatedDate
    private LocalDateTime criadoEm;

    @Column(name = "data_de_atualizacao", nullable = false)
    @LastModifiedDate
    private LocalDateTime atualizadoEm;

    @Column(name = "criado_pelo_tecnico", nullable = false)
    @CreatedBy
    private String criadoPor;

    @Column(name = "atualizado_pelo_tecnico", nullable = false)
    @LastModifiedBy
    private String atualizadoPor;

}
