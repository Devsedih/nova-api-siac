package com.gov.direitoshumanos.siac_sedih.enums;

public enum TipoDaAcaoHistoricoAtendimento {

    CRIACAO("Criação do Atendimento"),
    EDICAO("Edição do Atendimento"),
    MUDANCA_STATUS("Mudança de Status"),
    ADICAO_DESCRICAO("Adição de Descrição"),
    ATRIBUICAO_TECNICO("Atribuição para Técnico"),
    ADICAO_ANEXO("Adição de Anexo"),
    REMOCAO_ANEXO("Remoção de Anexo");

    private final String descricao;

    TipoDaAcaoHistoricoAtendimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
