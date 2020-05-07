package br.com.sysmo.rest.services.dto;

import lombok.Data;

@Data
public class ValorStringDTO {

    private String valor;

    public ValorStringDTO(String valor) {
        this.valor = valor;
    }

    public ValorStringDTO() {

    }

}