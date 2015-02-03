package me.link98.core.domains;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户行为记录
 * @author Lynk-Lee
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="t_user_behavior")
public class UserBehavior extends AbstractBean{
	
	/**
	 * 所属用户
	 */
	private Integer userId;
	/**
	 * 记录类型
	 * 1.写日志
	 * 2.上传照片
	 * 3.写随笔
	 */
	private Integer type;
	/**
	 * 类型所对应内容所在表的id
	 */
	private Integer contentId;
	/**
	 * 创建时间
	 */
	private Timestamp createDate;
	
	/**
	 * 以下3个实体，用来存放具体数据
	 */
	private List<Diary> diary;
	private List<Photo> photo;
	private List<Essay> essay;
	

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public List<Diary> getDiary() {
		return diary;
	}
	public void setDiary(List<Diary> diary) {
		this.diary = diary;
	}
	public List<Photo> getPhoto() {
		return photo;
	}
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	public List<Essay> getEssay() {
		return essay;
	}
	public void setEssay(List<Essay> essay) {
		this.essay = essay;
	}
	
	
}
