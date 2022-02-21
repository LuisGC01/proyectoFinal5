package proyecto.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import proyecto.repository.dto.SecuenciaDetalleDTO;
import proyecto.repository.dto.SecuenciaMedicionDTO;

public class SecuenciasLista implements ISecuenciasRepository {

	private List<SecuenciaMedicionDTO> secuencias;
	private List<SecuenciaDetalleDTO> detalles;

	@Override
	public SecuenciaMedicionDTO obtenerSecuenciaMedicion(Integer id) {
		// TODO Auto-generated method stub
		for (SecuenciaMedicionDTO secuenciaMedicionDTO : secuencias) {
			if (secuenciaMedicionDTO.getIdSecuenciaMedicion().equals(id)) {
				return secuenciaMedicionDTO;
			}
		}
		return null;
	}

	@Override
	public List<SecuenciaMedicionDTO> obtenerSecuenciasMedicion() {
		// TODO Auto-generated method stub
		return secuencias;
	}

	@Override
	public List<SecuenciaDetalleDTO> obtenerDetallesSecuencia(Integer idSecuencia) {
		// TODO Auto-generated method stub
		List<SecuenciaDetalleDTO> d = new ArrayList<SecuenciaDetalleDTO>();
		for (SecuenciaDetalleDTO dto : detalles) {
			if (dto.getIdSecuenciaMedicion().equals(idSecuencia)) {
				d.add(dto);
			}
		}
		if (d.size() > 0) {
			return d;
		} else {
			return null;
		}
	}

	@PostConstruct
	public void inicializar() {
		secuencias = new ArrayList<SecuenciaMedicionDTO>();
		detalles = new ArrayList<SecuenciaDetalleDTO>();
		secuencias.add(new SecuenciaMedicionDTO(1, "Titulo secuencia 1", "Descripcion de la secuencia de medicion 1",
				new Date(), 1));
		secuencias.add(new SecuenciaMedicionDTO(2, "Titulo secuencia 2", "Descripcion de la secuencia de medicion 2",
				new Date(), 2));

		detalles.add(new SecuenciaDetalleDTO(1, 1, null, null, 1, 'D', "descripcion d1", null, null, null, null, null,
				null, "texto d1", "entrada d1", "validacion d1"));
		detalles.add(new SecuenciaDetalleDTO(2, 1, 1, 2, 2, 'D', "descripcion d2", null, null, null, null, null, null,
				"texto d2", "entrada d2", "validacion d2"));
		detalles.add(new SecuenciaDetalleDTO(3, 1, 1, 3, 3, 'D', "descripcion d3", null, null, null, null, null, null,
				"texto d3", "entrada d3", "validacion d3"));
		detalles.add(new SecuenciaDetalleDTO(4, 1, 1, null, 4, 'C', "descripcion c1", "0", "Ascendente°", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(5, 1, 1, null, 5, 'C', "descripcion c1", "33", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(6, 1, 1, null, 6, 'C', "descripcion c1", "67", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(7, 1, 1, null, 7, 'C', "descripcion c1", "100", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(8, 1, 1, null, 8, 'C', "descripcion c1", "0", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(9, 1, 1, null, 9, 'C', "descripcion c1", "33", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(10, 1, 1, null, 10, 'C', "descripcion c1", "67", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(11, 1, 1, null, 11, 'C', "descripcion c1", "100", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(12, 1, 1, null, 12, 'C', "descripcion c1", "0", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(13, 1, 1, null, 13, 'C', "descripcion c1", "33", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(14, 1, 1, null, 14, 'C', "descripcion c1", "67", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(15, 1, 1, null, 15, 'C', "descripcion c1", "100", "Ascendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(16, 1, 1, null, 16, 'S', "descripcion s1", "0", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(17, 1, 1, null, 17, 'S', "descripcion s1", "25", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(18, 1, 1, null, 18, 'S', "descripcion s1", "50", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(19, 1, 1, null, 19, 'S', "descripcion s1", "75", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(20, 1, 1, null, 20, 'S', "descripcion s1", "100", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(21, 1, 1, null, 21, 'S', "descripcion s1", "100", "Descendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(22, 1, 1, null, 22, 'S', "descripcion s1", "75", "Descendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(23, 1, 1, null, 23, 'S', "descripcion s1", "50", "Descendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(24, 1, 1, null, 24, 'S', "descripcion s1", "25", "Descendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(25, 1, 1, null, 25, 'S', "descripcion s1", "0", "Descendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(26, 1, 1, null, 26, 'S', "descripcion s1", "0", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(27, 1, 1, null, 27, 'S', "descripcion s1", "25", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(28, 1, 1, null, 28, 'S', "descripcion s1", "50", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(29, 1, 1, null, 29, 'S', "descripcion s1", "75", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(30, 1, 1, null, 30, 'S', "descripcion s1", "100", "Ascendente", "0°", 2,
				"instrucciones s1", "comentarios s1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(31, 2, null, null, 1, 'D', "descripcion d1", null, null, null, null, null,
				null, "texto d1", "entrada d1", "validacion d1"));
		detalles.add(new SecuenciaDetalleDTO(32, 2, 2, 2, 2, 'D', "descripcion d2", null, null, null, null, null, null,
				"texto d2", "entrada d2", "validacion d2"));
		detalles.add(new SecuenciaDetalleDTO(33, 2, 2, 3, 3, 'D', "descripcion d3", null, null, null, null, null, null,
				"texto d3", "entrada d3", "validacion d3"));
		detalles.add(new SecuenciaDetalleDTO(34, 2, 2, 4, 4, 'D', "descripcion d4", null, null, null, null, null, null,
				"texto d4", "entrada d4", "validacion d4"));
		detalles.add(new SecuenciaDetalleDTO(35, 2, 2, null, 5, 'C', "descripcion c1", "100", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(36, 2, 2, null, 6, 'C', "descripcion c1", "50", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(37, 2, 2, null, 7, 'C', "descripcion c1", "0", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(38, 2, 2, null, 8, 'C', "descripcion c1", "100", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(39, 2, 2, null, 9, 'C', "descripcion c1", "50", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(40, 2, 2, null, 10, 'C', "descripcion c1", "0", "Descendente", "0°", null,
				"instrucciones c1", "comentarios c1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(41, 2, 2, null, 11, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(42, 2, 2, null, 12, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(43, 2, 2, null, 13, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(44, 2, 2, null, 14, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(45, 2, 2, null, 15, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(46, 2, 2, null, 16, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(47, 2, 2, null, 17, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(48, 2, 2, null, 18, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(49, 2, 2, null, 19, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(50, 2, 2, null, 20, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(51, 2, 2, null, 21, 'I', "descripcion I1", "U", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));
		detalles.add(new SecuenciaDetalleDTO(52, 2, 2, null, 22, 'I', "descripcion I1", "S", "S.U.U.S", null, null,
				"instrucciones I1", "comentarios I1", null, null, null));

	}

}
