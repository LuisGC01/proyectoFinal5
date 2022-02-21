package proyecto.service.dto;

public class DerivadaModeloMatematico {
	private Integer idDerivadaModeloMatematico;
	private String derivadaParcial;
	private String respectoA;
	private Integer idModeloMatematico;

	public DerivadaModeloMatematico() {
		// TODO Auto-generated constructor stub
	}

	public DerivadaModeloMatematico(Integer idDerivadaModeloMatematico, String derivadaParcial, String respectoA,
			Integer idModeloMatematico) {
		this.idDerivadaModeloMatematico = idDerivadaModeloMatematico;
		this.derivadaParcial = derivadaParcial;
		this.respectoA = respectoA;
		this.idModeloMatematico = idModeloMatematico;
	}

	public Integer getIdDerivadaModeloMatematico() {
		return idDerivadaModeloMatematico;
	}

	public void setIdDerivadaModeloMatematico(Integer idDerivadaModeloMatematico) {
		this.idDerivadaModeloMatematico = idDerivadaModeloMatematico;
	}

	public String getDerivadaParcial() {
		return derivadaParcial;
	}

	public void setDerivadaParcial(String derivadaParcial) {
		this.derivadaParcial = derivadaParcial;
	}

	public String getRespectoA() {
		return respectoA;
	}

	public void setRespectoA(String respectoA) {
		this.respectoA = respectoA;
	}

	public Integer getIdModeloMatematico() {
		return idModeloMatematico;
	}

	public void setIdModeloMatematico(Integer idModeloMatematico) {
		this.idModeloMatematico = idModeloMatematico;
	}

	@Override
	public String toString() {
		return "DerivadaModeloMatematico [idDerivadaModeloMatematico=" + idDerivadaModeloMatematico
				+ ", derivadaParcial=" + derivadaParcial + ", respectoA=" + respectoA + "]";
	}

	
}
