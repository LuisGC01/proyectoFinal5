package proyecto.repository.dto;

import java.util.Objects;

public class ImagenDTO {
	private Integer idImagen;
	private String imagen;
	private String leyenda;
	private String descripcion;

	public ImagenDTO() {
		// TODO Auto-generated constructor stub
	}

	public ImagenDTO(Integer idImagen, String imagen, String leyenda, String descripcion) {
		this.idImagen = idImagen;
		this.imagen = imagen;
		this.leyenda = leyenda;
		this.descripcion = descripcion;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
