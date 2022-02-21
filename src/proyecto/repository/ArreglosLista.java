package proyecto.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import proyecto.repository.dto.ArregloMedicionDTO;
import proyecto.repository.dto.DerivadaModeloMatematicoDTO;
import proyecto.repository.dto.ImagenDTO;
import proyecto.repository.dto.MagnitudArregloDTO;
import proyecto.repository.dto.MagnitudDetalleDTO;
import proyecto.repository.dto.ModeloMatematicoDTO;

public class ArreglosLista implements IArreglosRepository {

	private List<ArregloMedicionDTO> arreglosMedicion;
	private List<ImagenDTO> imagenes;
	private List<ModeloMatematicoDTO> modelos;
	private List<DerivadaModeloMatematicoDTO> derivadas;
	private List<MagnitudArregloDTO> magnitudes;
	private List<MagnitudDetalleDTO> detalleMagnitudes;

	@Override
	public List<ArregloMedicionDTO> obtenerArreglosMedicion() {
		// TODO Auto-generated method stub
		return arreglosMedicion;
	}

	@Override
	public ArregloMedicionDTO obtenerArregloMedicion(Integer idArreglo) {
		// TODO Auto-generated method stub
		for (ArregloMedicionDTO arregloMedicionDTO : arreglosMedicion) {
			if (arregloMedicionDTO.getIdArregloMedicion().equals(idArreglo)) {
				return arregloMedicionDTO;
			}
		}
		return null;
	}

	@Override
	public ImagenDTO obtenerImagen(Integer idImagen) {
		// TODO Auto-generated method stub
		for (ImagenDTO imagenDTO : imagenes) {
			if (imagenDTO.getIdImagen().equals(idImagen)) {
				return imagenDTO;
			}
		}
		return null;
	}

	@Override
	public ModeloMatematicoDTO obtenerModelo(Integer idArreglo) {
		// TODO Auto-generated method stub
		for (ModeloMatematicoDTO modeloMatematicoDTO : modelos) {
			if (modeloMatematicoDTO.getIdModeloMatematico().equals(idArreglo)) {
				return modeloMatematicoDTO;
			}
		}
		return null;
	}

	@Override
	public List<DerivadaModeloMatematicoDTO> obtenerDerivadas(Integer idModelo) {
		// TODO Auto-generated method stub
		List<DerivadaModeloMatematicoDTO> derivadasModeloMatematicoDTO = new ArrayList<DerivadaModeloMatematicoDTO>();
		for (DerivadaModeloMatematicoDTO dto : derivadas) {
			if (dto.getIdModeloMatematico().equals(idModelo)) {
				derivadasModeloMatematicoDTO.add(dto);
			}
		}
		if (derivadasModeloMatematicoDTO.size() > 0) {
			return derivadasModeloMatematicoDTO;
		} else {
			return null;
		}
	}

	@Override
	public List<MagnitudArregloDTO> obtenerMagnitudes(Integer idModelo) {
		// TODO Auto-generated method stub
		List<MagnitudArregloDTO> magnitudesArreglo = new ArrayList<MagnitudArregloDTO>();
		for (MagnitudArregloDTO dto : magnitudes) {
			if (dto.getIdModeloMatematico().equals(idModelo)) {
				magnitudesArreglo.add(dto);
			}
		}
		if (magnitudesArreglo.size() > 0) {
			return magnitudesArreglo;
		} else {
			return null;
		}
	}

	@Override
	public MagnitudDetalleDTO obtenerMagnitudDetalle(Integer idMagnitud) {
		// TODO Auto-generated method stub
		for (MagnitudDetalleDTO dto : detalleMagnitudes) {
			if (dto.getIdMagnitudArreglo().equals(idMagnitud)) {
				return dto;
			}
		}
		return null;
	}

	@PostConstruct
	public void inicializar() {
		imagenes = new ArrayList<ImagenDTO>();
		arreglosMedicion = new ArrayList<ArregloMedicionDTO>();
		modelos = new ArrayList<ModeloMatematicoDTO>();
		derivadas = new ArrayList<DerivadaModeloMatematicoDTO>();
		magnitudes = new ArrayList<MagnitudArregloDTO>();
		detalleMagnitudes = new ArrayList<MagnitudDetalleDTO>();

		imagenes.add(new ImagenDTO(1, "../imagenes/arreglos/arreglo1.jpg", "Arreglo 1",
				"Descripcion de la imagen general del arreglo 1"));
		imagenes.add(new ImagenDTO(2, "../imagenes/magnitudes/aceleracion/acelracion1.jpg", "Aceleracion",
				"Imagen ilustrativa de una acelracion"));
		imagenes.add(
				new ImagenDTO(3, "../imagenes/magnitudes/masa/masa1.jpg", "Masa", "Imagen ilustrativa de una masa"));

		imagenes.add(new ImagenDTO(4, "../imagenes/arreglos/arreglo2.jpg", "Arreglo 2",
				"Descripcion de la imagen general del arreglo 2"));
		imagenes.add(new ImagenDTO(5, "../imagenes/magnitudes/volumen/volumen1.jpg", "Volumen",
				"Imagen ilustrativa de un volumen"));
		imagenes.add(new ImagenDTO(6, "../imagenes/magnitudes/densidad/densidad1.jpg", "Densidad",
				"Imagen ilustrativa de una densidad"));
		imagenes.add(new ImagenDTO(7, "../imagenes/magnitudes/aceleracion/gravedad.jpg", "Aceleracion de gravedad",
				"Imagen ilustrativa de la gravedad"));

		arreglosMedicion.add(new ArregloMedicionDTO(1, "Arreglo1", new Date(), "1.0.0", "Decripcion 1",
				"../formatos_cal_cert/formato1.pdf", 1, 1));
		arreglosMedicion.add(new ArregloMedicionDTO(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4));

		modelos.add(new ModeloMatematicoDTO(1, "F=m*a", 1));
		modelos.add(new ModeloMatematicoDTO(2, "E=ro*g*v", 2));

		derivadas.add(new DerivadaModeloMatematicoDTO(1, "m", "a", 1));
		derivadas.add(new DerivadaModeloMatematicoDTO(2, "a", "m", 1));
		derivadas.add(new DerivadaModeloMatematicoDTO(3, "g*ro", "v", 2));
		derivadas.add(new DerivadaModeloMatematicoDTO(4, "g*v", "ro", 2));
		derivadas.add(new DerivadaModeloMatematicoDTO(5, "ro*v", "g", 2));

		magnitudes.add(new MagnitudArregloDTO(1, "F", "N", "Fuerza resultante", false, false, null, 1));
		magnitudes.add(new MagnitudArregloDTO(2, "a", "m/s^2", "Aceleracion", true, false, null, 1));
		magnitudes.add(new MagnitudArregloDTO(3, "m", "Kg", "Masa", true, true, null, 1));
		magnitudes.add(new MagnitudArregloDTO(4, "E", "N", "Empuje", false, false, null, 2));
		magnitudes.add(new MagnitudArregloDTO(5, "v", "m^3", "volumen del liquido", true, true, null, 2));
		magnitudes.add(new MagnitudArregloDTO(6, "ro", "Kg/m^3", "densidad", true, true, null, 2));
		magnitudes.add(new MagnitudArregloDTO(7, "g", "m/s^2", "sceleracion de la gravedad", true, false, null, 2));

		detalleMagnitudes.add(new MagnitudDetalleDTO(1, "Tipo A", "Magnitud del tipo A", "Normal", "Bayesiano Agrupado",
				"Directa", null, 2, 2));
		detalleMagnitudes.add(new MagnitudDetalleDTO(2, "Tipo A Resumida", "Magnitud del tipo A Resumida", "Normal",
				"Bayesiano", null, null, 3, 3));
		detalleMagnitudes
				.add(new MagnitudDetalleDTO(3, "Tipo B", "Magnitud del tipo B", "Normal", null, null, null, 5, 5));
		detalleMagnitudes
				.add(new MagnitudDetalleDTO(4, "Tipo B", "Magnitud del tipo B", "Triangular", null, null, null, 6, 6));
		detalleMagnitudes.add(new MagnitudDetalleDTO(5, "Tipo Constante", "Magnitud del tipo Constante", null, null,
				null, 9.81, 7, 7));
	}

}
