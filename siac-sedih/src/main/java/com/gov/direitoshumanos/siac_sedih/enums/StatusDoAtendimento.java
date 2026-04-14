package com.gov.direitoshumanos.siac_sedih.enums;

public enum StatusDoAtendimento {

    EM_ABERTO("Em Aberto"),
    AGUARDANDO_RETORNO("Aguardando Retorno"),
    EM_ANDAMENTO("Em Andamento"),
    CONCLUIDO("Concluído"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusDoAtendimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLabel() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
