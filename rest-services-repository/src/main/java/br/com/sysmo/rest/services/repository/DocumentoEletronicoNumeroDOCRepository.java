package br.com.sysmo.rest.services.repository;

import java.util.Optional;

import br.com.sysmo.rest.services.repository.domain.DocumentoEletronicoNumeroDOC;

public interface DocumentoEletronicoNumeroDOCRepository {

	public abstract Optional<DocumentoEletronicoNumeroDOC> findFirstByCodigoDocumentoEletronicoSerieAndAmbienteOrderByIdAsc(
			Long codigoDocumentoEletronicoSerieDOC, String flagAmbiente);

	public abstract Optional<DocumentoEletronicoNumeroDOC> findById(long l);

}
