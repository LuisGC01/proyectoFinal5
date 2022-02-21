package proyecto.service.dto;

public class MagnitudArreglo {
	private Integer idMagnitudArreglo;
	private String magnitud;
	private String unidad;
	private String definicion;
	private Boolean capturar;
	private Boolean repetir;
	private String asociado;
	private Integer idModeloMatematico;

	public MagnitudArreglo() {
		// TODO Auto-generated constructor stub
	}

	public MagnitudArreglo(Integer idMagnitudArreglo, String magnitud, String unidad, String definicion,
			Boolean capturar, Boolean repetir, String asociado, Integer idModeloMatematico) {
		this.idMagnitudArreglo = idMagnitudArreglo;
		this.magnitud = magnitud;
		this.unidad = unidad;
		this.definicion = definicion;
		this.capturar = capturar;
		this.repetir = repetir;
		this.asociado = asociado;
		this.idModeloMatematico = idModeloMatematico;
	}

	public Integer getIdMagnitudArreglo() {
		return idMagnitudArreglo;
	}

	public void setIdMagnitudArreglo(Integer idMagnitudArreglo) {
		this.idMagnitudArreglo = idMagnitudArreglo;
	}

	public String getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(String magnitud) {
		this.magnitud = magnitud;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public Boolean getCapturar() {
		return capturar;
	}

	public void setCapturar(Boolean capturar) {
		this.capturar = capturar;
	}

	public Boolean getRepetir() {
		return repetir;
	}

	public void setRepetir(Boolean repetir) {
		this.repetir = repetir;
	}

	public String getAsociado() {
		return asociado;
	}

	public void setAsociado(String asociado) {
		this.asociado = asociado;
	}

	public Integer getIdModeloMatematico() {
		return idModeloMatematico;
	}

	public void setIdModeloMatematico(Integer idModeloMatematico) {
		this.idModeloMatematico = idModeloMatematico;
	}

	@Override
	public String toString() {
		return "MagnitudArreglo [idMagnitudArreglo=" + idMagnitudArreglo + ", magnitud=" + magnitud + ", unidad="
				+ unidad + ", definicion=" + definicion + ", capturar=" + capturar + ", repetir=" + repetir
				+ ", asociado=" + asociado + "]";
	}

}
