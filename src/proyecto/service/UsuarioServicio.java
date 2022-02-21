package proyecto.service;

import java.util.ArrayList;
import java.util.List;

import proyecto.repository.IUsuariosRepository;
//import proyecto.repository.UsuariosLista;
import proyecto.repository.dto.UsuarioDTO;
import proyecto.service.dto.Usuario;

public class UsuarioServicio {
	private IUsuariosRepository iUsuariosRepository;

	public UsuarioServicio(IUsuariosRepository iUsuariosRepository) {
		this.iUsuariosRepository = iUsuariosRepository;
	}

	public Usuario obtenerUsuario(Integer id) {
		UsuarioDTO usuarioDTO = iUsuariosRepository.obtenerUsuario(id);
		Usuario u = null;
		if (usuarioDTO != null) {
			u = new Usuario();
			u.setIdUsuario(usuarioDTO.getIdUsuario());
			u.setNombreUsuario(usuarioDTO.getNombreUsuario());
			u.setPassword(usuarioDTO.getPassword());
			u.setPuesto(usuarioDTO.getPuesto());
			u.setNombre(usuarioDTO.getNombre());
			u.setPrimerApellido(usuarioDTO.getPrimerApellido());
			u.setSegundoApellido(usuarioDTO.getSegundoApellido());
			u.setActivo(usuarioDTO.getActivo());
		}
		return u;
	}

	public List<Usuario> obtenerUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		List<UsuarioDTO> usuariosDto = iUsuariosRepository.obtenerUsuarios();
		if (usuariosDto != null) {
			for (UsuarioDTO usuarioDTO : usuariosDto) {
				Usuario u = new Usuario();
				u.setIdUsuario(usuarioDTO.getIdUsuario());
				u.setNombreUsuario(usuarioDTO.getNombreUsuario());
				u.setPassword(usuarioDTO.getPassword());
				u.setPuesto(usuarioDTO.getPuesto());
				u.setNombre(usuarioDTO.getNombre());
				u.setPrimerApellido(usuarioDTO.getPrimerApellido());
				u.setSegundoApellido(usuarioDTO.getSegundoApellido());
				u.setActivo(usuarioDTO.getActivo());
				usuarios.add(u);
			}
		}

		if (usuarios.size() > 0) {
			return usuarios;
		} else {
			return null;
		}
	}

}
