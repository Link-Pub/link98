package me.link98.core.domains;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户日志内容
 * @author Lynk-Lee
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_diary")
public class Diary extends AbstractBean{
	
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}