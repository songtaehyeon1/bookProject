package Info;

import java.util.HashMap;

public class ChulInfo {
	
	
	public static HashMap<String, ChulInfoVo> chulInfo = new HashMap<String, ChulInfoVo>();

	public ChulInfo() {
		
	}
	
	public static void chulIn() {
		chulInfo.put("한빛미디어", new ChulInfoVo("서울 서대문구 연희로2길 62","02-325-0384","support@hanbit.co.kr"));
		chulInfo.put("Bj퍼블릭", new ChulInfoVo("서울시 중구 청계천로 100시그니처타워 서관 10층","02-739-0739","bjpublic@bjpublic.co.kr"));
		chulInfo.put("청문각", new ChulInfoVo("경기도 파주시 문발로 116 (문발동)","1644-0965",""));
		chulInfo.put("민음사", new ChulInfoVo("서울시 강남구 도산대로 1길 62 5층","02-515-2000","webmaster@minumsa.com"));
		chulInfo.put("RH코리아", new ChulInfoVo("서울 금천구 가산디지털 2로 53","02-6443-8800","rhksns@rhk.co.kr"));
		chulInfo.put("돌베개", new ChulInfoVo("경기도 파주시 회동길 77-20(문발동 532-4)","031-955-5020","book@dolbegae.co.kr"));
		chulInfo.put("해냄", new ChulInfoVo("서울특별시 마포구 서교동 368-4 해냄빌딩 5, 6층","02-326-1600",""));
		chulInfo.put("샘터", new ChulInfoVo("서울 종로구 창경궁로35길 26 2F","02-763-8961~8","webmaster@isamtoh.com"));
	}
	
}
