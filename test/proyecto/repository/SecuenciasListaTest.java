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
import proyecto.repository.dto.SecuenciaDetalleDTO;
import proyecto.repository.dto.SecuenciaMedicionDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SecuenciasListaTest {

	private static ISecuenciasRepository mockISecuenciasRepository;

	@Autowired
	public void setMockISecuenciasRepository(ISecuenciasRepository mockISecuenciasRepository) {
		SecuenciasListaTest.mockISecuenciasRepository = mockISecuenciasRepository;
	}

	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
	 * 
	 * @AfterClass public static void tearDownAfterClass() throws Exception { }
	 */

	@Test
	public void testObtenerSecuenciaMedicionExitoso() {
		SecuenciaMedicionDTO sm = new SecuenciaMedicionDTO(1, "Titulo secuencia 1",
				"Descripcion de la secuencia de medicion 1", new Date(), 1);
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciaMedicion(1)).thenReturn(sm);
		SecuenciaMedicionDTO dto = mockISecuenciasRepository.obtenerSecuenciaMedicion(1);
		Assert.assertEquals(dto, sm);
	}

	@Test
	public void testObtenerSecuenciaMedicionNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciaMedicion(15)).thenReturn(null);
		SecuenciaMedicionDTO dto = mockISecuenciasRepository.obtenerSecuenciaMedicion(15);
		Assert.assertNull(dto);
	}

	@Test
	public void testObtenerSecuenciasMedicionExitoso() {
		List<SecuenciaMedicionDTO> sms = new ArrayList<SecuenciaMedicionDTO>();
		sms.add(new SecuenciaMedicionDTO(1, "Titulo secuencia 1", "Descripcion de la secuencia de medicion 1",
				new Date(), 1));
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciasMedicion()).thenReturn(sms);
		List<SecuenciaMedicionDTO> dtos = mockISecuenciasRepository.obtenerSecuenciasMedicion();
		Assert.assertEquals(dtos, sms);
	}

	@Test
	public void testObtenerSecuenciasMedicionNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerSecuenciasMedicion()).thenReturn(null);
		List<SecuenciaMedicionDTO> dtos = mockISecuenciasRepository.obtenerSecuenciasMedicion();
		Assert.assertNull(dtos);
	}

	@Test
	public void testObtenerDetallesSecuenciaExitoso() {
		List<SecuenciaDetalleDTO> sds = new ArrayList<SecuenciaDetalleDTO>();
		sds.add(new SecuenciaDetalleDTO(1, 1, null, null, 1, 'D', "descripcion d1", null, null, null, null, null, null,
				"texto d1", "entrada d1", "validacion d1"));
		Mockito.when(mockISecuenciasRepository.obtenerDetallesSecuencia(1)).thenReturn(sds);
		List<SecuenciaDetalleDTO> dtos = mockISecuenciasRepository.obtenerDetallesSecuencia(1);
		Assert.assertEquals(dtos, sds);
	}

	@Test
	public void testObtenerDetallesSecuenciaNoEncontrado() {
		Mockito.when(mockISecuenciasRepository.obtenerDetallesSecuencia(15)).thenReturn(null);
		List<SecuenciaDetalleDTO> dtos = mockISecuenciasRepository.obtenerDetallesSecuencia(15);
		Assert.assertNull(dtos);
	}

}
