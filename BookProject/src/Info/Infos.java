package Info;

import java.util.Iterator;
import java.util.Set;

import Books.BookSet;
import Books.BookVo;

public class Infos {

	public Infos() {
		
	}

	public static void Info(String bookName) {
		Set<String> keybook = BookInfo.bookInfo.keySet();
		Iterator<String> iter1 = keybook.iterator();
		while(iter1.hasNext()) {
			String k = iter1.next();
			if(bookName.equals(k)) {
				System.out.printf("\n|도서정보|\n - %s\n", BookInfo.bookInfo.get(bookName));
			}
		}


		try {
			BookVo vo = BookSet.list.get(bookName);
			
			Set<String> keychul = ChulInfo.chulInfo.keySet();
			Iterator<String> iter2 = keychul.iterator();
			while(iter2.hasNext()) {
				String k2 = iter2.next();
				ChulInfoVo vo2 = ChulInfo.chulInfo.get(k2);
				if(k2.equals(vo.getChul())) {
					System.out.printf("\n|출판사 정보|\n - 주소 : %s\n - 전화번호 : %s\n - 이메일 : %s\n",
							vo2.getChuladd(), vo2.getChultel(), vo2.getChulemail());
				}
			}
		
			Set<String> keyname = NameInfo.nameInfo.keySet();
			Iterator<String> iter3 = keyname.iterator();
			while(iter3.hasNext()) {
				String k3 = iter3.next();
				NameInfoVo vo3 = NameInfo.nameInfo.get(k3);
				if(k3.equals(vo.getName())) {
					System.out.printf("\n|저자 정보|\n - 데뷔작 : %s\n - 이메일 : %s\n",
							vo3.getNameDebut(), vo3.getNameEmail());
				}
			}
		}catch(NullPointerException e) {
			System.out.println("책이름을 정확히 적어주세요.");
			
		}
	}
	
}
