package com.gov.direitoshumanos.siac_sedih.entidade.enums;

public enum TipoDeBeneficio {

    NAO_RECEBE("Não Recebe"),
    BOLSA_FAMILIA("Bolsa Família"),
    APOSENTADORIA("Aposentadoria"),
    PENSAO("Pensão"),
    BPC("Benefício de Prestação Continuada/BPC"),
    OUTROS("Outros");

    private final String descricao;

    TipoDeBeneficio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
