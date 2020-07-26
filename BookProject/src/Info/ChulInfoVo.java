package Info;

public class ChulInfoVo {

	private String chuladd;
	private String chultel;
	private String chulemail;
	
	public String getChuladd() {
		return chuladd;
	}

	public void setChuladd(String chuladd) {
		this.chuladd = chuladd;
	}

	public String getChultel() {
		return chultel;
	}

	public void setChultel(String chultel) {
		this.chultel = chultel;
	}

	public String getChulemail() {
		return chulemail;
	}

	public void setChulemail(String chulemail) {
		this.chulemail = chulemail;
	}

	public ChulInfoVo(String chuladd, String chultel, String chulemail) {
		this.chuladd = chuladd;
		this.chultel = chultel;
		this.chulemail = chulemail;
	}
	public ChulInfoVo() {
	}

}
