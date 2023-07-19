package by.htp.ex.bean;

import java.io.Serializable;

public class News implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String briefNews;
	private String content;
	private String newsDate;
	private String imagePath;
	
	
	
	public News(){}

	public News(int idNews, String title, String briefNews, String content, String newsDate,String imagePath) {
		super();
		this.id = idNews;
		this.title = title;
		this.briefNews = briefNews;
		this.content = content;
		this.newsDate = newsDate;
		this.imagePath = imagePath;
	}

	public Integer getIdNews() {
		return id;
	}

	public void setIdNews(Integer idNews) {
		this.id = idNews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBriefNews() {
		return briefNews;
	}

	public void setBriefNews(String briefNews) {
		this.briefNews = briefNews;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
	}

	public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}	
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", briefNews=" + briefNews 
				+ ", newsDate=" + newsDate + ", imagePath=" + imagePath + "]";
	}	
	

}
