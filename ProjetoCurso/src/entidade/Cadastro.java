package entidade;

public class Cadastro {
	private int codigo;
	private String senha;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Cadastro() {
		super();
		this.codigo = codigo;
		this.senha = senha;
	}
}
