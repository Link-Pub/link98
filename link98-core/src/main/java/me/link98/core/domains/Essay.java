package me.link98.core.domains;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 随笔
 * @author Lynk-Lee
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_essay")
public class Essay extends AbstractBean{
	
	/**
	 * 内容
	 */
	private String content;
	
	

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
