package proyecto.repository.dto;

import java.util.Objects;

public class UsuarioDTO {
	private Integer idUsuario;
	private String nombreUsuario;
	private String password;
	private String puesto;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Boolean activo;

	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(Integer idUsuario, String nombreUsuario, String password, String puesto, String nombre,
			String primerApellido, String segundoApellido, Boolean activo) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.puesto = puesto;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.activo = activo;
	}

	public UsuarioDTO(String nombreUsuario, String password, String puesto, String nombre, String primerApellido,
			String segundoApellido, Boolean activo) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.puesto = puesto;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.activo = activo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, idUsuario, nombre, nombreUsuario, password, primerApellido, puesto,
				segundoApellido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDTO other = (UsuarioDTO) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(idUsuario, other.idUsuario)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(nombreUsuario, other.nombreUsuario)
				&& Objects.equals(password, other.password) && Objects.equals(primerApellido, other.primerApellido)
				&& Objects.equals(puesto, other.puesto) && Objects.equals(segundoApellido, other.segundoApellido);
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", password=" + password
				+ ", puesto=" + puesto + ", nombre=" + nombre + ", primerApellido=" + primerApellido
				+ ", segundoApellido=" + segundoApellido + ", activo=" + activo + "]";
	}

}
