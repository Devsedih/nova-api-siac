package com.gov.direitoshumanos.siac_sedih.embeddable.dtos;

import com.gov.direitoshumanos.siac_sedih.embeddable.ComposicaoFamiliar;

public record ComposicaoFamiliarDTO(
        String parentesco,
        String nome,
        int idade,
        String ocupacao
) {
    public static ComposicaoFamiliarDTO from(ComposicaoFamiliar c) {
        return new ComposicaoFamiliarDTO(
                c.getParentesco(),
                c.getNome(),
                c.getIdade(),
                c.getOcupacao()
        );
    }
}
