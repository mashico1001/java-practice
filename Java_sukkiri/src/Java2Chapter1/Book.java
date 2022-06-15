package Java2Chapter1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		
		if (o == null) {
			return false;
		}
		
		if (!(o instanceof Book)) {
			return false;
		} Book b = (Book)o;
		
		if (!(this.title.equals(b.title) && this.publishDate.equals(b.publishDate))) {
			return false;
		} return true;
		
	}
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	
	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}

}
