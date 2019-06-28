package com.fyy.po;

public class User {
    private Integer id;
    private String userId;
    private String userName;
    private String gender;
    private String enterYear;
    private String className;
    private String majorIn;
    private String selectedSignal;

    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(String enterYear) {
        this.enterYear = enterYear;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajorIn() {
        return majorIn;
    }

    public void setMajorIn(String majorIn) {
        this.majorIn = majorIn;
    }

    public String getSelectedSignal() {
        return selectedSignal;
    }

    public void setSelectedSignal(String selectedSignal) {
        this.selectedSignal = selectedSignal;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userName=" + userName + ", gender=" + gender
				+ ", enterYear=" + enterYear + ", className=" + className + ", majorIn=" + majorIn + ", selectedSignal="
				+ selectedSignal + "]";
	}
    
}