package proyecto.service.dto;

import java.util.Date;

public class ArregloMedicion {
	private Integer idArregloMedicion;
	private String titulo;
	private Date fecha;
	private String version;
	private String descripcion;
	private String formatoCalCert;
	private Integer idUsuario;
	private Integer idImagen;

	public ArregloMedicion() {
		// TODO Auto-generated constructor stub
	}

	public ArregloMedicion(Integer idArregloMedicion, String titulo, Date fecha, String version, String descripcion,
			String formatoCalCert, Integer idUsuario, Integer idImagen) {
		this.idArregloMedicion = idArregloMedicion;
		this.titulo = titulo;
		this.fecha = fecha;
		this.version = version;
		this.descripcion = descripcion;
		this.formatoCalCert = formatoCalCert;
		this.idUsuario = idUsuario;
		this.idImagen = idImagen;
	}

	public Integer getIdArregloMedicion() {
		return idArregloMedicion;
	}

	public void setIdArregloMedicion(Integer idArregloMedicion) {
		this.idArregloMedicion = idArregloMedicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFormatoCalCert() {
		return formatoCalCert;
	}

	public void setFormatoCalCert(String formatoCalCert) {
		this.formatoCalCert = formatoCalCert;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	@Override
	public String toString() {
		return "ArregloMedicion [idArregloMedicion=" + idArregloMedicion + ", titulo=" + titulo + ", fecha=" + fecha
				+ ", version=" + version + ", descripcion=" + descripcion + ", formatoCalCert=" + formatoCalCert + "]";
	}

}
