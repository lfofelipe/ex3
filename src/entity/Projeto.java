package entity;

public class Projeto {
	private Integer idProjeto;
	private String nomeProjeto;
	private Double acrescimoSalario;
	
	private Programador programador;
	public Projeto() {
		// TODO Auto-generated constructor stub
	}
	
	public Projeto(Integer idProjeto, String nomeProjeto,
			double acrescimoSalario) {
		super();
		this.idProjeto = idProjeto;
		this.nomeProjeto = nomeProjeto;
		this.acrescimoSalario = acrescimoSalario;
	}

	public Projeto(Integer idProjeto, String nomeProjeto,
			double acrescimoSalario, Programador programador) {
		super();
		this.idProjeto = idProjeto;
		this.nomeProjeto = nomeProjeto;
		this.acrescimoSalario = acrescimoSalario;
		this.programador = programador;
	}

	public Integer getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Double getAcrescimoSalario() {
		return acrescimoSalario;
	}

	public void setAcrescimoSalario(Double acrescimoSalario) {
		this.acrescimoSalario = acrescimoSalario;
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	@Override
	public String toString() {
		return "Projeto [idProjeto=" + idProjeto + ", nomeProjeto="
				+ nomeProjeto + ", acrescimoSalario=" + acrescimoSalario
				+ "]";
	}
	public String toString(String op) {
		switch (op) {
		case "csv":
			return programador.getIdProgramdor()+ ";" + programador.getNome()+ ";" + programador.getSalario() + ";" + idProjeto + ";" + nomeProjeto + ";" + acrescimoSalario;
		case "txt":
			return programador.getIdProgramdor()+ "," + programador.getNome()+ "," + programador.getSalario() + "," + idProjeto + "," + nomeProjeto + "," + acrescimoSalario;
		default:
			return toString();
		}
	}
	
}
