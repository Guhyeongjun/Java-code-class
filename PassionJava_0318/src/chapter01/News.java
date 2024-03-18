package chapter01;

public class News {
	String title;
	String content;
	
	public void setNews(String sTitle, String sContent) {
		title = sTitle;
		content = sContent;
	}
	
	public void getNews() {
		System.out.println("뉴스 제목 : ");
		System.out.println(title);
		System.out.println("뉴스 내용 : ");
		System.out.println(content);
	}
	
	public static void main(String[] args) {
		//클래스는 인스턴스 생성해서 사용
		News news = new News();
		news.setNews("30만원대 갤럭시 출시", "2024년 출시 임박");
		news.getNews();
	}
}
