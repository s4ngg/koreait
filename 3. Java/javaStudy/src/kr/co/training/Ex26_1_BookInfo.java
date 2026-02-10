package kr.co.training;

public class Ex26_1_BookInfo {
	private String title;
	private String author;

	// 매개변수 2개를 가지는 생성자를 작성하세요.
	// - 받은 매개변수를 필드에 저장
	Ex26_1_BookInfo(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 두 필드에 대한 getter를 작성하세요.
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}

class Ex26_1_DulicateBookException extends Exception {
	public Ex26_1_DulicateBookException(String msg) {
		super(msg);
	}
}

class Ex26_1_BookNotFoundException extends Exception {
	public Ex26_1_BookNotFoundException (String msg) {
		super(msg);
	}
}

