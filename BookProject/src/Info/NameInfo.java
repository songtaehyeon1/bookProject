package Info;

import java.util.HashMap;

public class NameInfo {

	public static HashMap<String, NameInfoVo> nameInfo = new HashMap<String, NameInfoVo>();

	public NameInfo() {
		
	}
	
	public static void nameIn() {
		nameInfo.put("���μ�", new NameInfoVo("��� ���� ���� JavaScript + jQuery�Թ�","http://rintiantta.blog.me"));
		nameInfo.put("�ɰ漷", new NameInfoVo("���ͳ� �ߵ� ��������","shimk@dankook.ac.kr"));
		nameInfo.put("���缺", new NameInfoVo("���� Ư���� ������ ����","jlee1234@unist.ac.kr"));
		nameInfo.put("���糲", new NameInfoVo("Android Studio�� Ȱ���� �ȵ���̵� ���α׷���","5288893@hanafos.com"));
		nameInfo.put("������", new NameInfoVo("�͸� ����̸�",""));
		nameInfo.put("����", new NameInfoVo("���� ���� ����",""));
		nameInfo.put("�豸", new NameInfoVo("�츮 �ܷ��� ������ ���� �豸 (���г�����̷�����)",""));
		nameInfo.put("������", new NameInfoVo("��Ʈ�� ����",""));
		nameInfo.put("�̿���", new NameInfoVo("������ ��ſ�",""));
		nameInfo.put("����", new NameInfoVo("�꿡�� ���� �ǳ�",""));
	}

}
