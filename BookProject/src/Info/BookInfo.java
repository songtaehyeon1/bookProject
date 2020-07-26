package Info;

import java.util.HashMap;

public class BookInfo {

	public static HashMap<String, String> bookInfo = new HashMap<String, String>();
	
	public BookInfo() {
		
	}

	public static void bookIn() {
		bookInfo.put("혼자 공부하는 파이썬", "혼자 해도 충분하다! 1:1 과외하듯 배우는 파이썬 프로그래밍 자습서(파이썬 최신 버전 반영)");
		bookInfo.put("파이썬답게 코딩하기", "프로그래밍 언어의 개념과 흐름에 대한 고찰");
		bookInfo.put("금융수학개론", "본서는 옵션 및 파생상품이론을 중심으로 전개되나 위험관리에 대한 내용도 다루고 있다");
		bookInfo.put("이것이 리눅스다", "『이것이 리눅스다』는 ‘초보자도 리눅스의 실무 기능을 막힘 없이 실습 가능하도록’ 17년간의 생생한 강의 경험을 담아낸 책이다.");
		bookInfo.put("82년생 김지영", "공포, 피로, 당황, 놀람, 혼란, 좌절의 연속에 대한 한국 여자의 인생 현장 보고서!");
		bookInfo.put("이유 따윈 없어", "20만 팔로워의 웃음벨, 40대 싱글맘의 일상툰");
		bookInfo.put("백범일지[보급판/반양장]", "『백범일지』는 참으로 진솔하고 감동적인 기록이다.");
		bookInfo.put("먼 바다[양장]", "발끝으로 멈춰 서 있는 것도 춤이라면……");
		bookInfo.put("독서의 즐거움", "누구나 고전을 읽고 싶어 하고, 읽어야 한다고 생각한다.");
		bookInfo.put("스스로 행복하라", "『무소유』, 『새들이 떠나간 숲은 적막하다』 등");
	}
	
}
