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
		System.out.println("아이디\t\t비밀번호");
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
					String id = conInput("아이디 입력");
					String pw = conInput("비밀번호 입력");
					JoinSet.joinData.put(id, new JoinVo(id, pw));
					System.out.println("회원 가입 완료!");
					break;
				}else {
					String id = conInput("아이디 입력");
					String pw = conInput("비밀번호 입력");
					Set<String> keyListJoin = JoinSet.joinData.keySet();
					Iterator<String> iter = keyListJoin.iterator();
					try {
						while(iter.hasNext()) {
							String k = iter.next();
							if(id.equals("") || id.equals(" ") || pw.equals("") || pw.equals(" ")) {
								System.out.println("아이디를 입력해 주세요.");
								break;
							}else if(k.equals(id)){
								System.out.println("이미 사용중인 아이디입니다.");
								break;
							}else if(!k.equals(id)) {
								JoinSet.joinData.put(id, new JoinVo(id, pw));
								System.out.println(id + "가 추가 되었습니다.");
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
					System.out.println("수정할 아이디가 없습니다.");
					break;
				}else {
					String id = conInput("아이디 입력");
					Set<String> keyListJoin = JoinSet.joinData.keySet();
					Iterator<String> iter = keyListJoin.iterator();
					while(iter.hasNext()) {
						String k = iter.next();
						if(k.equals(id)){
							String changePw = conInput("변경할 비밀번호 입력");
							JoinSet.joinData.put(id, new JoinVo(id, changePw));
							System.out.println(id + "가 수정되었습니다.");
							break;
						}
					}
					break;
				}
			}else if(conStr.equals("3")) {
				if(JoinSet.joinData.size() == 0) {
					System.out.println("삭제할 아이디가 없습니다.");
					break;
				}else {
					String id = conInput("아이디 입력");
					Set<String> keyList = JoinSet.joinData.keySet();
					Iterator<String> iter = keyList.iterator();
					try {
						while(iter.hasNext()) {
							String k = iter.next();
							if(k.equals(id)) {
								JoinSet.joinData.remove(id);
								System.out.println(id + "가 삭제되었습니다.");
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
				System.out.println("제시된 숫자를 입력해 주세요.");
				break;
			}
		}
	}

	public static String conInput(String msg) {
		System.out.print(msg + " = ");
		return s.nextLine();
	}
	
}
