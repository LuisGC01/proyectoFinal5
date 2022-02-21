package proyecto.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import proyecto.TestConfig;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class ArregloServicioTest {

	private static IArreglosRepository mockIArreglosRepository;
	private static ArregloServicio arregloServicio;

	@Autowired
	public void setMockIArreglosRepository(IArreglosRepository mockIArreglosRepository) {
		ArregloServicioTest.mockIArreglosRepository = mockIArreglosRepository;
	}

	@Autowired
	public void setArregloServicio(ArregloServicio arregloServicio) {
		ArregloServicioTest.arregloServicio = arregloServicio;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testObtenerArreglosMedicionExitoso() {
		List<ArregloMedicionDTO> dtos = new ArrayList<ArregloMedicionDTO>();
		dtos.add(new ArregloMedicionDTO(1, "Arreglo1", new Date(), "1.0.0", "Decripcion 1",
				"../formatos_cal_cert/formato1.pdf", 1, 1));
		dtos.add(new ArregloMedicionDTO(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4));
		Mockito.when(mockIArreglosRepository.obtenerArreglosMedicion()).thenReturn(dtos);
		List<ArregloMedicion> a = arregloServicio.obtenerArreglosMedicion();
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(a.size()));
	}

	@Test
	public void testObtenerArreglosMedicionNoEntontrado() {
		Mockito.when(mockIArreglosRepository.obtenerArreglosMedicion()).thenReturn(null);
		List<ArregloMedicion> a = arregloServicio.obtenerArreglosMedicion();
		Assert.assertNull(a);
	}

	@Test
	public void testObtenerArregloMedicionExitoso() {
		ArregloMedicionDTO a = new ArregloMedicionDTO(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4);
		Mockito.when(mockIArreglosRepository.obtenerArregloMedicion(2)).thenReturn(a);
		ArregloMedicion am = arregloServicio.obtenerArregloMedicion(2);
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(am.getIdArregloMedicion()));
	}

	@Test
	public void testObtenerArregloMedicionNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerArregloMedicion(11)).thenReturn(null);
		ArregloMedicion am = arregloServicio.obtenerArregloMedicion(11);
		Assert.assertNull(am);
	}

	@Test
	public void testObtenerImagenExitoso() {
		ImagenDTO dto = new ImagenDTO(1, "../imagenes/arreglos/arreglo1.jpg", "Arreglo 1",
				"Descripcion de la imagen general del arreglo 1");
		Mockito.when(mockIArreglosRepository.obtenerImagen(1)).thenReturn(dto);
		Imagen i = arregloServicio.obtenerImagen(1);
		Assert.assertEquals(Integer.valueOf(1), i.getIdImagen());
	}

	@Test
	public void testObtenerImagenNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerImagen(12)).thenReturn(null);
		Imagen i = arregloServicio.obtenerImagen(12);
		Assert.assertNull(i);
	}

	@Test
	public void testObtenerModeloExitoso() {
		ModeloMatematicoDTO dto = new ModeloMatematicoDTO(1, "F=m*a", 1);
		Mockito.when(mockIArreglosRepository.obtenerModelo(1)).thenReturn(dto);
		ModeloMatematico m = arregloServicio.obtenerModelo(1);
		Assert.assertEquals(Integer.valueOf(1), m.getIdModeloMatematico());
	}

	@Test
	public void testObtenerModeloNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerModelo(15)).thenReturn(null);
		ModeloMatematico m = arregloServicio.obtenerModelo(15);
		Assert.assertNull(m);
	}

	@Test
	public void testObtenerDerivadasExitoso() {
		List<DerivadaModeloMatematicoDTO> dtos = new ArrayList<DerivadaModeloMatematicoDTO>();
		dtos.add(new DerivadaModeloMatematicoDTO(1, "m", "a", 1));
		dtos.add(new DerivadaModeloMatematicoDTO(2, "a", "m", 1));
		Mockito.when(mockIArreglosRepository.obtenerDerivadas(1)).thenReturn(dtos);
		List<DerivadaModeloMatematico> d = arregloServicio.obtenerDerivadas(1);
		Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(d.size()));
	}

	@Test
	public void testObtenerDerivadasNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerDerivadas(19)).thenReturn(null);
		List<DerivadaModeloMatematico> d = arregloServicio.obtenerDerivadas(19);
		Assert.assertNull(d);
	}

	@Test
	public void testObtenerMagnitudesExitoso() {
		List<MagnitudArregloDTO> dtos = new ArrayList<MagnitudArregloDTO>();
		dtos.add(new MagnitudArregloDTO(1, "F", "N", "Fuerza resultante", false, false, null, 1));
		dtos.add(new MagnitudArregloDTO(2, "a", "m/s^2", "Aceleracion", true, false, null, 1));
		dtos.add(new MagnitudArregloDTO(3, "m", "Kg", "Masa", true, true, null, 1));
		Mockito.when(mockIArreglosRepository.obtenerMagnitudes(1)).thenReturn(dtos);
		List<MagnitudArreglo> ma = arregloServicio.obtenerMagnitudes(1);
		Assert.assertEquals(Integer.valueOf(3), Integer.valueOf(ma.size()));
	}

	@Test
	public void testObtenerMagnitudesNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerMagnitudes(21)).thenReturn(null);
		List<MagnitudArreglo> ma = arregloServicio.obtenerMagnitudes(21);
		Assert.assertNull(ma);
	}

	@Test
	public void testObtenerMagnitudDetalleExitoso() {
		MagnitudDetalleDTO dto = new MagnitudDetalleDTO(1, "Tipo A", "Magnitud del tipo A", "Normal",
				"Bayesiano Agrupado", "Directa", null, 2, 2);
		Mockito.when(mockIArreglosRepository.obtenerMagnitudDetalle(2)).thenReturn(dto);
		MagnitudDetalle md = arregloServicio.obtenerMagnitudDetalle(2);
		Assert.assertEquals(Integer.valueOf(2), md.getIdMagnitudArreglo());
	}

	@Test
	public void testObtenerMagnitudDetalleNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerMagnitudDetalle(22)).thenReturn(null);
		MagnitudDetalle md = arregloServicio.obtenerMagnitudDetalle(22);
		Assert.assertNull(md);
	}

}
