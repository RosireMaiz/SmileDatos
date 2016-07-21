package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_modelo")
@Entity
public class Modelo {

	private Integer idModelo;
	private String nombres;
	private String apellidos;
	private String edad;
	private Long fechaNacimiento;
	private String colorPiel;
	private String colorCabello;
	private String colorOjos;
	private String estatura;
	private String peso;
	private String talla;
	private String actividades;
	private String numero;

	public Modelo() {
		super();
	}

	public Modelo(Integer idModelo) {
		super();
		this.idModelo = idModelo;
	}

	public Modelo(
			String nombres,
			String apellidos,
			String edad,
			Long fechaNacimiento,
			String colorPiel,
			String colorCabello,
			String colorOjos,
			String estatura,
			String peso,
			String talla,
			String actividades,
			String numero) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.colorPiel = colorPiel;
		this.colorCabello = colorCabello;
		this.colorOjos = colorOjos;
		this.estatura = estatura;
		this.peso = peso;
		this.talla = talla;
		this.actividades = actividades;
		this.numero = numero;
	}

	@Id
	@SequenceGenerator(name = "tb_modelo_sequence", sequenceName = "public.tb_modelo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_modelo_sequence")
	@Column(name="id_modelo")
	public Integer getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name="nombres")
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name="apellidos")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name="edad")
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Column(name="fecha_nacimiento")
	public Long getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Long fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name="color_piel")
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	@Column(name="color_cabello")
	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String colorCabello) {
		this.colorCabello = colorCabello;
	}

	@Column(name="color_ojos")
	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	@Column(name="estatura")
	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	@Column(name="peso")
	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Column(name="talla")
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Column(name="actividades")
	public String getActividades() {
		return actividades;
	}

	public void setActividades(String actividades) {
		this.actividades = actividades;
	}

	@Column(name="numero")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idModelo == null) ? 0 : idModelo.hashCode());
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
		Modelo other = (Modelo) obj;
		if (idModelo == null) {
			return false;
		} 
		if (!idModelo.equals(other.idModelo)) {
			return false;
		} 
		return true;
	}

}
