package oop2;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML"); // 클래스 메서드
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("index.html");		
	}

}

interface Parseable{
	public abstract void parse(String fileName);
}

class ParserManager{
	public static Parseable getParser(String type) { // Parseable이 구현된 클래스의 인스턴스가 반환됨.(클래스메서드)
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}


class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName +"-XML parsing completed");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName +"-HTML parsing completed");
	}
}