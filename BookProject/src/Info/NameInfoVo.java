package Info;

public class NameInfoVo {

	private String nameDebut;
	private String nameEmail;
	
	public String getNameDebut() {
		return nameDebut;
	}

	public void setNameDebut(String nameDebut) {
		this.nameDebut = nameDebut;
	}

	public String getNameEmail() {
		return nameEmail;
	}

	public void setNameEmail(String nameEmail) {
		this.nameEmail = nameEmail;
	}

	public NameInfoVo() {

	}

	public NameInfoVo(String debut, String email) {
		this.nameDebut = debut;
		this.nameEmail = email;
	}
	
}
