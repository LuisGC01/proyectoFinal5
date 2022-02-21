package proyecto.repository.dto;

public class SecuenciaDetalleDTO {
	private Integer idSecuenciaDetalle;
	private Integer idSecuenciaMedicion;
	private Integer idArregloMedicion;
	private Integer idMagnitudArreglo;
	private Integer numeroPuntoSecuencia;
	private Character tipoPunto;
	private String descripcionPunto;
	private String valor;
	private String barridoPrincipal;
	private String barridoSecundario;
	private Integer numeroMediciones;
	private String instrucciones;
	private String comentario;
	private String dialogoTxt;
	private String dialogoEntrada;
	private String dialogoValidacion;

	public SecuenciaDetalleDTO() {
		// TODO Auto-generated constructor stub
	}

	public SecuenciaDetalleDTO(Integer idSecuenciaDetalle, Integer idSecuenciaMedicion, Integer idArregloMedicion,
			Integer idMagnitudArreglo, Integer numeroPuntoSecuencia, Character tipoPunto, String descripcionPunto,
			String valor, String barridoPrincipal, String barridoSecundario, Integer numeroMediciones,
			String instrucciones, String comentario, String dialogoTxt, String dialogoEntrada,
			String dialogoValidacion) {
		this.idSecuenciaDetalle = idSecuenciaDetalle;
		this.idSecuenciaMedicion = idSecuenciaMedicion;
		this.idArregloMedicion = idArregloMedicion;
		this.idMagnitudArreglo = idMagnitudArreglo;
		this.numeroPuntoSecuencia = numeroPuntoSecuencia;
		this.tipoPunto = tipoPunto;
		this.descripcionPunto = descripcionPunto;
		this.valor = valor;
		this.barridoPrincipal = barridoPrincipal;
		this.barridoSecundario = barridoSecundario;
		this.numeroMediciones = numeroMediciones;
		this.instrucciones = instrucciones;
		this.comentario = comentario;
		this.dialogoTxt = dialogoTxt;
		this.dialogoEntrada = dialogoEntrada;
		this.dialogoValidacion = dialogoValidacion;
	}

	public Integer getIdSecuenciaDetalle() {
		return idSecuenciaDetalle;
	}

	public void setIdSecuenciaDetalle(Integer idSecuenciaDetalle) {
		this.idSecuenciaDetalle = idSecuenciaDetalle;
	}

	public Integer getIdSecuenciaMedicion() {
		return idSecuenciaMedicion;
	}

	public void setIdSecuenciaMedicion(Integer idSecuenciaMedicion) {
		this.idSecuenciaMedicion = idSecuenciaMedicion;
	}

	public Integer getIdArregloMedicion() {
		return idArregloMedicion;
	}

	public void setIdArregloMedicion(Integer idArregloMedicion) {
		this.idArregloMedicion = idArregloMedicion;
	}

	public Integer getIdMagnitudArreglo() {
		return idMagnitudArreglo;
	}

	public void setIdMagnitudArreglo(Integer idMagnitudArreglo) {
		this.idMagnitudArreglo = idMagnitudArreglo;
	}

	public Integer getNumeroPuntoSecuencia() {
		return numeroPuntoSecuencia;
	}

	public void setNumeroPuntoSecuencia(Integer numeroPuntoSecuencia) {
		this.numeroPuntoSecuencia = numeroPuntoSecuencia;
	}

	public Character getTipoPunto() {
		return tipoPunto;
	}

	public void setTipoPunto(Character tipoPunto) {
		this.tipoPunto = tipoPunto;
	}

	public String getDescripcionPunto() {
		return descripcionPunto;
	}

	public void setDescripcionPunto(String descripcionPunto) {
		this.descripcionPunto = descripcionPunto;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getBarridoPrincipal() {
		return barridoPrincipal;
	}

	public void setBarridoPrincipal(String barridoPrincipal) {
		this.barridoPrincipal = barridoPrincipal;
	}

	public String getBarridoSecundario() {
		return barridoSecundario;
	}

	public void setBarridoSecundario(String barridoSecundario) {
		this.barridoSecundario = barridoSecundario;
	}

	public Integer getNumeroMediciones() {
		return numeroMediciones;
	}

	public void setNumeroMediciones(Integer numeroMediciones) {
		this.numeroMediciones = numeroMediciones;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDialogoTxt() {
		return dialogoTxt;
	}

	public void setDialogoTxt(String dialogoTxt) {
		this.dialogoTxt = dialogoTxt;
	}

	public String getDialogoEntrada() {
		return dialogoEntrada;
	}

	public void setDialogoEntrada(String dialogoEntrada) {
		this.dialogoEntrada = dialogoEntrada;
	}

	public String getDialogoValidacion() {
		return dialogoValidacion;
	}

	public void setDialogoValidacion(String dialogoValidacion) {
		this.dialogoValidacion = dialogoValidacion;
	}

}
