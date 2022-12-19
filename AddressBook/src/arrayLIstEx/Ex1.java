package arrayLIstEx;

import externalExample.ProgramInfo;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ProgramInfo.print("ArrayList 실습", "차재건", 1.0);
		ArrayList<String> aList1 = new ArrayList<String>();
		
		// ArrayList에 입력하기
		aList1.add("일지매");
		aList1.add("홍길동");
		aList1.add("일지매");
		
		// ArrayList 전부 출력
		System.out.println(aList1);
		
		// ArrayList 1번째 내용 출력
		System.out.println(aList1.get(0));
		
		// ArrayList에 일지매가 있는지 조회하여 출력
		int cnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "일지매") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		
		if (cnt == 0) System.out.println("자료가 없습니다.");
		
		// 첫 번째 일지매를 일지순으로 바꾸기
		aList1.set(0,"일지순");
		System.out.println(aList1);
		
		// 일지순을 지우기
		aList1.remove("일지순");
		System.out.println(aList1);
		
		System.out.println("=".repeat(36));
		
		// 내 이름 2번 넣기
		aList1.add("차재건");
		aList1.add("차재건");
		
		// ArrayList 전체 출력
		System.out.println(aList1);
		
		// 차재건을 지우기
		aList1.remove("차재건");
		
		// ArrayList에 차재건이 있는지 조회하여 출력
		int chaCnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "차재건") {
				chaCnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		
		if (chaCnt == 0) System.out.println("자료가 없습니다.");

		// ArrayList 전체 출력
		System.out.println(aList1);
	}
}
