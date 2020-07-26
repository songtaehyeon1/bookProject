package Login;

public class JoinVo {

	private String id;
	private String pw;
	
	public JoinVo() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public JoinVo(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
}
