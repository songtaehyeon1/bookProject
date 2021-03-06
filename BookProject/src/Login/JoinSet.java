package Login;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class JoinSet {
	
	public static HashMap<String, JoinVo> joinData = new HashMap<String, JoinVo>();

	public JoinSet() {
	}

	public static void joinData(String id, String pw) {
		Set<String> keySetList = joinData.keySet();
		Iterator<String> iter = keySetList.iterator();
		try {
			if(id.equals("") || pw.equals("") || id.equals(" ") || pw.equals(" ")) {
				System.out.println("======================================================");
				System.out.println("아이디 또는 비밀번호를 입력해 주세요.");
				System.out.println("======================================================");
			}else if(joinData.size() == 0) {
				joinData.put(id, new JoinVo(id, pw));
				System.out.println("======================================================");
				System.out.println("회원 가입 완료!");
				System.out.println("======================================================");
			}else {
				while(iter.hasNext()) {
					String k = iter.next();
					if(k.equals(id)) {
						System.out.println("======================================================");
						System.out.println("이미 사용 중인 아이디입니다.");
						System.out.println("======================================================");
						break;
					}else if(!k.equals(id)){
						joinData.put(id, new JoinVo(id, pw));
						System.out.println("======================================================");
						System.out.println("회원 가입 완료!");
						System.out.println("======================================================");
						break;
					}
				}
			}
		}catch(ConcurrentModificationException e) {
			
		}
	}

}
