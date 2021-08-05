package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		
		hashSet.addMember(new Member("±Ë¡ÿ¿œ"));
		hashSet.addMember(new Member("±Ë¡ÿ¿Ã"));
		hashSet.addMember(new Member("±Ë¡ÿªÔ"));
		hashSet.addMember(new Member("±Ë¡ÿªÁ"));
		hashSet.addMember(new Member("±Ë¡ÿø¿"));
		hashSet.addMember(new Member("±Ë¡ÿ¿∞"));
		hashSet.addMember(new Member("±Ë¡ÿƒ•"));
		hashSet.addMember(new Member("±Ë¡ÿ∆»"));
		
		hashSet.showAllMember();

		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210004, "±Ë»£");
		
		hashSet.showAllMember();
	}

}
