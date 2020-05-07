package br.com.sysmo.rest.services.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sysmo.rest.services.repository.domain.DocumentoEletronicoNumeroDOC;

@Repository
public interface DocumentoEletronicoNumeroDOCRepository extends CrudRepository<DocumentoEletronicoNumeroDOC, Long> {

    public abstract Optional<DocumentoEletronicoNumeroDOC> findFirstByCodigoDocumentoEletronicoSerieAndAmbienteOrderByIdAsc(
            Long codigoDocumentoEletronicoSerieDOC, String flagAmbiente);

}
