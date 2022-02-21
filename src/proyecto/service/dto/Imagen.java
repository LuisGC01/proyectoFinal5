package proyecto.service.dto;

public class Imagen {
	private Integer idImagen;
	private String imagen;
	private String leyenda;
	private String descripcion;

	public Imagen() {
		// TODO Auto-generated constructor stub
	}

	public Imagen(Integer idImagen, String imagen, String leyenda, String descripcion) {
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

	@Override
	public String toString() {
		return "Imagen [idImagen=" + idImagen + ", imagen=" + imagen + ", leyenda=" + leyenda + ", descripcion="
				+ descripcion + "]";
	}

}
