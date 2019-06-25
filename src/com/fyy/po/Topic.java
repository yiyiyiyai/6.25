package com.fyy.po;


import java.util.Date;


public class Topic{	
	private Integer id;
	private String topicId;
	private String topicName;
	private String topicYear;
	private String demand;	//课题要求
	private int numberLimit; //课题容量
	private String majorLimit; //课题限制
	private Date deadline;	//最后期限
	private String releaseSingal;	//是否已经发布
	private Teachers teacher;
	
	
	public Teachers getTeacher() {
		return teacher;
	}
	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicYear() {
		return topicYear;
	}
	public void setTopicYear(String topicYear) {
		this.topicYear = topicYear;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public int getNumberLimit() {
		return numberLimit;
	}
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	public String getMajorLimit() {
		return majorLimit;
	}
	public void setMajorLimit(String majorLimit) {
		this.majorLimit = majorLimit;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getReleaseSingal() {
		return releaseSingal;
	}
	public void setReleaseSingal(String releaseSingal) {
		this.releaseSingal = releaseSingal;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", topicId=" + topicId + ", topicName=" + topicName + ", topicYear=" + topicYear
				+ ", demand=" + demand + ", numberLimit=" + numberLimit + ", majorLimit=" + majorLimit + ", deadline="
				+ deadline + ", releaseSingal=" + releaseSingal + "]";
	}
	
	
}
