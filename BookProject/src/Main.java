
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
		
		System.out.println("�ۼ��� = ������");
		
		BookSet.bookData();
		BookInfo.bookIn();
		ChulInfo.chulIn();
		NameInfo.nameIn();
		while(true) {
			String loginS = conInput("1 : �α��� | 2 : ȸ������ | 3 : ����");
			System.out.println("======================================================");
			if(loginS.equals("1")) {
				String userid = conInput("���̵�");
				String userpwd = conInput("��й�ȣ");
				System.out.println("======================================================");
				Login log = new Login(userid, userpwd);
				if(log.loginCheck() == 1) {
					System.out.println("������ �α��� �Ǿ����ϴ�.");
					System.out.println("======================================================");
					while(true) {
						String menu = conInput("1 : �������� | 2 : ����� ���� | 3 : �α׾ƿ�");
						System.out.println("======================================================");
						if(menu.equals("1")) {
							allBook();
							String bookControlNum = conInput("1 : �߰� | 2 : ���� | 3 : ���� | 4 : �ڷΰ���");
							BookController.bookControl(bookControlNum);
							System.out.println("======================================================");
						}else if(menu.equals("2")) {
							UserController.userPrint();
							System.out.println("======================================================");
							String conStr = conInput("1 : �߰� | 2 : ���� | 3 : ���� | 4 : �ڷΰ���");
							UserController.userControl(conStr);
							System.out.println("======================================================");
						}else if(menu.equals("3")) {
							System.out.println("������ �α׾ƿ� �Ǿ����ϴ�.");
							System.out.println("======================================================");
							break;
						}else {
							System.out.println("���õ� ���ڷ� �ٽ� �Է��� �ּ���.");
							System.out.println("======================================================");
						}
					}
				}else if(log.loginCheck() == 2) {
					System.out.println(log.getUserid() + "�� ȯ���մϴ�.");
					System.out.println("======================================================");
					while(true) {
						String menu = conInput("1 : ������� | 2 : �˻� | 3 : �α׾ƿ�");
						System.out.println("======================================================");
						if(menu.equals("1")) {
							allBook();
							String bookInfo = conInput("1 : å���� ���� | 2 : �ڷΰ���");
							System.out.println("======================================================");
							if(bookInfo.equals("1")) {
								String bookName = conInput("å�̸�");
								Infos.Info(bookName);
								System.out.println("======================================================");
							}
						}else if(menu.equals("2")) {
							String findStr= conInput("1 : ����������ã�� | 2 : ���ǻ��ã�� | 3 : ���ڷ�ã�� | 4 : �帣��ã�� | 5 : �ڷΰ���");
							find(findStr);
							System.out.println("======================================================");
						}else if(menu.equals("3")) {
							System.out.println(log.getUserid() + "�� �α׾ƿ� �Ǿ����ϴ�.");
							System.out.println("======================================================");
							break;
						}
					}
				}else if(log.loginCheck() == 3) {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� �Է��� �ּ���.");
					System.out.println("======================================================");
				}
			}else if(loginS.equals("2")) {
				String joinid = conInput("���̵�");
				String joinpw = conInput("��й�ȣ");
				JoinSet.joinData(joinid, joinpw);
			}else if(loginS.equals("3")){
				break;
			}else {
				System.out.println("���õ� ���ڷ� �ٽ� �Է��� �ּ���.");
				System.out.println("======================================================");
			}
		}
		System.out.println("��");
	}

	public String conInput(String msg) {
		System.out.print(msg + " = ");
		return s.nextLine();
	}
	
	public static void main(String[] args) {

		new Main();

	}

}
