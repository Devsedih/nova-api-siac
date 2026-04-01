package com.gov.direitoshumanos.siac_sedih.embeddable;

import com.gov.direitoshumanos.siac_sedih.embeddable.dtos.EnderecoDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class EnderecoEmbeddable {

    private String cep;
    private String logradouro;
    private String bairro;
    private String numero;
    private String localidade;
    private String complemento;
    private String uf;

    public static EnderecoEmbeddable of(EnderecoDTO dto) {
        return EnderecoEmbeddable.builder()
                .cep(dto.cep())
                .logradouro(dto.logradouro())
                .bairro(dto.bairro())
                .numero(dto.numero())
                .complemento(dto.complemento())
                .localidade(dto.localidade())
                .uf(dto.uf())
                .build();
    }
}
