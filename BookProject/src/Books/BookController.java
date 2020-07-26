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
				System.out.println("제시된 숫자를 입력해 주세요.");
				break;
			}
		}
	}
	
	public static void bookInsert() {
		String bookName = conInput("추가할 도서명");
		String chul = conInput("출판사");
		String chulAdd = conInput("출판사 장소");
		String chulNum = conInput("출판사 번호");
		String chulEmail = conInput("출판사 이메일");
		String name = conInput("저자");
		String nameDebu = conInput("저자 데뷔작");
		String nameEmail = conInput("저자 이메일");
		String genre = conInput("장르");
		String bookSeul = conInput("책설명");
		BookSet.list.put(bookName, new BookVo(bookName, chul, name, genre));
		BookInfo.bookInfo.put(bookName, bookSeul);
		ChulInfo.chulInfo.put(chul, new ChulInfoVo(chulAdd, chulNum, chulEmail));
		NameInfo.nameInfo.put(name, new NameInfoVo(nameDebu, nameEmail));
		System.out.println(bookName + "책이 추가되었습니다.");
	}

	public static void bookUpdate() {
		String bookupdate = conInput("책 이름");
		Set<String> keyList = BookSet.list.keySet();
		Iterator<String> iter = keyList.iterator();
		try {
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(k.equals(bookupdate)) {
					String chul = conInput("수정할 출판사");
					String name = conInput("수정할 저자");
					String genre = conInput("수정할 장르");
					BookSet.list.put(bookupdate, new BookVo(vo.getBookName(), chul, name, genre));
					System.out.println(bookupdate + "이(가) 수정되었습니다.");
				}
			}
		}catch(ConcurrentModificationException e) {
			
		}
	}
	
	public static void bookDelete() {
		String bookdelete = conInput("삭제할 책 이름");
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
					System.out.println(bookdelete + "이(가) 삭제되었습니다.");
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
