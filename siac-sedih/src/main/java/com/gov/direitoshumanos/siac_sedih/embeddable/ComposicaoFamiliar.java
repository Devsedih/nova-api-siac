package com.gov.direitoshumanos.siac_sedih.embeddable;

import com.gov.direitoshumanos.siac_sedih.embeddable.dtos.ComposicaoFamiliarDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ComposicaoFamiliar {

    private String parentesco;

    @Column(name = "nome_parente")
    private String nome;
    private int idade;
    @Column(name = "ocupacao_profissional_familiar")
    private String ocupacao;

    public static ComposicaoFamiliar of(ComposicaoFamiliarDTO dto) {
        return ComposicaoFamiliar.builder()
                .parentesco(dto.parentesco())
                .nome(dto.nome())
                .idade(dto.idade())
                .ocupacao(dto.ocupacao())
                .build();
    }

}
