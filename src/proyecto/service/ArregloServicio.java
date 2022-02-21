package proyecto.service;

import java.util.ArrayList;
import java.util.List;

import proyecto.repository.IArreglosRepository;
import proyecto.repository.dto.ArregloMedicionDTO;
import proyecto.repository.dto.DerivadaModeloMatematicoDTO;
import proyecto.repository.dto.ImagenDTO;
import proyecto.repository.dto.MagnitudArregloDTO;
import proyecto.repository.dto.MagnitudDetalleDTO;
import proyecto.repository.dto.ModeloMatematicoDTO;
import proyecto.service.dto.ArregloMedicion;
import proyecto.service.dto.DerivadaModeloMatematico;
import proyecto.service.dto.Imagen;
import proyecto.service.dto.MagnitudArreglo;
import proyecto.service.dto.MagnitudDetalle;
import proyecto.service.dto.ModeloMatematico;

public class ArregloServicio {
	private IArreglosRepository iArreglosRepository;

	public ArregloServicio(IArreglosRepository iArreglosRepository) {
		this.iArreglosRepository = iArreglosRepository;
	}

	public List<ArregloMedicion> obtenerArreglosMedicion() {
		List<ArregloMedicionDTO> dtos = iArreglosRepository.obtenerArreglosMedicion();
		List<ArregloMedicion> arreglos = new ArrayList<ArregloMedicion>();
		if (dtos != null) {
			for (ArregloMedicionDTO dto : dtos) {
				ArregloMedicion a = new ArregloMedicion();
				a.setIdArregloMedicion(dto.getIdArregloMedicion());
				a.setTitulo(dto.getTitulo());
				a.setFecha(dto.getFecha());
				a.setVersion(dto.getVersion());
				a.setDescripcion(dto.getDescripcion());
				a.setFormatoCalCert(dto.getFormatoCalCert());
				a.setIdUsuario(dto.getIdUsuario());
				a.setIdImagen(dto.getIdImagen());
				arreglos.add(a);
			}
		}
		if (arreglos.size() > 0) {
			return arreglos;
		} else {
			return null;
		}
	}

	public ArregloMedicion obtenerArregloMedicion(Integer idArreglo) {
		ArregloMedicionDTO dto = iArreglosRepository.obtenerArregloMedicion(idArreglo);
		ArregloMedicion a = null;
		if (dto != null) {
			a = new ArregloMedicion();
			a.setIdArregloMedicion(dto.getIdArregloMedicion());
			a.setTitulo(dto.getTitulo());
			a.setFecha(dto.getFecha());
			a.setVersion(dto.getVersion());
			a.setDescripcion(dto.getDescripcion());
			a.setFormatoCalCert(dto.getFormatoCalCert());
			a.setIdUsuario(dto.getIdUsuario());
			a.setIdImagen(dto.getIdImagen());
		}
		return a;
	}

	public Imagen obtenerImagen(Integer idImagen) {
		ImagenDTO dto = iArreglosRepository.obtenerImagen(idImagen);
		Imagen i = null;
		if (dto != null) {
			i = new Imagen();
			i.setIdImagen(dto.getIdImagen());
			i.setImagen(dto.getImagen());
			i.setLeyenda(dto.getLeyenda());
			i.setDescripcion(dto.getDescripcion());
		}
		return i;
	}

	public ModeloMatematico obtenerModelo(Integer idArreglo) {
		ModeloMatematicoDTO dto = iArreglosRepository.obtenerModelo(idArreglo);
		ModeloMatematico m = null;
		if (dto != null) {
			m = new ModeloMatematico();
			m.setIdModeloMatematico(dto.getIdModeloMatematico());
			m.setEcuacion(dto.getEcuacion());
			m.setIdArregloMedicion(dto.getIdModeloMatematico());
		}
		return m;
	}

	public List<DerivadaModeloMatematico> obtenerDerivadas(Integer idModelo) {
		List<DerivadaModeloMatematicoDTO> dtos = iArreglosRepository.obtenerDerivadas(idModelo);
		List<DerivadaModeloMatematico> derivadas = new ArrayList<DerivadaModeloMatematico>();
		if (dtos != null) {
			for (DerivadaModeloMatematicoDTO dto : dtos) {
				if (dto.getIdModeloMatematico().equals(idModelo)) {
					DerivadaModeloMatematico d = new DerivadaModeloMatematico();
					d.setIdDerivadaModeloMatematico(dto.getIdDerivadaModeloMatematico());
					d.setDerivadaParcial(dto.getDerivadaParcial());
					d.setRespectoA(dto.getRespectoA());
					d.setIdModeloMatematico(dto.getIdModeloMatematico());
					derivadas.add(d);
				}
			}
		}
		if (derivadas.size() > 0) {
			return derivadas;
		} else {
			return null;
		}
	}

	public List<MagnitudArreglo> obtenerMagnitudes(Integer idModelo) {
		List<MagnitudArregloDTO> dtos = iArreglosRepository.obtenerMagnitudes(idModelo);
		List<MagnitudArreglo> magnitudes = new ArrayList<MagnitudArreglo>();
		if (dtos != null) {
			for (MagnitudArregloDTO dto : dtos) {
				if (dto.getIdModeloMatematico().equals(idModelo)) {
					MagnitudArreglo m = new MagnitudArreglo();
					m.setIdMagnitudArreglo(dto.getIdMagnitudArreglo());
					m.setMagnitud(dto.getMagnitud());
					m.setUnidad(dto.getUnidad());
					m.setDefinicion(dto.getDefinicion());
					m.setCapturar(dto.getCapturar());
					m.setRepetir(dto.getRepetir());
					m.setAsociado(dto.getAsociado());
					m.setIdModeloMatematico(dto.getIdModeloMatematico());
					magnitudes.add(m);
				}
			}
		}
		if (magnitudes.size() > 0) {
			return magnitudes;
		} else {
			return null;
		}
	}

	public MagnitudDetalle obtenerMagnitudDetalle(Integer idMagnitud) {
		MagnitudDetalleDTO dto = iArreglosRepository.obtenerMagnitudDetalle(idMagnitud);
		MagnitudDetalle d = null;
		if (dto != null) {
			d = new MagnitudDetalle();
			d.setIdMagnitudDetalle(dto.getIdMagnitudDetalle());
			d.setTipo(dto.getTipo());
			d.setDescripcion(dto.getDescripcion());
			d.setDistribucion(dto.getDistribucion());
			d.setEvaluacionIncertidumbre(dto.getEvaluacionIncertidumbre());
			d.setMetodoObservacion(dto.getMetodoObservacion());
			d.setValor(dto.getValor());
			d.setIdMagnitudArreglo(dto.getIdMagnitudArreglo());
			d.setIdImagen(dto.getIdImagen());
		}
		return d;
	}
}
