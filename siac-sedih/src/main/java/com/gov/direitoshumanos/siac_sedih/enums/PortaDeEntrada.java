package com.gov.direitoshumanos.siac_sedih.enums;

public enum PortaDeEntrada {

    DEMANDA_ESPONTANEA("Demanda espontânea"),
    LIGACAO_TELEFONICA("Ligação telefônica"),
    WHATSAPP("Whatsapp"),
    EMAIL("E-mail"),
    OI_SOL("Oi Sol"),
    ENCAMINHADO_REDE("Encaminhado rede"),
    OUVIDORIA("Ouvidoria"),
    COORDENADORIA_TEMATICA("Coordenadoria temática"),
    GABINETE_SECRETARIA("Gabinete Secretaria"),
    PRESENCIAL("Presencial"),
    MUTIRAO("Mutirão");

    private final String label;

    PortaDeEntrada(String label) {
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
