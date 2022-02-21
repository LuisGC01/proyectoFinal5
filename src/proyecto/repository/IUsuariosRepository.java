package proyecto.repository;

import java.util.List;

import proyecto.repository.dto.UsuarioDTO;

public interface IUsuariosRepository {
	public abstract UsuarioDTO obtenerUsuario(Integer id);

	public abstract List<UsuarioDTO> obtenerUsuarios();

}
