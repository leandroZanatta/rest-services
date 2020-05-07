package br.com.sysmo.rest.services.api.impl;

import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.API_INICIALIZACAOMODULO;
import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PATH_INICIALIZACAO_MODULO;
import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PATH_OBTER_MODULO_ATIVO;
import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PATH_OBTER_VERSAO_MODULO;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sysmo.rest.services.anotations.PDVResponses;
import br.com.sysmo.rest.services.dto.ValorStringDTO;
import io.swagger.annotations.Api;

@Api(tags = { API_INICIALIZACAOMODULO }, protocols = "http")
@RequestMapping(value = PATH_INICIALIZACAO_MODULO, consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE }, produces = { APPLICATION_JSON_VALUE,
        APPLICATION_XML_VALUE })
@Service
public class InicializacaoModuloControllerImpl {

    private String versao = "EH O GRAAL";

    @PDVResponses
    @GetMapping(PATH_OBTER_MODULO_ATIVO)
    public ResponseEntity<Boolean> obterModuloAtivo() {

        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PDVResponses
    @GetMapping(PATH_OBTER_VERSAO_MODULO)
    public ResponseEntity<ValorStringDTO> obterVersaoModulo() {

        return ResponseEntity.ok(new ValorStringDTO(versao));
    }

}
