package proyecto.service.dto;

public class MagnitudDetalle {
	private Integer idMagnitudDetalle;
	private String tipo;
	private String descripcion;
	private String distribucion;
	private String evaluacionIncertidumbre;
	private String metodoObservacion;
	private Double valor;
	private Integer idMagnitudArreglo;
	private Integer idImagen;

	public MagnitudDetalle() {
		// TODO Auto-generated constructor stub
	}

	public MagnitudDetalle(Integer idMagnitudDetalle, String tipo, String descripcion, String distribucion,
			String evaluacionIncertidumbre, String metodoObservacion, Double valor, Integer idMagnitudArreglo,
			Integer idImagen) {
		this.idMagnitudDetalle = idMagnitudDetalle;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.distribucion = distribucion;
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
		this.metodoObservacion = metodoObservacion;
		this.valor = valor;
		this.idMagnitudArreglo = idMagnitudArreglo;
		this.idImagen = idImagen;
	}

	public Integer getIdMagnitudDetalle() {
		return idMagnitudDetalle;
	}

	public void setIdMagnitudDetalle(Integer idMagnitudDetalle) {
		this.idMagnitudDetalle = idMagnitudDetalle;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDistribucion() {
		return distribucion;
	}

	public void setDistribucion(String distribucion) {
		this.distribucion = distribucion;
	}

	public String getEvaluacionIncertidumbre() {
		return evaluacionIncertidumbre;
	}

	public void setEvaluacionIncertidumbre(String evaluacionIncertidumbre) {
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
	}

	public String getMetodoObservacion() {
		return metodoObservacion;
	}

	public void setMetodoObservacion(String metodoObservacion) {
		this.metodoObservacion = metodoObservacion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getIdMagnitudArreglo() {
		return idMagnitudArreglo;
	}

	public void setIdMagnitudArreglo(Integer idMagnitudArreglo) {
		this.idMagnitudArreglo = idMagnitudArreglo;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	@Override
	public String toString() {
		return "MagnitudDetalle [idMagnitudDetalle=" + idMagnitudDetalle + ", tipo=" + tipo + ", descripcion="
				+ descripcion + ", distribucion=" + distribucion + ", evaluacionIncertidumbre="
				+ evaluacionIncertidumbre + ", metodoObservacion=" + metodoObservacion + ", valor=" + valor + "]";
	}

}
