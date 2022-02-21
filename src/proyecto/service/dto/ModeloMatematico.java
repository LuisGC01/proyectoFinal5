package proyecto.service.dto;


public class ModeloMatematico {
	private Integer idModeloMatematico;
	private String ecuacion;
	private Integer idArregloMedicion;

	public ModeloMatematico() {
		// TODO Auto-generated constructor stub
	}

	public ModeloMatematico(Integer idModeloMatematico, String ecuacion, Integer idArregloMedicion) {
		this.idModeloMatematico = idModeloMatematico;
		this.ecuacion = ecuacion;
		this.idArregloMedicion = idArregloMedicion;
	}

	public Integer getIdModeloMatematico() {
		return idModeloMatematico;
	}

	public void setIdModeloMatematico(Integer idModeloMatematico) {
		this.idModeloMatematico = idModeloMatematico;
	}

	public String getEcuacion() {
		return ecuacion;
	}

	public void setEcuacion(String ecuacion) {
		this.ecuacion = ecuacion;
	}

	public Integer getIdArregloMedicion() {
		return idArregloMedicion;
	}

	public void setIdArregloMedicion(Integer idArregloMedicion) {
		this.idArregloMedicion = idArregloMedicion;
	}

	@Override
	public String toString() {
		return "ModeloMatematico [idModeloMatematico=" + idModeloMatematico + ", ecuacion=" + ecuacion + "]";
	}

}
