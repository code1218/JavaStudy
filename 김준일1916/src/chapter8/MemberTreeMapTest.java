package chapter8;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("������"));
		tm.addMember(new Member("������"));
		tm.addMember(new Member("���ػ�"));
		tm.addMember(new Member("���ػ�"));
		tm.addMember(new Member("���ؿ�"));
		tm.addMember(new Member("������"));
		
		tm.showAllMember();
		
		tm.removeMember(20210005);
		
		tm.showAllMember();
	}

}
