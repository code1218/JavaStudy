package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		
		hashSet.addMember(new Member("������"));
		hashSet.addMember(new Member("������"));
		hashSet.addMember(new Member("���ػ�"));
		hashSet.addMember(new Member("���ػ�"));
		hashSet.addMember(new Member("���ؿ�"));
		hashSet.addMember(new Member("������"));
		hashSet.addMember(new Member("����ĥ"));
		hashSet.addMember(new Member("������"));
		
		hashSet.showAllMember();

		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210004, "��ȣ");
		
		hashSet.showAllMember();
	}

}
