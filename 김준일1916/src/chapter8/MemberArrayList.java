package chapter8;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member m) {
		arrayList.add(m);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member m = arrayList.get(i);
			if(m.getMemberId() == memberId) {
				System.out.println(arrayList.remove(i));
				System.out.println();
				return true;
			}
		}
		System.out.println(memberId + "가 ArrayList에 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	
	public boolean modifyMember(int memberId, String modifyMemberName) {
		for(Member m : arrayList) {
			if(m.getMemberId() == memberId) {
				String preName = m.getMemberName();
				m.setMemberName(modifyMemberName);
				System.out.println("<수정된 " + m.getMemberId() + " Member정보>");
				System.out.println(preName + " -> " + m.getMemberName());
				System.out.println();
				return true;
			}
		}
		System.out.println(memberId + "가 ArrayList에 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member m = arrayList.get(i);
			System.out.println(m);
		}
		System.out.println();
	}
}




