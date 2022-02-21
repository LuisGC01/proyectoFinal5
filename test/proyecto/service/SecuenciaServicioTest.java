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
import proyecto.repository.ISecuenciasRepository;
import proyecto.repository.dto.SecuenciaDetalleDTO;
import proyecto.repository.dto.SecuenciaMedicionDTO;
import proyecto.service.dto.SecuenciaDetalle;
import proyecto.service.dto.SecuenciaMedicion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SecuenciaServicioTest {

	private static ISecuenciasRepository mockISecuenciasRepository;
	private static SecuenciaServicio secuenciaServicio;

	@Autowired
	public void setMockISecuenciasRepository(ISecuenciasRepository mockISecuenciasRepository) {
		SecuenciaServicioTest.mockISecuenciasRepository = mockISecuenciasRepository;
	}

	@Autowired
	public void setSecuenciaServicio(SecuenciaServicio secuenciaServicio) {
		SecuenciaServicioTest.secuenciaServicio = secuenciaServicio;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testObtenerSecuenciaMedicionExitoso() {
		SecuenciaMedicionDTO sm = new SecuenciaMedicionDTO(1, "Titulo secuencia 1",
				"Descripcion de la secuencia de medicion 1", new Date(), 1);
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciaMedicion(1)).thenReturn(sm);
		SecuenciaMedicion s = secuenciaServicio.obtenerSecuenciaMedicion(1);
		Assert.assertEquals(Integer.valueOf(1), s.getIdSecuenciaMedicion());
	}

	@Test
	public void testObtenerSecuenciaMedicionNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciaMedicion(15)).thenReturn(null);
		SecuenciaMedicion s = secuenciaServicio.obtenerSecuenciaMedicion(15);
		Assert.assertNull(s);
	}

	@Test
	public void testObtenerSecuenciasMedicionExitoso() {
		List<SecuenciaMedicionDTO> sms = new ArrayList<SecuenciaMedicionDTO>();
		sms.add(new SecuenciaMedicionDTO(1, "Titulo secuencia 1", "Descripcion de la secuencia de medicion 1",
				new Date(), 1));
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciasMedicion()).thenReturn(sms);
		List<SecuenciaMedicion> s = secuenciaServicio.obtenerSecuenciasMedicion();
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(s.size()));
	}

	@Test
	public void testObtenerSecuenciasMedicionNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciasMedicion()).thenReturn(null);
		List<SecuenciaMedicion> s = secuenciaServicio.obtenerSecuenciasMedicion();
		Assert.assertNull(s);
	}

	@Test
	public void testObtenerDetallesSecuenciaExitoso() {
		List<SecuenciaDetalleDTO> sds = new ArrayList<SecuenciaDetalleDTO>();
		sds.add(new SecuenciaDetalleDTO(1, 1, null, null, 1, 'D', "descripcion d1", null, null, null, null, null, null,
				"texto d1", "entrada d1", "validacion d1"));
		Mockito.when(mockISecuenciasRepository.obtenerDetallesSecuencia(1)).thenReturn(sds);
		List<SecuenciaDetalle> d = secuenciaServicio.obtenerDetallesSecuencia(1);
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(d.size()));
	}

	@Test
	public void testObtenerDetallesSecuenciaNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerDetallesSecuencia(19)).thenReturn(null);
		List<SecuenciaDetalle> d = secuenciaServicio.obtenerDetallesSecuencia(19);
		Assert.assertNull(d);
	}

}
