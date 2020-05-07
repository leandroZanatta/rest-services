package br.com.sysmo.rest.services.api.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sysmo.rest.services.dto.NumeroSerieDTO;
import br.com.sysmo.rest.services.repository.DocumentoEletronicoNumeroDOCRepository;
import br.com.sysmo.rest.services.repository.domain.DocumentoEletronicoNumeroDOC;

@Service
public class DocumentoEletronicoNumeroDOCServiceImpl implements DocumentoEletronicoNumeroDOCService {

    @Autowired
    private DocumentoEletronicoNumeroDOCRepository documentoEletronicoNumeroDOCRepository;

    @Override
    public Long adquirirUltimoNumeroUtilizado(Long codigoDocumentoEletronicoSerieDOC, String ambiente) {

        Optional<DocumentoEletronicoNumeroDOC> optionalNumeracaoAutomatica = this.buscar(codigoDocumentoEletronicoSerieDOC, ambiente);

        if (optionalNumeracaoAutomatica.isPresent()) {
            return optionalNumeracaoAutomatica.get().getUltimoNumeroUtilizado();
        }

        return 0L;
    }

    private Optional<DocumentoEletronicoNumeroDOC> buscar(Long codigoDocumentoEletronicoSerieDOC, String ambiente) {

        return documentoEletronicoNumeroDOCRepository
                .findFirstByCodigoDocumentoEletronicoSerieAndAmbienteOrderByIdAsc(codigoDocumentoEletronicoSerieDOC, ambiente);
    }

    @Override
    public NumeroSerieDTO adquirirUltimoNumeroUtilizado(Long codigoEmpresa, Long codigoPDV, String ambiente) {

        NumeroSerieDTO retorno = new NumeroSerieDTO();

        Optional<DocumentoEletronicoNumeroDOC> optRetorno = documentoEletronicoNumeroDOCRepository.findById(10L);

        if (optRetorno.isPresent()) {

            System.out.println("ENTROUUUUU... código é: " + optRetorno.get().getId());

            retorno.setNumero(optRetorno.get().getId());
        } else {

            retorno.setNumero(1000L);
        }

        retorno.setSerie(50L);

        return retorno;
    }

}
