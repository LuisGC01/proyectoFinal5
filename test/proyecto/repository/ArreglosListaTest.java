package proyecto.repository;

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
import proyecto.repository.dto.ArregloMedicionDTO;
import proyecto.repository.dto.DerivadaModeloMatematicoDTO;
import proyecto.repository.dto.ImagenDTO;
import proyecto.repository.dto.MagnitudArregloDTO;
import proyecto.repository.dto.MagnitudDetalleDTO;
import proyecto.repository.dto.ModeloMatematicoDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class ArreglosListaTest {

	private static IArreglosRepository mockIArreglosRepository;

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Autowired
	public void setMockIArreglosRepository(IArreglosRepository mockIArreglosRepository) {
		ArreglosListaTest.mockIArreglosRepository = mockIArreglosRepository;
	}

	@Test
	public void testObtenerArreglosMedicion() {
		List<ArregloMedicionDTO> dtos = new ArrayList<ArregloMedicionDTO>();
		dtos.add(new ArregloMedicionDTO(1, "Arreglo1", new Date(), "1.0.0", "Decripcion 1",
				"../formatos_cal_cert/formato1.pdf", 1, 1));
		dtos.add(new ArregloMedicionDTO(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4));
		Mockito.when(mockIArreglosRepository.obtenerArreglosMedicion()).thenReturn(dtos);
		List<ArregloMedicionDTO> arreglos = mockIArreglosRepository.obtenerArreglosMedicion();
		Assert.assertEquals(arreglos, dtos);
	}

	@Test
	public void testObtenerArregloMedicionExitoso() {
		ArregloMedicionDTO a = new ArregloMedicionDTO(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4);
		Mockito.when(mockIArreglosRepository.obtenerArregloMedicion(2)).thenReturn(a);
		ArregloMedicionDTO dto = mockIArreglosRepository.obtenerArregloMedicion(2);
		Assert.assertEquals(dto, a);
	}

	@Test
	public void testObtenerArregloMedicionNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerArregloMedicion(5)).thenReturn(null);
		ArregloMedicionDTO dto = mockIArreglosRepository.obtenerArregloMedicion(5);
		Assert.assertNull(dto);
	}

	@Test
	public void testObtenerImagenExitoso() {
		ImagenDTO dto = new ImagenDTO(1, "../imagenes/arreglos/arreglo1.jpg", "Arreglo 1",
				"Descripcion de la imagen general del arreglo 1");
		Mockito.when(mockIArreglosRepository.obtenerImagen(1)).thenReturn(dto);
		ImagenDTO i = mockIArreglosRepository.obtenerImagen(1);
		Assert.assertEquals(i, dto);
	}

	@Test
	public void testObtenerImagenNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerImagen(10)).thenReturn(null);
		ImagenDTO i = mockIArreglosRepository.obtenerImagen(10);
		Assert.assertNull(i);
	}

	@Test
	public void testObtenerModeloExitoso() {
		ModeloMatematicoDTO dto = new ModeloMatematicoDTO(1, "F=m*a", 1);
		Mockito.when(mockIArreglosRepository.obtenerModelo(1)).thenReturn(dto);
		ModeloMatematicoDTO m = mockIArreglosRepository.obtenerModelo(1);
		Assert.assertEquals(m, dto);
	}

	@Test
	public void testObtenerModeloNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerModelo(11)).thenReturn(null);
		ModeloMatematicoDTO dto = mockIArreglosRepository.obtenerModelo(11);
		Assert.assertNull(dto);
	}

	@Test
	public void testObtenerDerivadasExitoso() {
		List<DerivadaModeloMatematicoDTO> dtos = new ArrayList<DerivadaModeloMatematicoDTO>();
		dtos.add(new DerivadaModeloMatematicoDTO(1, "m", "a", 1));
		dtos.add(new DerivadaModeloMatematicoDTO(2, "a", "m", 1));
		Mockito.when(mockIArreglosRepository.obtenerDerivadas(1)).thenReturn(dtos);
		List<DerivadaModeloMatematicoDTO> m = mockIArreglosRepository.obtenerDerivadas(1);
		Assert.assertEquals(m, dtos);
	}

	@Test
	public void testObtenerDerivadasNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerDerivadas(15)).thenReturn(null);
		List<DerivadaModeloMatematicoDTO> dtos = mockIArreglosRepository.obtenerDerivadas(15);
		Assert.assertNull(dtos);
	}

	@Test
	public void testObtenerMagnitudesExitoso() {
		List<MagnitudArregloDTO> dtos = new ArrayList<MagnitudArregloDTO>();
		dtos.add(new MagnitudArregloDTO(1, "F", "N", "Fuerza resultante", false, false, null, 1));
		dtos.add(new MagnitudArregloDTO(2, "a", "m/s^2", "Aceleracion", true, false, null, 1));
		dtos.add(new MagnitudArregloDTO(3, "m", "Kg", "Masa", true, true, null, 1));
		Mockito.when(mockIArreglosRepository.obtenerMagnitudes(1)).thenReturn(dtos);
		List<MagnitudArregloDTO> m = mockIArreglosRepository.obtenerMagnitudes(1);
		Assert.assertEquals(m, dtos);
	}

	@Test
	public void testObtenerMagnitudesNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerMagnitudes(15)).thenReturn(null);
		List<MagnitudArregloDTO> dtos = mockIArreglosRepository.obtenerMagnitudes(15);
		Assert.assertNull(dtos);
	}

	@Test
	public void testObtenerMagnitudDetalleExitoso() {
		MagnitudDetalleDTO dto = new MagnitudDetalleDTO(1, "Tipo A", "Magnitud del tipo A", "Normal",
				"Bayesiano Agrupado", "Directa", null, 2, 2);
		Mockito.when(mockIArreglosRepository.obtenerMagnitudDetalle(2)).thenReturn(dto);
		MagnitudDetalleDTO m = mockIArreglosRepository.obtenerMagnitudDetalle(2);
		Assert.assertEquals(m,dto);
	}

	@Test
	public void testObtenerMagnitudDetalleNoEncontrado() {
		Mockito.when(mockIArreglosRepository.obtenerMagnitudDetalle(11)).thenReturn(null);
		MagnitudDetalleDTO dto = mockIArreglosRepository.obtenerMagnitudDetalle(11);
		Assert.assertNull(dto);
	}

}
