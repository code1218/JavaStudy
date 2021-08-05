package chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("±èÁØÀÏ"));
		list.addMember(new Member("±èÁØÀÌ"));
		list.addMember(new Member("±èÁØ»ï"));
		list.addMember(new Member("±èÁØ»ç"));
		list.addMember(new Member("±èÁØ¿À"));
		list.addMember(new Member("±èÁØÀ°"));
		list.addMember(new Member("±èÁØÄ¥"));
		list.addMember(new Member("±èÁØÆÈ"));
		list.addMember(new Member("±èÁØ±¸"));
		
		list.showAllMember();
		
		System.out.println("<»èÁ¦ÇÑ Member Á¤º¸>");
		list.removeMember(20210010);
		
		list.showAllMember();
		
		list.modifyMember(20210004, "±èÈ£");
		
		list.showAllMember();
	}

}
