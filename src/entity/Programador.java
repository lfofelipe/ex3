package entity;

public class Programador {
	private Integer idProgramdor;
	private String nome;
	private Double salario;

	private Projeto projeto;

	public Programador() {
		// TODO Auto-generated constructor stub
	}

	public Programador(Integer idProgramdor, String nome, Double salario) {
		super();
		this.idProgramdor = idProgramdor;
		this.nome = nome;
		this.salario = salario;
	}

	public Programador(Integer idProgramdor, String nome, Double salario,
			Projeto projeto) {
		super();
		this.idProgramdor = idProgramdor;
		this.nome = nome;
		this.salario = salario;
		this.projeto = projeto;
	}

	public Integer getIdProgramdor() {
		return idProgramdor;
	}

	public void setIdProgramdor(Integer idProgramdor) {
		this.idProgramdor = idProgramdor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return "Programador [idProgramdor=" + idProgramdor + ", nome=" + nome
				+ ", salario=" + salario +"]";
	}
	public String toString(String op) {
		switch (op) {
		case "csv":
			return idProgramdor + ";" + nome+ ";" + salario + ";" + projeto.getIdProjeto() + ";" + projeto.getNomeProjeto() + ";" + projeto.getAcrescimoSalario();
		case "txt":
			return idProgramdor + "," + nome+ "," + salario + "," + projeto.getIdProjeto() + "," + projeto.getNomeProjeto() + "," + projeto.getAcrescimoSalario();
		default:
			return toString();
		}
	}
	
	public static void main(String[] args) {
		Programador p = new Programador(1, "Luis Felipe", 800.);
		Projeto pj = new Projeto(1,"Softfive", 400.);
		p.setProjeto(pj);
		System.out.println(p.toString(""));
	}
}
