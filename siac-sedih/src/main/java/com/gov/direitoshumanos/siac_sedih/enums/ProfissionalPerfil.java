package com.gov.direitoshumanos.siac_sedih.enums;

public enum ProfissionalPerfil {
    MASTER("Master - Acesso Total"),
    ADMIN("Administrador"),
    TECNICO("Técnico"),
    USER("Usuário");

    private final String descricao;

    ProfissionalPerfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
