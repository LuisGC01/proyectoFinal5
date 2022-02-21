package proyecto.service;

import java.util.ArrayList;
import java.util.List;

import proyecto.repository.ISecuenciasRepository;
import proyecto.repository.dto.SecuenciaDetalleDTO;
import proyecto.repository.dto.SecuenciaMedicionDTO;
import proyecto.service.dto.SecuenciaDetalle;
import proyecto.service.dto.SecuenciaMedicion;

public class SecuenciaServicio {
	private ISecuenciasRepository iSecuenciasRepository;

	public SecuenciaServicio(ISecuenciasRepository iSecuenciasRepository) {
		this.iSecuenciasRepository = iSecuenciasRepository;
	}

	public SecuenciaMedicion obtenerSecuenciaMedicion(Integer id) {
		SecuenciaMedicionDTO dto = iSecuenciasRepository.obtenerSecuenciaMedicion(id);
		SecuenciaMedicion sm = null;
		if (dto != null) {
			sm = new SecuenciaMedicion();
			sm.setIdSecuenciaMedicion(dto.getIdSecuenciaMedicion());
			sm.setTitulo(dto.getTitulo());
			sm.setDescripcion(dto.getDescripcion());
			sm.setFecha(dto.getFecha());
			sm.setIdUsuario(dto.getIdUsuario());
		}
		return sm;
	}

	public List<SecuenciaMedicion> obtenerSecuenciasMedicion() {
		List<SecuenciaMedicionDTO> dtos = iSecuenciasRepository.obtenerSecuenciasMedicion();
		List<SecuenciaMedicion> secuencias = new ArrayList<SecuenciaMedicion>();
		if (dtos != null) {
			for (SecuenciaMedicionDTO dto : dtos) {
				SecuenciaMedicion sm = new SecuenciaMedicion();
				sm.setIdSecuenciaMedicion(dto.getIdSecuenciaMedicion());
				sm.setTitulo(dto.getTitulo());
				sm.setDescripcion(dto.getDescripcion());
				sm.setFecha(dto.getFecha());
				sm.setIdUsuario(dto.getIdUsuario());
				secuencias.add(sm);
			}
		}
		if (secuencias.size() > 0) {
			return secuencias;
		} else {
			return null;
		}
	}

	public List<SecuenciaDetalle> obtenerDetallesSecuencia(Integer idSecuencia) {
		List<SecuenciaDetalleDTO> dtos = iSecuenciasRepository.obtenerDetallesSecuencia(idSecuencia);
		List<SecuenciaDetalle> detalles = new ArrayList<SecuenciaDetalle>();
		if (dtos != null) {
			for (SecuenciaDetalleDTO dto : dtos) {
				if (dto.getIdSecuenciaMedicion().equals(idSecuencia)) {
					SecuenciaDetalle sd = new SecuenciaDetalle();
					sd.setIdSecuenciaDetalle(dto.getIdSecuenciaDetalle());
					sd.setIdSecuenciaMedicion(dto.getIdSecuenciaMedicion());
					sd.setIdArregloMedicion(dto.getIdArregloMedicion());
					sd.setIdMagnitudArreglo(dto.getIdMagnitudArreglo());
					sd.setNumeroPuntoSecuencia(dto.getNumeroPuntoSecuencia());
					sd.setTipoPunto(dto.getTipoPunto());
					sd.setDescripcionPunto(dto.getDescripcionPunto());
					sd.setValor(dto.getValor());
					sd.setBarridoPrincipal(dto.getBarridoPrincipal());
					sd.setBarridoSecundario(dto.getBarridoSecundario());
					sd.setNumeroMediciones(dto.getNumeroMediciones());
					sd.setInstrucciones(dto.getInstrucciones());
					sd.setComentario(dto.getComentario());
					sd.setDialogoTxt(dto.getDialogoTxt());
					sd.setDialogoEntrada(dto.getDialogoEntrada());
					sd.setDialogoValidacion(dto.getDialogoValidacion());
					detalles.add(sd);
				}
			}
		}
		if (detalles.size() > 0) {
			return detalles;
		} else {
			return null;
		}
	}

}
