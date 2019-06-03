package com.daniel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Titulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotEmpty(message = "O número da publicação é obrigatório")
	private String descricao;
	
	@NotEmpty(message = "O número do pedido internacional é obrigatório")
	private String numPedInt;
	
	@NotNull(message = "A data de publicação é obrigatória")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataPub;
	
	@NotEmpty(message = "O Requerente é obrigatório")
	private String requerentes;
	
	@NotEmpty(message = "O titulo da publicação é obrigatório")
	private String tituloPub;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumPedInt() {
		return numPedInt;
	}

	public void setNumPedInt(String numPedInt) {
		this.numPedInt = numPedInt;
	}

	public Date getDataPub() {
		return dataPub;
	}

	public void setDataPub(Date dataPub) {
		this.dataPub = dataPub;
	}

	public String getRequerentes() {
		return requerentes;
	}

	public void setRequerentes(String requerentes) {
		this.requerentes = requerentes;
	}

	public String getTituloPub() {
		return tituloPub;
	}

	public void setTituloPub(String tituloPub) {
		this.tituloPub = tituloPub;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Titulo other = (Titulo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
