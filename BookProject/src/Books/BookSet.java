package Books;

import java.util.HashMap;

public class BookSet {
	public static HashMap<String, BookVo> list = new HashMap<String, BookVo>();
	public BookSet() {
		
	}
	
	public static void bookData() {
		list.put("ȥ�� �����ϴ� ���̽�", new BookVo("ȥ�� �����ϴ� ���̽�","�Ѻ��̵��","���μ�","���α׷��� ���"));
		list.put("���̽��� �ڵ��ϱ�", new BookVo("���̽��� �ڵ��ϱ�","BJ�ۺ�","�ɰ漷","���α׷��� ���"));
		list.put("�������а���", new BookVo("�������а���","û����","���缺","����/����"));
		list.put("�̰��� ��������", new BookVo("�̰��� ��������","�Ѻ��̵��","���糲","���α׷��� ���� �����"));
		list.put("82��� ������", new BookVo("82��� ������","������","������","����Ҽ�"));
		list.put("���� ���� ����", new BookVo("���� ���� ����","RH�ڸ���","����","��ȭ"));
		list.put("�������[������]", new BookVo("�������[������]","������","�豸","�ѱ��ٴ��"));
		list.put("�� �ٴ�[����]", new BookVo("�� �ٴ�[����]","�س�","������","�ѱ� ����Ҽ�"));
		list.put("������ ��ſ�", new BookVo("������ ��ſ�","������","�̿���","å�б�"));
		list.put("������ �ູ�϶�", new BookVo("������ �ູ�϶�","����","����","�ѱ� ������"));
	}

}
