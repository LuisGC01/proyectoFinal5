package proyecto.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
import proyecto.repository.dto.UsuarioDTO;
import proyecto.service.UsuarioServicioTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class UsuariosListaTest {

	private static IUsuariosRepository mockIUsuariosRepository;

	@Autowired
	public void setMockIUsuariosRepository(IUsuariosRepository mockIUsuariosRepository) {
		UsuariosListaTest.mockIUsuariosRepository = mockIUsuariosRepository;
	}

	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
	 * 
	 * @AfterClass public static void tearDownAfterClass() throws Exception { }
	 */
	@Test
	public void testObtenerUsuarioExitoso() {
		UsuarioDTO u = new UsuarioDTO(1, "LUIS", "123456", "supervisor", "Luis", "Garcia", "Nombre", true);
		Mockito.when(mockIUsuariosRepository.obtenerUsuario(17)).thenReturn(u);
		UsuarioDTO dto = mockIUsuariosRepository.obtenerUsuario(17);
		Assert.assertEquals(dto, u);
	}

	@Test
	public void testObtenerUsuarioNoEncontrado() {
		Mockito.when(mockIUsuariosRepository.obtenerUsuario(17)).thenReturn(null);
		UsuarioDTO dto = mockIUsuariosRepository.obtenerUsuario(17);
		Assert.assertNull(dto);
	}

	@Test
	public void testObtenerUsuariosExitoso() {
		List<UsuarioDTO> us = new ArrayList<UsuarioDTO>();
		us.add(new UsuarioDTO(1, "LUIS", "123456", "supervisor", "Luis", "Garcia", "Nombre", true));
		Mockito.when(mockIUsuariosRepository.obtenerUsuarios()).thenReturn(us);
		List<UsuarioDTO> dtos = mockIUsuariosRepository.obtenerUsuarios();
		Assert.assertEquals(dtos, us);
	}

	@Test
	public void testObtenerUsuariosNoEncontrado() {
		Mockito.when(mockIUsuariosRepository.obtenerUsuarios()).thenReturn(null);
		List<UsuarioDTO> dtos = mockIUsuariosRepository.obtenerUsuarios();
		Assert.assertNull(dtos);
	}

}
