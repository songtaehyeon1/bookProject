package Books;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Info.BookInfo;
import Info.ChulInfo;
import Info.ChulInfoVo;
import Info.NameInfo;
import Info.NameInfoVo;
import Login.JoinSet;

public class BookController {
	
	public BookController() {
		
	}
	
	public static void bookControl(String bookControlNum) {
		while(true) {
			if(bookControlNum.equals("1")){
				bookInsert();
				break;
			}else if(bookControlNum.equals("2")) {
				bookUpdate();
				break;
			}else if(bookControlNum.equals("3")) {
				bookDelete();
				break;
			}else if(bookControlNum.equals("4")) {
				break;
			}else {
				System.out.println("���õ� ���ڸ� �Է��� �ּ���.");
				break;
			}
		}
	}
	
	public static void bookInsert() {
		String bookName = conInput("�߰��� ������");
		String chul = conInput("���ǻ�");
		String chulAdd = conInput("���ǻ� ���");
		String chulNum = conInput("���ǻ� ��ȣ");
		String chulEmail = conInput("���ǻ� �̸���");
		String name = conInput("����");
		String nameDebu = conInput("���� ������");
		String nameEmail = conInput("���� �̸���");
		String genre = conInput("�帣");
		String bookSeul = conInput("å����");
		BookSet.list.put(bookName, new BookVo(bookName, chul, name, genre));
		BookInfo.bookInfo.put(bookName, bookSeul);
		ChulInfo.chulInfo.put(chul, new ChulInfoVo(chulAdd, chulNum, chulEmail));
		NameInfo.nameInfo.put(name, new NameInfoVo(nameDebu, nameEmail));
		System.out.println(bookName + "å�� �߰��Ǿ����ϴ�.");
	}

	public static void bookUpdate() {
		String bookupdate = conInput("å �̸�");
		Set<String> keyList = BookSet.list.keySet();
		Iterator<String> iter = keyList.iterator();
		try {
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(k.equals(bookupdate)) {
					String chul = conInput("������ ���ǻ�");
					String name = conInput("������ ����");
					String genre = conInput("������ �帣");
					BookSet.list.put(bookupdate, new BookVo(vo.getBookName(), chul, name, genre));
					System.out.println(bookupdate + "��(��) �����Ǿ����ϴ�.");
				}
			}
		}catch(ConcurrentModificationException e) {
			
		}
	}
	
	public static void bookDelete() {
		String bookdelete = conInput("������ å �̸�");
		Set<String> keyList = BookSet.list.keySet();
		Iterator<String> iter = keyList.iterator();
		try {
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(k.equals(bookdelete)) {
					BookInfo.bookInfo.remove(vo.getBookName());
					ChulInfo.chulInfo.remove(vo.getChul());
					NameInfo.nameInfo.remove(vo.getName());
					BookSet.list.remove(bookdelete);
					System.out.println(bookdelete + "��(��) �����Ǿ����ϴ�.");
				}
			}
		}catch(ConcurrentModificationException e) {
			
		}
	}

	public static String conInput(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.print(msg + " = ");
		return s.nextLine();
	}
	
}
