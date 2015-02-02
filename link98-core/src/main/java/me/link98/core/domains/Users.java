package me.link98.core.domains;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户信息
 * @author Lynk-Lee
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_users")
public class Users extends AbstractBean{
	
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户头像路径
	 */
	private String headPhotoImg;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 座右铭
	 */
	private String motto;
	/**
	 * 生活照路径
	 */
	private String lifeShow;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 职业，多个以‘|’分割
	 */
	private String profession;
	
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadPhotoImg() {
		return headPhotoImg;
	}
	public void setHeadPhotoImg(String headPhotoImg) {
		this.headPhotoImg = headPhotoImg;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
	public String getLifeShow() {
		return lifeShow;
	}
	public void setLifeShow(String lifeShow) {
		this.lifeShow = lifeShow;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}
