package br.com.sysmo.rest.services.repository.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@SequenceGenerator(name = "gen_documentoeletrnumerodoc", sequenceName = "gen_documentoeletrnumerodoc", allocationSize = 1)
@Table(name = "tb_documentoeletrnumerodoc")
public class DocumentoEletronicoNumeroDOC {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_documentoeletrnumerodoc")
	@Column(name = "id_documentoeletrnumerodoc", nullable = false)
	private Long id;

	@Column(name = "cd_documentoeletrseriedoc", nullable = false)
	private Long codigoDocumentoEletronicoSerie;

	@Column(name = "fl_ambiente", nullable = false)
	private String ambiente;

	@Column(name = "nr_ultimonumeroutilizado", nullable = false)
	private Long ultimoNumeroUtilizado;

	@Column(name = "dt_cadastro", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date dataCadastro;

	@Column(name = "dt_manutencao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date dataManutencao;

	public DocumentoEletronicoNumeroDOC() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ambiente == null) ? 0 : ambiente.hashCode());
		result = prime * result
				+ ((codigoDocumentoEletronicoSerie == null) ? 0 : codigoDocumentoEletronicoSerie.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((dataManutencao == null) ? 0 : dataManutencao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ultimoNumeroUtilizado == null) ? 0 : ultimoNumeroUtilizado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoEletronicoNumeroDOC other = (DocumentoEletronicoNumeroDOC) obj;
		if (ambiente == null) {
			if (other.ambiente != null)
				return false;
		} else if (!ambiente.equals(other.ambiente))
			return false;
		if (codigoDocumentoEletronicoSerie == null) {
			if (other.codigoDocumentoEletronicoSerie != null)
				return false;
		} else if (!codigoDocumentoEletronicoSerie.equals(other.codigoDocumentoEletronicoSerie))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataManutencao == null) {
			if (other.dataManutencao != null)
				return false;
		} else if (!dataManutencao.equals(other.dataManutencao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ultimoNumeroUtilizado == null) {
			if (other.ultimoNumeroUtilizado != null)
				return false;
		} else if (!ultimoNumeroUtilizado.equals(other.ultimoNumeroUtilizado))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigoDocumentoEletronicoSerie() {
		return codigoDocumentoEletronicoSerie;
	}

	public void setCodigoDocumentoEletronicoSerie(Long codigoDocumentoEletronicoSerie) {
		this.codigoDocumentoEletronicoSerie = codigoDocumentoEletronicoSerie;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Long getUltimoNumeroUtilizado() {
		return ultimoNumeroUtilizado;
	}

	public void setUltimoNumeroUtilizado(Long ultimoNumeroUtilizado) {
		this.ultimoNumeroUtilizado = ultimoNumeroUtilizado;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataManutencao() {
		return dataManutencao;
	}

	public void setDataManutencao(Date dataManutencao) {
		this.dataManutencao = dataManutencao;
	}

	@Override
	public String toString() {
		return "DocumentoEletronicoNumeroDOC [id=" + id + ", codigoDocumentoEletronicoSerie="
				+ codigoDocumentoEletronicoSerie + ", ambiente=" + ambiente + ", ultimoNumeroUtilizado="
				+ ultimoNumeroUtilizado + ", dataCadastro=" + dataCadastro + ", dataManutencao=" + dataManutencao
				+ ", hashCode()=" + hashCode() + ", getId()=" + getId() + ", getCodigoDocumentoEletronicoSerie()="
				+ getCodigoDocumentoEletronicoSerie() + ", getAmbiente()=" + getAmbiente()
				+ ", getUltimoNumeroUtilizado()=" + getUltimoNumeroUtilizado() + ", getDataCadastro()="
				+ getDataCadastro() + ", getDataManutencao()=" + getDataManutencao() + "]";
	}

	public DocumentoEletronicoNumeroDOC(Long id, Long codigoDocumentoEletronicoSerie, String ambiente,
			Long ultimoNumeroUtilizado, Date dataCadastro, Date dataManutencao) {
		super();
		this.id = id;
		this.codigoDocumentoEletronicoSerie = codigoDocumentoEletronicoSerie;
		this.ambiente = ambiente;
		this.ultimoNumeroUtilizado = ultimoNumeroUtilizado;
		this.dataCadastro = dataCadastro;
		this.dataManutencao = dataManutencao;
	}

}
