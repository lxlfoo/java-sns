package com.lxlfoo.app.vo;

/** SSO */
public class SsoVO {

	private Integer ssnNo;	//시즌번호
	private String epNo;		//에피소드번호
	private String epTtl;	//에피소드제목
	private String content;	//내용
	private String trans;	//번역본
	private String illust;	//삽화
	private String bgm;		//배경음악

	private String auth;		//권한
	private String flag;		//삭제여부(Y/N)
	private String crtDt;	//생성일
	private String crtId;	//생성자
	private String modDt;	//수정일
	private String modId;	//수정자

	private String type;		//R: 등록, M: 수정

	public Integer getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(Integer ssnNo) {
		this.ssnNo = ssnNo;
	}
	public String getEpNo() {
		return epNo;
	}
	public void setEpNo(String epNo) {
		this.epNo = epNo;
	}
	public String getEpTtl() {
		return epTtl;
	}
	public void setEpTtl(String epTtl) {
		this.epTtl = epTtl;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	public String getIllust() {
		return illust;
	}
	public void setIllust(String illust) {
		this.illust = illust;
	}
	public String getBgm() {
		return bgm;
	}
	public void setBgm(String bgm) {
		this.bgm = bgm;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
