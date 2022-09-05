package entidade;

public class CorridaGerente {
	private int cnpj;
	private int codCorrida;
	private String nome_org;
	private String locall;
	private String dataa;
	private String horario;
	private float kilometragem;
	private int nm_insc;
	private String patrocinadores;
	private String Site_ing;
	private float preco;
	private String regiao;
	private int sac;
	
	public CorridaGerente(int codCorrida) {
		super();
		this.codCorrida = codCorrida;
	}
	public int getCodCorrida() {
		return codCorrida;
	}
	public void setCodCorrida(int codCorrida) {
		this.codCorrida = codCorrida;
	}
	
	public String getNome_org() {
		return nome_org;
	}
	public void setNome_org(String nome_org) {
		this.nome_org = nome_org;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getLocall() {
		return locall;
	}
	public void setLocall(String locall) {
		this.locall = locall;
	}
	public String getDataa() {
		return dataa;
	}
	public void setDataa(String dataa) {
		this.dataa = dataa;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public float getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(float kilometragem) {
		this.kilometragem = kilometragem;
	}
	public int getNm_insc() {
		return nm_insc;
	}
	public void setNm_insc(int nm_insc) {
		this.nm_insc = nm_insc;
	}
	public String getPatrocinadores() {
		return patrocinadores;
	}

	public String getSite_ing() {
		return Site_ing;
	}
	public void setSite_ing(String site_ing) {
		Site_ing = site_ing;
	}
	
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getSac() {
		return sac;
	}
	public void setSac(int sac) {
		this.sac = sac;
	}

	/*public CorridaGerente(int cnpj, String nome_org, String local, String data, String horario, 
			float kilometragem, int nm_insc, String site_ing, float preco, String regiao, int sac) {
	
		this.cnpj = cnpj;
		this.nome_org = nome_org;
		this.local = local;
		this.data = data;
		this.horario = horario;
		this.kilometragem = kilometragem;
		this.nm_insc = nm_insc;
	
		this.Site_ing = site_ing;
		this.preco = preco;
		this.regiao = regiao;
		this.sac = sac;
	}
	*/
	
	public CorridaGerente(String patrocinadores) {
		
		this.patrocinadores = patrocinadores;
		
	}
	public CorridaGerente() {
		// TODO Auto-generated constructor stub
	}

	
	public void setPatrocinadores(String patrocinadores) {
		this.patrocinadores= patrocinadores;
		
	}

}
