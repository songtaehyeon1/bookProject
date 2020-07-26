package Login;

import java.util.Iterator;
import java.util.Set;



public class Login {

	private String userid;
	private String userpw;
	
	public String getUserid() {
		return userid;
	}
	
	public Login() {
		
	}

	public Login(String id, String pwd) {
		this.userid = id;
		this.userpw = pwd;
	}
	
	public int loginCheck() {
		int logResult;
		Set<String> key = JoinSet.joinData.keySet();
		Iterator<String> iter = key.iterator();
		if(userid.equals("master") && userpw.equals("1234")) {
			logResult = 1;
		}else {
			logResult = 3;
		}
		while(iter.hasNext()) {
			String k = iter.next();
			JoinVo vo = JoinSet.joinData.get(k);
			if(userid.equals(k) && userpw.equals(vo.getPw())) {
				logResult = 2;
				break;
			}
		}
		return logResult;
	}
	
}
