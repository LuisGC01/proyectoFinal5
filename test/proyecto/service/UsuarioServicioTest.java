package proyecto.service;

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
import proyecto.repository.IUsuariosRepository;
import proyecto.repository.dto.UsuarioDTO;
import proyecto.service.dto.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class UsuarioServicioTest {

	private static IUsuariosRepository mockIUsuariosRepository;
	private static UsuarioServicio usuarioServicio;

	@Autowired
	public void setMockIUsuariosRepository(IUsuariosRepository mockIUsuariosRepository) {
		UsuarioServicioTest.mockIUsuariosRepository = mockIUsuariosRepository;
	}

	@Autowired
	public void setUsuarioServicio(UsuarioServicio usuarioServicio) {
		UsuarioServicioTest.usuarioServicio = usuarioServicio;
	}
	
	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception {
	 * usuarioServicio = new UsuarioServicio(mockIUsuariosRepository); }
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testObtenerUsuarioExitoso() {
		UsuarioDTO u = new UsuarioDTO(1, "LUIS", "123456", "supervisor", "Luis", "Garcia", "Nombre", true);
		Mockito.when(mockIUsuariosRepository.obtenerUsuario(1)).thenReturn(u);
		Usuario usuario = usuarioServicio.obtenerUsuario(1);
		Assert.assertEquals(Integer.valueOf(1), usuario.getIdUsuario());
	}

	@Test
	public void testObtenerUsuarioNoExitoso() {
		Mockito.when(mockIUsuariosRepository.obtenerUsuario(15)).thenReturn(null);
		Usuario usuario = usuarioServicio.obtenerUsuario(1);
		Assert.assertNull(usuario);
	}

	@Test
	public void testObtenerUsuariosExitoso() {
		List<UsuarioDTO> us = new ArrayList<UsuarioDTO>();
		us.add(new UsuarioDTO(1, "LUIS", "123456", "supervisor", "Luis", "Garcia", "Nombre", true));
		Mockito.when(mockIUsuariosRepository.obtenerUsuarios()).thenReturn(us);
		List<Usuario> u = usuarioServicio.obtenerUsuarios();
		Assert.assertEquals(Integer.valueOf(1), Integer.valueOf(u.size()));
	}

	@Test
	public void testObtenerUsuariosNoExitoso() {
		Mockito.when(mockIUsuariosRepository.obtenerUsuarios()).thenReturn(null);
		List<Usuario> u = usuarioServicio.obtenerUsuarios();
		Assert.assertNull(u);

	}

}
