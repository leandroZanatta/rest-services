package br.com.sysmo.rest.services.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.sysmo.rest.services.repository.DocumentoEletronicoNumeroDOCRepository;
import br.com.sysmo.rest.services.repository.domain.DocumentoEletronicoNumeroDOC;

@Repository
public class DocumentoEletronicoNumeroDOCRepositoryImpl implements DocumentoEletronicoNumeroDOCRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<DocumentoEletronicoNumeroDOC> findFirstByCodigoDocumentoEletronicoSerieAndAmbienteOrderByIdAsc(
            Long codigoDocumentoEletronicoSerieDOC, String flagAmbiente) {

        return Optional.of((DocumentoEletronicoNumeroDOC) entityManager
                .createQuery(
                        "Select doc from DocumentoEletronicoNumeroDOC doc where doc.codigoDocumentoEletronicoSerie=:serie and doc.ambiente=:ambiente")
                .setParameter("serie", codigoDocumentoEletronicoSerieDOC).setParameter("ambiente", flagAmbiente).getSingleResult());
    }

    @Override
    public Optional<DocumentoEletronicoNumeroDOC> findById(long id) {

        List<DocumentoEletronicoNumeroDOC> docs = entityManager.createQuery("Select doc from DocumentoEletronicoNumeroDOC doc where doc.id=:id")
                .setParameter("id", id).getResultList();

        if (docs.size() == 0) {
            return Optional.empty();
        }

        return Optional.of(docs.get(0));
    }
}
