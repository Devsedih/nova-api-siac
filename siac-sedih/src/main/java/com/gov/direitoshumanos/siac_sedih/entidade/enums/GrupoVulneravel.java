package com.gov.direitoshumanos.siac_sedih.entidade.enums;

public enum GrupoVulneravel {

    CRIANCA_ADOLESCENTE("Criança ou adolescente"),
    PESSOA_IDOSA("Pessoa Idosa"),
    MULHER("Mulher"),
    PESSOA_COM_DEFICIENCIA("Pessoa com deficiência"),
    CIDADAO_FAMILIA_COMUNIDADE("Cidadão, família ou comunidade"),
    LGBTQIA("LGBTQIA+"),
    RESTRICAO_LIBERDADE("Pessoa em restrição de liberdade"),
    POVOS_TRADICIONAIS("Povos tradicionais"),
    SITUACAO_DE_RUA("Pessoa em situação de rua"),
    MIGRANTE_REFUGIADO("Migrante ou Refugiado"),
    PESSOA_DESAPARECIDO("Pessoa desaparecida"),
    PROGRAMA_PROTECAO("Pessoa em programa de proteção");

    private final String label;

    GrupoVulneravel(String label) {
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
