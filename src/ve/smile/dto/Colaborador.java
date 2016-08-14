package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_colaborador")
@Entity
public class Colaborador {

	private Integer idColaborador;
	private String titulo;
	private String contenido;

	public Colaborador() {
		super();
	}

	public Colaborador(Integer idColaborador) {
		super();
		this.idColaborador = idColaborador;
	}

	public Colaborador(
			String titulo,
			String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_colaborador_sequence", sequenceName = "public.tb_colaborador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_colaborador_sequence")
	@Column(name="id_colaborador")
	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	@Column(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idColaborador == null) ? 0 : idColaborador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Colaborador other = (Colaborador) obj;
		if (idColaborador == null) {
			return false;
		} 
		if (!idColaborador.equals(other.idColaborador)) {
			return false;
		} 
		return true;
	}

}
