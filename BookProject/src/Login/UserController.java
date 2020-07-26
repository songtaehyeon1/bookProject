package Login;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import Books.BookSet;
import Books.BookVo;


public class UserController {

	static Scanner s = new Scanner(System.in);
	
	public UserController() {
		
	}

	public static void userPrint() {
		List<String> keySetList = new ArrayList<String>(JoinSet.joinData.keySet());
		Collections.sort(keySetList);
		System.out.println("���̵�\t\t��й�ȣ");
		System.out.println("------------------------------------------------------");
		for(int i = 0; i < keySetList.size(); i++) {
			JoinVo vo = JoinSet.joinData.get(keySetList.get(i));
			System.out.printf("%s\t\t%s\n", vo.getId(), vo.getPw());
		}
	}
	
	public static void userControl(String conStr) {
		while(true) {
			if(conStr.equals("1")) {
				if(JoinSet.joinData.size() == 0) {
					String id = conInput("���̵� �Է�");
					String pw = conInput("��й�ȣ �Է�");
					JoinSet.joinData.put(id, new JoinVo(id, pw));
					System.out.println("ȸ�� ���� �Ϸ�!");
					break;
				}else {
					String id = conInput("���̵� �Է�");
					String pw = conInput("��й�ȣ �Է�");
					Set<String> keyListJoin = JoinSet.joinData.keySet();
					Iterator<String> iter = keyListJoin.iterator();
					try {
						while(iter.hasNext()) {
							String k = iter.next();
							if(id.equals("") || id.equals(" ") || pw.equals("") || pw.equals(" ")) {
								System.out.println("���̵� �Է��� �ּ���.");
								break;
							}else if(k.equals(id)){
								System.out.println("�̹� ������� ���̵��Դϴ�.");
								break;
							}else if(!k.equals(id)) {
								JoinSet.joinData.put(id, new JoinVo(id, pw));
								System.out.println(id + "�� �߰� �Ǿ����ϴ�.");
								break;
							}
							System.out.println(1);
						}
						break;
					}catch(ConcurrentModificationException e) {
						
					}
				}
			}else if(conStr.equals("2")) {
				if(JoinSet.joinData.size() == 0) {
					System.out.println("������ ���̵� �����ϴ�.");
					break;
				}else {
					String id = conInput("���̵� �Է�");
					Set<String> keyListJoin = JoinSet.joinData.keySet();
					Iterator<String> iter = keyListJoin.iterator();
					while(iter.hasNext()) {
						String k = iter.next();
						if(k.equals(id)){
							String changePw = conInput("������ ��й�ȣ �Է�");
							JoinSet.joinData.put(id, new JoinVo(id, changePw));
							System.out.println(id + "�� �����Ǿ����ϴ�.");
							break;
						}
					}
					break;
				}
			}else if(conStr.equals("3")) {
				if(JoinSet.joinData.size() == 0) {
					System.out.println("������ ���̵� �����ϴ�.");
					break;
				}else {
					String id = conInput("���̵� �Է�");
					Set<String> keyList = JoinSet.joinData.keySet();
					Iterator<String> iter = keyList.iterator();
					try {
						while(iter.hasNext()) {
							String k = iter.next();
							if(k.equals(id)) {
								JoinSet.joinData.remove(id);
								System.out.println(id + "�� �����Ǿ����ϴ�.");
								break;
							}
						}
					}catch(ConcurrentModificationException e) {
						
					}
					break;
				}
			}else if(conStr.equals("4")) {
				break;
			}else {
				System.out.println("���õ� ���ڸ� �Է��� �ּ���.");
				break;
			}
		}
	}

	public static String conInput(String msg) {
		System.out.print(msg + " = ");
		return s.nextLine();
	}
	
}
