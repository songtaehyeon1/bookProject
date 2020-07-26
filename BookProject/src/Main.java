
import java.util.Scanner;

import Books.Book;
import Books.BookController;
import Books.BookSet;
import Info.BookInfo;
import Info.ChulInfo;
import Info.Infos;
import Info.NameInfo;
import Login.UserController;
import Login.JoinSet;
import Login.Login;

public class Main extends Book{
	
	Scanner s = new Scanner(System.in);
	
	public Main() {
		
		System.out.println("작성자 = 송태현");
		
		BookSet.bookData();
		BookInfo.bookIn();
		ChulInfo.chulIn();
		NameInfo.nameIn();
		while(true) {
			String loginS = conInput("1 : 로그인 | 2 : 회원가입 | 3 : 안함");
			System.out.println("======================================================");
			if(loginS.equals("1")) {
				String userid = conInput("아이디");
				String userpwd = conInput("비밀번호");
				System.out.println("======================================================");
				Login log = new Login(userid, userpwd);
				if(log.loginCheck() == 1) {
					System.out.println("관리자 로그인 되었습니다.");
					System.out.println("======================================================");
					while(true) {
						String menu = conInput("1 : 도서관리 | 2 : 사용자 관리 | 3 : 로그아웃");
						System.out.println("======================================================");
						if(menu.equals("1")) {
							allBook();
							String bookControlNum = conInput("1 : 추가 | 2 : 수정 | 3 : 삭제 | 4 : 뒤로가기");
							BookController.bookControl(bookControlNum);
							System.out.println("======================================================");
						}else if(menu.equals("2")) {
							UserController.userPrint();
							System.out.println("======================================================");
							String conStr = conInput("1 : 추가 | 2 : 수정 | 3 : 삭제 | 4 : 뒤로가기");
							UserController.userControl(conStr);
							System.out.println("======================================================");
						}else if(menu.equals("3")) {
							System.out.println("관리자 로그아웃 되었습니다.");
							System.out.println("======================================================");
							break;
						}else {
							System.out.println("제시된 숫자로 다시 입력해 주세요.");
							System.out.println("======================================================");
						}
					}
				}else if(log.loginCheck() == 2) {
					System.out.println(log.getUserid() + "님 환영합니다.");
					System.out.println("======================================================");
					while(true) {
						String menu = conInput("1 : 도서목록 | 2 : 검색 | 3 : 로그아웃");
						System.out.println("======================================================");
						if(menu.equals("1")) {
							allBook();
							String bookInfo = conInput("1 : 책정보 보기 | 2 : 뒤로가기");
							System.out.println("======================================================");
							if(bookInfo.equals("1")) {
								String bookName = conInput("책이름");
								Infos.Info(bookName);
								System.out.println("======================================================");
							}
						}else if(menu.equals("2")) {
							String findStr= conInput("1 : 도서명으로찾기 | 2 : 출판사로찾기 | 3 : 저자로찾기 | 4 : 장르로찾기 | 5 : 뒤로가기");
							find(findStr);
							System.out.println("======================================================");
						}else if(menu.equals("3")) {
							System.out.println(log.getUserid() + "님 로그아웃 되었습니다.");
							System.out.println("======================================================");
							break;
						}
					}
				}else if(log.loginCheck() == 3) {
					System.out.println("아이디 또는 비밀번호를 다시 입력해 주세요.");
					System.out.println("======================================================");
				}
			}else if(loginS.equals("2")) {
				String joinid = conInput("아이디");
				String joinpw = conInput("비밀번호");
				JoinSet.joinData(joinid, joinpw);
			}else if(loginS.equals("3")){
				break;
			}else {
				System.out.println("제시된 숫자로 다시 입력해 주세요.");
				System.out.println("======================================================");
			}
		}
		System.out.println("끝");
	}

	public String conInput(String msg) {
		System.out.print(msg + " = ");
		return s.nextLine();
	}
	
	public static void main(String[] args) {

		new Main();

	}

}
