package chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("������"));
		list.addMember(new Member("������"));
		list.addMember(new Member("���ػ�"));
		list.addMember(new Member("���ػ�"));
		list.addMember(new Member("���ؿ�"));
		list.addMember(new Member("������"));
		list.addMember(new Member("����ĥ"));
		list.addMember(new Member("������"));
		list.addMember(new Member("���ر�"));
		
		list.showAllMember();
		
		System.out.println("<������ Member ����>");
		list.removeMember(20210010);
		
		list.showAllMember();
		
		list.modifyMember(20210004, "��ȣ");
		
		list.showAllMember();
	}

}
