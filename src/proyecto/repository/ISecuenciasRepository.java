package proyecto.repository;

import java.util.List;

import proyecto.repository.dto.SecuenciaDetalleDTO;
import proyecto.repository.dto.SecuenciaMedicionDTO;

public interface ISecuenciasRepository {
	public abstract SecuenciaMedicionDTO obtenerSecuenciaMedicion(Integer id);

	public abstract List<SecuenciaMedicionDTO> obtenerSecuenciasMedicion();
	
	public abstract List<SecuenciaDetalleDTO> obtenerDetallesSecuencia(Integer idSecuencia);
}
