 package entidade;

public class CorridaInterligacao {
	private CorridaUsuario us;
	private CorridaGerente org;
	
	public void Associativa(CorridaUsuario us, CorridaGerente org) {
		this.us = us;
		this.org = org;
	}
	public CorridaUsuario getUs() {
		return us;
	}
	public void setUs(CorridaUsuario us) {
		this.us = us;
	}
	public CorridaGerente getOrg() {
		return org;
	}
	public void setOrg(CorridaGerente org) {
		this.org = org;
	}
}
