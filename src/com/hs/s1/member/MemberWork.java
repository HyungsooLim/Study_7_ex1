package com.hs.s1.member;

import java.util.Scanner;

public class MemberWork {

	public MembersDTO memberJoin() {
		MembersDTO membersDTO = new MembersDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력");
		membersDTO.setId(sc.next());
		System.out.println("PW 입력");
		membersDTO.setPw(sc.next());
		System.out.println("이름 입력");
		membersDTO.setName(sc.next());
		System.out.println("생년월일 입력 (yy/mm/dd)");
		membersDTO.setBirth(sc.next());
		System.out.println("전화번호 입력");
		membersDTO.setPhone(sc.next());
		System.out.println("성별 입력 (남자 M, 여자 F)");
		System.out.println(sc.next());
		
		return membersDTO;
	}
}
