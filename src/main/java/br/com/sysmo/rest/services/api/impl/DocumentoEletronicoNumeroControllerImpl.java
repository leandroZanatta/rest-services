package br.com.sysmo.rest.services.api.impl;

import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_AMBIENTE;
import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_CODIGO_EMPRESA;
import static br.com.sysmo.rest.services.constant.S1ServerDocumentoEletronicoConstant.PARAMETRO_CODIGO_PDV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sysmo.rest.services.api.DocumentoEletronicoNumeroController;
import br.com.sysmo.rest.services.dto.NumeroSerieDTO;

@RestController
public class DocumentoEletronicoNumeroControllerImpl implements DocumentoEletronicoNumeroController {

    @Autowired
    private DocumentoEletronicoNumeroDOCService documentoEletronicoNumeroDOCService;

    @Override
    public ResponseEntity<NumeroSerieDTO> adquirirUltimoNumeroSerieUtilizado(
            @RequestHeader(value = PARAMETRO_CODIGO_EMPRESA, required = true) Long codigoEmpresa,
            @RequestHeader(value = PARAMETRO_CODIGO_PDV, required = true) Long codigoPDV,
            @RequestParam(value = PARAMETRO_AMBIENTE, required = true) String ambiente) {

        return ResponseEntity.ok(documentoEletronicoNumeroDOCService.adquirirUltimoNumeroUtilizado(codigoEmpresa, codigoPDV, ambiente));

    }

}
