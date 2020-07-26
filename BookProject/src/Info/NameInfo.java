package Info;

import java.util.HashMap;

public class NameInfo {

	public static HashMap<String, NameInfoVo> nameInfo = new HashMap<String, NameInfoVo>();

	public NameInfo() {
		
	}
	
	public static void nameIn() {
		nameInfo.put("윤인성", new NameInfoVo("모든 웹을 위한 JavaScript + jQuery입문","http://rintiantta.blog.me"));
		nameInfo.put("심경섭", new NameInfoVo("인터넷 중독 완전정복","shimk@dankook.ac.kr"));
		nameInfo.put("이재성", new NameInfoVo("아주 특별한 생물학 수업","jlee1234@unist.ac.kr"));
		nameInfo.put("우재남", new NameInfoVo("Android Studio를 활용한 안드로이드 프로그래밍","5288893@hanafos.com"));
		nameInfo.put("조남주", new NameInfoVo("귀를 기울이면",""));
		nameInfo.put("마메", new NameInfoVo("이유 따윈 없어",""));
		nameInfo.put("김구", new NameInfoVo("우리 겨레의 위대한 스승 김구 (고학년꿈을이룬사람들)",""));
		nameInfo.put("공지영", new NameInfoVo("동트는 새벽",""));
		nameInfo.put("이옥진", new NameInfoVo("독서의 즐거움",""));
		nameInfo.put("법정", new NameInfoVo("산에는 꽃이 피네",""));
	}

}
