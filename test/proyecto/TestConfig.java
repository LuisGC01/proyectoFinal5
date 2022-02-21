package proyecto;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proyecto.controller.Controlador;
import proyecto.repository.ArreglosLista;
import proyecto.repository.IArreglosRepository;
import proyecto.repository.ISecuenciasRepository;
import proyecto.repository.IUsuariosRepository;
import proyecto.repository.SecuenciasLista;
import proyecto.repository.UsuariosLista;
import proyecto.service.ArregloServicio;
import proyecto.service.SecuenciaServicio;
import proyecto.service.UsuarioServicio;

@Configuration
public class TestConfig {
	@Bean
	public IArreglosRepository mockIArreglosRepository() {
		return Mockito.mock(IArreglosRepository.class);
	}

	@Bean
	public ISecuenciasRepository mockISecuenciasRepository() {
		return Mockito.mock(ISecuenciasRepository.class);
	}

	@Bean
	public IUsuariosRepository mockIUsuariosRepository() {
		return Mockito.mock(IUsuariosRepository.class);
	}

	@Bean
	public UsuarioServicio usuarioServicio(IUsuariosRepository iUsuariosRepository) {
		return new UsuarioServicio(iUsuariosRepository);
	}

	@Bean
	public ArregloServicio arregloServicio(IArreglosRepository iArreglosRepository) {
		return new ArregloServicio(iArreglosRepository);
	}

	@Bean
	public SecuenciaServicio secuenciaServicio(ISecuenciasRepository iSecuenciasRepository) {
		return new SecuenciaServicio(iSecuenciasRepository);
	}

}
