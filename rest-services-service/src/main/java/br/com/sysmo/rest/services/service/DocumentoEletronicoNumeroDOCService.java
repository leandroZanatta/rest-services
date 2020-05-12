package br.com.sysmo.rest.services.service;

import br.com.sysmo.rest.services.util.dto.NumeroSerieDTO;

public interface DocumentoEletronicoNumeroDOCService {

    public abstract Long adquirirUltimoNumeroUtilizado(Long codigoDocumentoEletronicoSerieDOC, String ambiente);

    public abstract NumeroSerieDTO adquirirUltimoNumeroUtilizado(Long codigoEmpresa, Long codigoPDV, String ambiente);
}
