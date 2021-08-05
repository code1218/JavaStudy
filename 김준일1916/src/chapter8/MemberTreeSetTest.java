package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		treeSet.addMember(new Member("±èÁØÀÏ"));
		treeSet.addMember(new Member("±èÁØÀÌ"));
		treeSet.addMember(new Member("±èÁØ»ï"));
		treeSet.addMember(new Member("±èÁØ»ç"));
		treeSet.addMember(new Member("±èÁØ¿À"));
		treeSet.addMember(new Member("±èÁØÀ°"));
		treeSet.addMember(new Member("±èÁØÄ¥"));
		
		treeSet.showAllMember();
		
		treeSet.removeMember(20210004);
		
		treeSet.showAllMember();

	}

}
