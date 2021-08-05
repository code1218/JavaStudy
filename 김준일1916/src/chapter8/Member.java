package chapter8;

public class Member implements Comparable<Member> {
	private static int autoMemberId = 20210000;
	private int memberId;
	private String memberName;
	
	public Member(String memberName) {
		this.memberId = ++autoMemberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	@Override
	public String toString() {
		String msg = memberName + " 회원님의 아이디는 " + memberId + "입니다.";
		return msg;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
	@Override
	public int compareTo(Member m) {
		// TODO Auto-generated method stub
		return this.memberId - m.memberId;
	}
}







