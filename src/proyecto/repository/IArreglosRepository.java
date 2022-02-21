package proyecto.repository;

import java.util.List;

import proyecto.repository.dto.ArregloMedicionDTO;
import proyecto.repository.dto.DerivadaModeloMatematicoDTO;
import proyecto.repository.dto.ImagenDTO;
import proyecto.repository.dto.MagnitudArregloDTO;
import proyecto.repository.dto.MagnitudDetalleDTO;
import proyecto.repository.dto.ModeloMatematicoDTO;

public interface IArreglosRepository {

	public abstract List<ArregloMedicionDTO> obtenerArreglosMedicion();

	public abstract ArregloMedicionDTO obtenerArregloMedicion(Integer idArreglo);

	public abstract ImagenDTO obtenerImagen(Integer idImagen);

	public abstract ModeloMatematicoDTO obtenerModelo(Integer idArreglo);

	public abstract List<DerivadaModeloMatematicoDTO> obtenerDerivadas(Integer idModelo);

	public abstract List<MagnitudArregloDTO> obtenerMagnitudes(Integer idModelo);

	public abstract MagnitudDetalleDTO obtenerMagnitudDetalle(Integer idMagnitud);

}
