package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		treeSet.addMember(new Member("������"));
		treeSet.addMember(new Member("������"));
		treeSet.addMember(new Member("���ػ�"));
		treeSet.addMember(new Member("���ػ�"));
		treeSet.addMember(new Member("���ؿ�"));
		treeSet.addMember(new Member("������"));
		treeSet.addMember(new Member("����ĥ"));
		
		treeSet.showAllMember();
		
		treeSet.removeMember(20210004);
		
		treeSet.showAllMember();

	}

}
