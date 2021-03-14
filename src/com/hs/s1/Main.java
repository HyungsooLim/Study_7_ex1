package com.hs.s1;

import java.util.Scanner;

import com.hs.s1.member.MemberWork;
import com.hs.s1.member.MembersDAO;
import com.hs.s1.member.MembersDTO;

public class Main {

	public static void main(String[] args) {
		MembersDAO membersDAO = new MembersDAO();
		MemberWork memberWork = new MemberWork();
		MembersDTO membersDTO = new MembersDTO();
		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean check = true;
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. ID / PW 찾기");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				membersDTO=memberWork.memberJoin();
				try {
					result=membersDAO.memberJoin(membersDTO);
					if(result!=0) {
						System.out.println("회원가입 성공");
					}else {
						System.out.println("회원가입 실패");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("로그인 성공");
				break;
			case 3:
				System.out.println("ID / PW 찾기 성공");
				break;
			case 4:
				check = false;
				break;
			}
		}// === while END ===
		System.out.println("--- 프로그램 종료 ---");
	}// === main method END ===
}
