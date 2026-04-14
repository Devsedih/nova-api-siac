package com.gov.direitoshumanos.siac_sedih.enums;

public enum Cenario {
    CASA_ONDE_RESIDE_VITIMA_E_SUSPEITO("Casa Onde reside a vítima e o suspeito"),
    CASA_DA_VITIMA("Casa da vítima"),
    CASA_DO_SUSPEITO("Casa do suspeito"),
    AMBIENTE_VIRTUAL("Ambiente Virtual"),
    VIA_PUBLICA("Via Pública"),
    INSTITUICAO_DE_ENSINO("Instituição de Ensino"),
    OCUPACAO("Ocupação"),
    ESTABELECIMENTO_DE_SAUDE("Estabelecimento de saúde"),
    LOCAL_DE_TRABALHO_DA_VITIMA("Local de Trabalho da vítima"),
    ORGAOS_PUBLICOS("Órgãos Públicos"),
    OUTROS("Outros"),
    UNIDADE_PRISIONAL_DE_TRIAGEM_E_OBSERVACAO_CRIMINOLOGICA_UP_TOC(
            "Unidade Prisional de Triagem e Observação Criminológica (UP-TOC)"),
    UNIDADE_PRISIONAL_DE_AQUIRAZ_UP_AQUIRAZ("Unidade Prisional de Aquiraz (UP-Aquiraz)"),
    UNIDADE_PRISIONAL_PROFESSOR_JOSE_SOBREIRA_DE_AMORIM_UP_SOBREIRA_AMORIM(
            "Unidade Prisional Professor José Sobreira de Amorim (UP-Sobreira Amorim)"),
    UNIDADE_PRISIONAL_IRMA_IMELDA_LIMA_PONTES_UP_IMELDA(
            "Unidade Prisional Irmã Imelda Lima Pontes (UP-Imelda)"),
    UNIDADE_PRISIONAL_FRANCISCO_HELIO_VIANA_DE_ARAUJO_UP_PACATUBA(
            "Unidade Prisional Francisco Hélio Viana de Araújo (UP-Pacatuba)"),
    UNIDADE_PRISIONAL_FEMININA_DESEMBARGADORA_AURI_MOURA_COSTA_UPF(
            "Unidade Prisional Feminina Desembargadora Auri Moura Costa (UPF)"),
    UNIDADE_PRISIONAL_PROFESSOR_OLAVO_OLIVEIRA_II_UPPOO_II(
            "Unidade Prisional Professor Olavo Oliveira II (UPPOO II)"),
    HOSPITAL_SANATORIO_PRISIONAL_PROFESSOR_OTAVIO_LOBO_HSPPOL(
            "Hospital e Sanatório Prisional Professor Otávio Lobo (HSPPOL)"),
    INSTITUTO_PSIQUIATRICO_GOVERNADOR_STENIO_GOMES_IPGSG(
            "Instituto Psiquiátrico Governador Stênio Gomes (IPGSG)"),
    UNIDADE_PRISIONAL_DESEMBARGADOR_FRANCISCO_ADALBERTO_DE_OLIVEIRA_BARROS_LEAL_UP_CAUCAIA(
            "Unidade Prisional Desembargador Francisco Adalberto de Oliveira Barros Leal (UP-Caucaia)"),
    UNIDADE_PRISIONAL_AGENTE_PENITENCIARIO_LUCIANO_ANDRADE_LIMA_UP_ITAITINGA1(
            "Unidade Prisional Agente Penitenciário Luciano Andrade Lima (UP-Itaitinga1)"),
    UNIDADE_PRISIONAL_PROFESSOR_CLODOALDO_PINTO_UP_ITAITINGA2(
            "Unidade Prisional Professor Clodoaldo Pinto (UP-Itaitinga2)"),
    UNIDADE_PRISIONAL_PROFESSOR_JOSE_JUCA_NETO_UP_ITAITINGA3(
            "Unidade Prisional Professor José Jucá Neto (UP-Itaitinga3)"),
    UNIDADE_PRISIONAL_ELIAS_ALVES_DA_SILVA_UP_ITAITINGA4(
            "Unidade Prisional Elias Alves da Silva (UP-Itaitinga4)"),
    UNIDADE_PRISIONAL_VASCO_DAMASCENO_WEYNE_UP_ITAITINGA5(
            "Unidade Prisional Vasco Damasceno Weyne (UP-Itaitinga5)"),
    UNIDADE_PRISIONAL_DE_ENSINO_CAPACITACAO_E_TRABALHO_DE_ITAITINGA_UPECT_ITAITINGA(
            "Unidade Prisional de Ensino, Capacitação e Trabalho de Itaitinga (UPECT-Itaitinga)"),
    UNIDADE_PRISIONAL_DE_SEGURANCA_MAXIMA_DO_ESTADO_DO_CEARA_UP_MAXIMA(
            "Unidade Prisional de Segurança Máxima do Estado do Ceará (UP-Máxima)"),
    UNIDADE_PRISIONAL_DE_TRAIRI_UP_TRAIRI(
            "Unidade Prisional de Trairi (UP-Trairi)");

    private final String label;

    Cenario(String label) {
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
