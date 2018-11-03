package collection;

import java.util.*;
// history 구현하기
public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("history 구현하기");
		
		while(true) {
			System.out.print(">>>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("도움말을 보여줍니다");
					System.out.println("q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input);
					
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println((++i)+"."+it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			}catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		// 최대 입력 크기를 넘으면 처음 입력된 것을 삭제함.
		if(q.size() > MAX_SIZE)
			q.remove();
	}

}
