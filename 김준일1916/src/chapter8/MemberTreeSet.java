package chapter8;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member m) {
		treeSet.add(m);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member m = ir.next();
			if(m.getMemberId() == memberId) {
				System.out.println(m);
				System.out.println(m.getMemberName()+"님의 정보를 삭제합니다.");
				System.out.println();
				treeSet.remove(m);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
}
