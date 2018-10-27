package oop;

class Document{
	static int count = 0;
	String name;
	
	Document(){
		this("제목없음"+(++count));
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 "+this.name+"이 생성되었습니다.");
	}
}
public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("최종");
		Document d3 = new Document();
		Document d4 = new Document("진짜 최종");
	}

}
