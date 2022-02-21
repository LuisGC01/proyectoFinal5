package proyecto.repository.dto;

import java.util.Date;

public class SecuenciaMedicionDTO {
	private Integer idSecuenciaMedicion;
	private String titulo;
	private String descripcion;
	private Date fecha;
	private Integer idUsuario;

	public SecuenciaMedicionDTO() {
		// TODO Auto-generated constructor stub
	}

	public SecuenciaMedicionDTO(Integer idSecuenciaMedicion, String titulo, String descripcion, Date fecha,
			Integer idUsuario) {
		this.idSecuenciaMedicion = idSecuenciaMedicion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.idUsuario = idUsuario;
	}

	public Integer getIdSecuenciaMedicion() {
		return idSecuenciaMedicion;
	}

	public void setIdSecuenciaMedicion(Integer idSecuenciaMedicion) {
		this.idSecuenciaMedicion = idSecuenciaMedicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
