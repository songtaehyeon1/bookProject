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
				System.out.println("���̵� �Ǵ� ��й�ȣ�� �Է��� �ּ���.");
				System.out.println("======================================================");
			}else if(joinData.size() == 0) {
				joinData.put(id, new JoinVo(id, pw));
				System.out.println("======================================================");
				System.out.println("ȸ�� ���� �Ϸ�!");
				System.out.println("======================================================");
			}else {
				while(iter.hasNext()) {
					String k = iter.next();
					if(k.equals(id)) {
						System.out.println("======================================================");
						System.out.println("�̹� ��� ���� ���̵��Դϴ�.");
						System.out.println("======================================================");
						break;
					}else if(!k.equals(id)){
						joinData.put(id, new JoinVo(id, pw));
						System.out.println("======================================================");
						System.out.println("ȸ�� ���� �Ϸ�!");
						System.out.println("======================================================");
						break;
					}
				}
			}
		}catch(ConcurrentModificationException e) {
			
		}
	}

}
