package Books;

import java.util.HashMap;

public class BookSet {
	public static HashMap<String, BookVo> list = new HashMap<String, BookVo>();
	public BookSet() {
		
	}
	
	public static void bookData() {
		list.put("혼자 공부하는 파이썬", new BookVo("혼자 공부하는 파이썬","한빛미디어","윤인성","프로그래밍 언어"));
		list.put("파이썬답게 코딩하기", new BookVo("파이썬답게 코딩하기","BJ퍼블릭","심경섭","프로그래밍 언어"));
		list.put("금융수학개론", new BookVo("금융수학개론","청문각","이재성","제무/금융"));
		list.put("이것이 리눅스다", new BookVo("이것이 리눅스다","한빛미디어","우재남","프로그래밍 개발 방법론"));
		list.put("82년생 김지영", new BookVo("82년생 김지영","민음사","조남주","현대소설"));
		list.put("이유 따윈 없어", new BookVo("이유 따윈 없어","RH코리아","마메","만화"));
		list.put("백범일지[보급판]", new BookVo("백범일지[보급판]","돌베개","김구","한국근대사"));
		list.put("먼 바다[양장]", new BookVo("먼 바다[양장]","해냄","공지영","한국 장편소설"));
		list.put("독서의 즐거움", new BookVo("독서의 즐거움","민음사","이옥진","책읽기"));
		list.put("스스로 행복하라", new BookVo("스스로 행복하라","샘터","법정","한국 에세이"));
	}

}
