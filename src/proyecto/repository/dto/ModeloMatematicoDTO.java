package proyecto.repository.dto;

import java.util.List;

import proyecto.service.dto.ArregloMedicion;
import proyecto.service.dto.DerivadaModeloMatematico;
import proyecto.service.dto.MagnitudArreglo;

public class ModeloMatematicoDTO {
	private Integer idModeloMatematico;
	private String ecuacion;
	private Integer idArregloMedicion;

	public ModeloMatematicoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ModeloMatematicoDTO(Integer idModeloMatematico, String ecuacion, Integer idArregloMedicion) {
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

}
