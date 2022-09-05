package entidade;

public class CorridaUsuario {
	private String nome;
	private int idade;
    public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	private int telefone;
	private int cpf;
	private String dataNasc;
    private String sexo;
    private String frm_pagamento;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFrm_pagamento() {
		return frm_pagamento;
	}
	public void setFrm_pagamento(String frm_pagamento) {
		this.frm_pagamento = frm_pagamento;
		
	}
public void Usuario_corrida(String nome,int idade, int telefone, int cpf, String dataNasc, String sexo, String frm_pagamento) {
		this.nome = nome;
		this.idade=idade;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataNasc=dataNasc;
		this.sexo = sexo;
		this.frm_pagamento = frm_pagamento;
	}
}
