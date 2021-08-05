package chapter8;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("±Ë¡ÿ¿œ"));
		tm.addMember(new Member("±Ë¡ÿ¿Ã"));
		tm.addMember(new Member("±Ë¡ÿªÔ"));
		tm.addMember(new Member("±Ë¡ÿªÁ"));
		tm.addMember(new Member("±Ë¡ÿø¿"));
		tm.addMember(new Member("±Ë¡ÿ¿∞"));
		
		tm.showAllMember();
		
		tm.removeMember(20210005);
		
		tm.showAllMember();
	}

}
