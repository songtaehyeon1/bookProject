package Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Book {

	Scanner s = new Scanner(System.in);
	
	public Book() {
		
	}

	public void allBook() {
		List<String> keySetList = new ArrayList<String>(BookSet.list.keySet());
		Collections.sort(keySetList);
		System.out.println("도서명\t\t출판사\t\t저자\t장르");
		System.out.println("------------------------------------------------------");
		for(int i = 0; i < keySetList.size(); i++) {
			BookVo vo = BookSet.list.get(keySetList.get(i));
			System.out.printf("%s\t%s\t\t%s\t%s\n", vo.getBookName(), vo.getChul(), vo.getName(), vo.getGenre());
		}
		System.out.println("------------------------------------------------------");
		System.out.println("총 " + keySetList.size() + "권");
		System.out.println("======================================================");
	}
	
	public void find(String findStr) {
		List<String> keySetList = new ArrayList<String>(BookSet.list.keySet());
		Collections.sort(keySetList);
		if(findStr.equals("1")) {
			String str = finds();
			Set<String> keyList = BookSet.list.keySet();
			Iterator<String> iter = keyList.iterator();
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(vo.getBookName().indexOf(str) != -1) {
					System.out.printf("%s\t%s\t\t%s\t%s\n", vo.getBookName(), vo.getChul(), vo.getName(), vo.getGenre());
				}
			}
		}else if(findStr.equals("2")) {
			String str = finds();
			Set<String> keyList = BookSet.list.keySet();
			Iterator<String> iter = keyList.iterator();
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(vo.getChul().indexOf(str) != -1) {
					System.out.printf("%s\t%s\t\t%s\t%s\n", vo.getBookName(), vo.getChul(), vo.getName(), vo.getGenre());
				}
			}
		}else if(findStr.equals("3")) {
			String str = finds();
			Set<String> keyList = BookSet.list.keySet();
			Iterator<String> iter = keyList.iterator();
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(vo.getName().indexOf(str) != -1) {
					System.out.printf("%s\t%s\t\t%s\t%s\n", vo.getBookName(), vo.getChul(), vo.getName(), vo.getGenre());
				}
			}
		}else if(findStr.equals("4")) {
			String str = finds();
			Set<String> keyList = BookSet.list.keySet();
			Iterator<String> iter = keyList.iterator();
			while(iter.hasNext()) {
				String k = iter.next();
				BookVo vo = BookSet.list.get(k);
				if(vo.getGenre().indexOf(str) != -1) {
					System.out.printf("%s\t%s\t\t%s\t%s\n", vo.getBookName(), vo.getChul(), vo.getName(), vo.getGenre());
				}
			}
		}else if(findStr.equals("5")) {
			
		}
	}
	
	public String finds() {
		System.out.print("검색 = ");
		String str = s.nextLine();
		System.out.println("======================================================");
		System.out.println("도서명\t\t출판사\t\t저자\t장르");
		return str;
	}
	
}
