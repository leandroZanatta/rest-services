package br.com.sysmo.rest.services.api.impl;

import br.com.sysmo.rest.services.dto.NumeroSerieDTO;

public interface DocumentoEletronicoNumeroDOCService {

    public abstract Long adquirirUltimoNumeroUtilizado(Long codigoDocumentoEletronicoSerieDOC, String ambiente);

    public abstract NumeroSerieDTO adquirirUltimoNumeroUtilizado(Long codigoEmpresa, Long codigoPDV, String ambiente);
}
