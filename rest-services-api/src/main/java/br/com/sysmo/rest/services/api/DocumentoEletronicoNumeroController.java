package br.com.sysmo.rest.services.api;

import static br.com.sysmo.rest.services.util.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_AMBIENTE;
import static br.com.sysmo.rest.services.util.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_CODIGO_EMPRESA;
import static br.com.sysmo.rest.services.util.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_CODIGO_PDV;
import static br.com.sysmo.rest.services.util.constant.S1ServerDocumentoEletronicoConstant.PATH_ADQUIRIR_ULTIMO_NUMERO_SERIE_UTILIZADO;
import static br.com.sysmo.rest.services.util.constant.S1ServerDocumentoEletronicoConstant.PATH_DOCUMENTOELETRONICONUMERO;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sysmo.rest.services.util.anotations.PDVResponses;
import br.com.sysmo.rest.services.util.dto.NumeroSerieDTO;
import io.swagger.annotations.ApiParam;

@RequestMapping(value = PATH_DOCUMENTOELETRONICONUMERO, consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE }, produces = {
        APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
public interface DocumentoEletronicoNumeroController {

    @PDVResponses
    @GetMapping(PATH_ADQUIRIR_ULTIMO_NUMERO_SERIE_UTILIZADO)
    public abstract ResponseEntity<NumeroSerieDTO> adquirirUltimoNumeroSerieUtilizado(
            @ApiParam(value = PARAMETRO_CODIGO_EMPRESA, required = true) Long codigoEmpresa,
            @ApiParam(value = PARAMETRO_CODIGO_PDV, required = true) Long codigoPDV,
            @ApiParam(value = PARAMETRO_AMBIENTE, required = true) String ambiente);

}
