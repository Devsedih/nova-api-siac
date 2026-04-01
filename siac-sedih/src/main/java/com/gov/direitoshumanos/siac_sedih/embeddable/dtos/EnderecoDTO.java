package com.gov.direitoshumanos.siac_sedih.embeddable.dtos;

import com.gov.direitoshumanos.siac_sedih.embeddable.EnderecoEmbeddable;

public record EnderecoDTO(
        String logradouro,
        String bairro,
        String numero,
        String cep,
        String complemento,
        String localidade,
        String uf
) {
    public static EnderecoDTO from(EnderecoEmbeddable e) {
        return new EnderecoDTO(
                e.getLogradouro(),
                e.getBairro(),
                e.getNumero(),
                e.getCep(),
                e.getComplemento(),
                e.getLocalidade(),
                e.getUf()
        );
    }
}
