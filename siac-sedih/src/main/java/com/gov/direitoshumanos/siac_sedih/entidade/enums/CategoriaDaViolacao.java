package com.gov.direitoshumanos.siac_sedih.entidade.enums;

public enum CategoriaDaViolacao {
    INTEGRIDADE_FISICA("Integridade Física"),
    INTEGRIDADE_PSIQUICA("Integridade Psíquica"),
    NEGLIGENCIA_ABANDONO_OMISSAO("Negligência/Abandono/Omissão"),
    VIOLENCIA_PATRIMONIAL("Violência Patrimonial"),
    LIBERDADE_SEXUAL("Liberdade Sexual"),
    DIREITOS_INDIVIDUAIS("Direitos Individuais"),
    LIBERDADE_RELIGIAO_OU_CRENCIA("Liberdade de Religião ou crença"),
    TRABALHO_ANALOGO_A_ESCRAVIDAO("Trabalho Análogo à escravidão"),
    TRABALHO_DOMESTICO_ANALOGO_A_ESCRAVIDAO("Trabalho doméstico análogo à escravidão"),
    LIBERDADE_DE_EXPRESSAO("Liberdade de Expressão"),
    ACESSO_A_SAUDE("Acesso à saúde"),
    PROTECAO_A_INFANCIA("Proteção à infância"),
    SEGURANCA("Segurança"),
    ALIMENTACAO_SUBSISTENCIA("Alimentação/Subsistência"),
    ACESSO_A_EDUCACAO("Acesso à educação"),
    ASSISTENCIA_AOS_DESAMPARADOS("Assistência aos desamparados"),
    DIREITO_A_MORADIA("Direito à moradia"),
    PREVIDENCIA_SOCIAL("Previdência Social"),
    PROTECAO_A_MATERNIDADE("Proteção à maternidade"),
    DISCRIMINACAO("Discriminação"),
    RACISMO("Racismo"),
    INJURIA_RACIAL("Injúria Racial"),
    PROPRIEDADE("Propriedade"),
    RETENCAO_DE_DOCUMENTOS("Retenção de documentos"),
    LIVRE_EXERCICIO_DO_PODER_FAMILIAR("Livre exercício do poder familiar"),
    ACESSO_A_INFORMACAO("Acesso à informação"),
    PARTICIPACAO_DEMOCRACIA("Participação/Democracia"),
    NACIONALIDADE("Nacionalidade"),
    VOTAR_E_SER_VOTADO("Votar e ser votado"),
    MEMORIA_E_VERDADE("Memória e verdade"),
    HOMICIDIO("Homicídio"),
    AMEACA_DE_MORTE("Ameaça de Morte"),
    AMEACA_CONTRA_DEFENSOR_DE_DIREITOS_HUMANOS("Ameaça contra defensor de direitos humanos"),
    INCITACAO_AO_SUICIDIO("Incitação ao suicídio"),
    ABORTO("Aborto"),
    AUTOMUTILACAO("Automutilação"),
    GENOCIDIO("Genocídio"),
    MEIO_AMBIENTE_AGUA("Meio ambiente/Água"),
    MEIO_AMBIENTE_SOLO("Meio ambiente/Solo"),
    MEIO_AMBIENTE_FAUNA("Meio ambiente/Fauna"),
    MEIO_AMBIENTE_FLORA("Meio ambiente/Flora"),
    VIOLENCIA_CONTRA_PESSOA_SOCIALMENTE_VULNERAVEL("Violência contra Pessoa Socialmente Vulnerável"),
    VIOLENCIA_CONTRA_POPULACAO_EM_SITUACAO_DE_RUA("Violência contra População em Situação de Rua"),
    OUTRAS_VIOLACOES_CONTRA_DIREITOS_HUMANOS("Outras Violações contra Direitos Humanos"),
    VIOLENCIA_ETNICO_RACIAL("Violência Étnico / Racial"),
    CONFLITOS_FUNDIARIOS_URBANOS("Conflitos Fundiários Urbanos"),
    CONFLITOS_FUNDIARIOS_RURAIS("Conflitos Fundiários Rurais"),
    RACISMO_RELIGIOSO("Racismo Religioso"),
    VIOLENCIA_INSTITUCIONAL_ESTADUAL("Violência Institucional estadual"),
    VIOLENCIA_INSTITUCIONAL_MUNICIPAL("Violência Institucional municipal"),
    VIOLENCIA_INSTITUCIONAL_FEDERAL("Violência Institucional federal"),
    NEGLIGENCIA_ABANDONO_OMISSAO_VIOLENCIA_PATRIMONIAL("Negligência/Abandono/Omissão/Violência Patrimonial"),
    INTEGRIDADE_FISICA_PSIQUICA("Integridade Física/Psíquica"),
    INTEGRIDADE_FISICA_PSIQUICA_PATRIMONIAL("Integridade Física/psíquica/patrimonial"),
    VIOLENCIA_SEXUAL("Violência Sexual"),
    VIOLACOES_DE_DIREITOS_SOCIAIS("Violações de Direitos Sociais"),
    SITUACAO_DE_RUA("Situação de rua"),
    SOFRIMENTO_ADOECIMENTO_PSIQUICO("Sofrimento/adoecimento psíquico"),
    VIOLENCIA_DOMESTICA("Violência doméstica"),
    CALUNIA_INJURIA_DIFAMACAO("Calúnia, Injúria, Difamação");

    private final String label;

    CategoriaDaViolacao(String label) {
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
