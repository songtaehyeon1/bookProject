package Info;

import java.util.HashMap;

public class ChulInfo {
	
	
	public static HashMap<String, ChulInfoVo> chulInfo = new HashMap<String, ChulInfoVo>();

	public ChulInfo() {
		
	}
	
	public static void chulIn() {
		chulInfo.put("�Ѻ��̵��", new ChulInfoVo("���� ���빮�� �����2�� 62","02-325-0384","support@hanbit.co.kr"));
		chulInfo.put("Bj�ۺ�", new ChulInfoVo("����� �߱� û��õ�� 100�ñ״�óŸ�� ���� 10��","02-739-0739","bjpublic@bjpublic.co.kr"));
		chulInfo.put("û����", new ChulInfoVo("��⵵ ���ֽ� ���߷� 116 (���ߵ�)","1644-0965",""));
		chulInfo.put("������", new ChulInfoVo("����� ������ ������ 1�� 62 5��","02-515-2000","webmaster@minumsa.com"));
		chulInfo.put("RH�ڸ���", new ChulInfoVo("���� ��õ�� ��������� 2�� 53","02-6443-8800","rhksns@rhk.co.kr"));
		chulInfo.put("������", new ChulInfoVo("��⵵ ���ֽ� ȸ���� 77-20(���ߵ� 532-4)","031-955-5020","book@dolbegae.co.kr"));
		chulInfo.put("�س�", new ChulInfoVo("����Ư���� ������ ������ 368-4 �س����� 5, 6��","02-326-1600",""));
		chulInfo.put("����", new ChulInfoVo("���� ���α� â��÷�35�� 26 2F","02-763-8961~8","webmaster@isamtoh.com"));
	}
	
}
