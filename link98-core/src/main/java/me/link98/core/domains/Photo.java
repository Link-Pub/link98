package me.link98.core.domains;

/**
 * 用户照片
 * @author Lynk-Lee
 *
 */
@SuppressWarnings("serial")
public class Photo extends AbstractBean{
	
	/**
	 * 路径
	 */
	private String path;
	/**
	 * 描述
	 */
	private String describe;
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
}
