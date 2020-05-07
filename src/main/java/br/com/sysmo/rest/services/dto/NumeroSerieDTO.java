package br.com.sysmo.rest.services.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class NumeroSerieDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Número da NFC-e")
    private Long numero;

    @ApiModelProperty(notes = "Série do PDV")
    private Long serie;

}
