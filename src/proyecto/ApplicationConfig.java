package proyecto;

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
public class ApplicationConfig {

	@Bean
	public IArreglosRepository iArreglosRepository() {
		return new ArreglosLista();
	}

	@Bean
	public ISecuenciasRepository iSecuenciasRepository() {
		return new SecuenciasLista();
	}

	@Bean
	public IUsuariosRepository iUsuariosRepository() {
		return new UsuariosLista();
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

	@Bean
	public Controlador controlador(UsuarioServicio usuarioServicio, ArregloServicio arregloServicio,
			SecuenciaServicio secuenciaServicio) {
		return new Controlador(usuarioServicio, arregloServicio, secuenciaServicio);
	}

}
