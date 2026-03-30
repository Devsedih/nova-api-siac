package com.gov.direitoshumanos.siac_sedih.entidade.enums;

public enum TipoAtendimento {

    PRIMEIRO_ATENDIMENTO("Primeiro atendimento"),
    RETORNO("Retorno");

    private final String label;

    TipoAtendimento(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

}
