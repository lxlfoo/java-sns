package com.lxlfoo.app.vo;

/** 사용자 */
public class UserVO {

	private String id;		//ID (test)
	private String pwd;		//비밀번호
	private String name;		//이름
	private String email;	//이메일

	private String auth;		//권한
	private String flag;		//삭제여부(Y/N)
	private String crtDt;	//생성일
	private String crtId;	//생성자
	private String modDt;	//수정일
	private String modId;	//수정자

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCrtDt() {
		return crtDt;
	}
	public void setCrtDt(String crtDt) {
		this.crtDt = crtDt;
	}
	public String getCrtId() {
		return crtId;
	}
	public void setCrtId(String crtId) {
		this.crtId = crtId;
	}
	public String getModDt() {
		return modDt;
	}
	public void setModDt(String modDt) {
		this.modDt = modDt;
	}
	public String getModId() {
		return modId;
	}
	public void setModId(String modId) {
		this.modId = modId;
	}
}
