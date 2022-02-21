package proyecto.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import proyecto.repository.dto.UsuarioDTO;

public class UsuariosLista implements IUsuariosRepository {

	private List<UsuarioDTO> usuarios;

	@Override
	public UsuarioDTO obtenerUsuario(Integer id) {
		// TODO Auto-generated method stub
		for (UsuarioDTO usuarioDTO : usuarios) {
			if (usuarioDTO.getIdUsuario().equals(id)) {
				return usuarioDTO;
			}
		}
		return null;
	}

	@Override
	public List<UsuarioDTO> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return usuarios;
	}

	@PostConstruct
	public void inicializar() {
		usuarios = new ArrayList<UsuarioDTO>();
		usuarios.add(new UsuarioDTO(1, "LUIS", "123456", "supervisor", "Luis", "Garcia", "Nombre", true));
		usuarios.add(new UsuarioDTO(2, "FELIPE", "654321", "supervisor", "Felipe", "Perez", "Luna", true));
	}

}
