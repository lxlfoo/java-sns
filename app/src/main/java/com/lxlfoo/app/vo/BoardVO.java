package com.lxlfoo.app.vo;

/** 게시판 */
public class BoardVO {

	private Integer brdNo;	//일련번호
	private String content;	//내용
	private String link;		//외부링크
	private String lnkSrc;	//외부링크소스
	private String ip;		//IP

	private String auth;		//권한
	private String flag;		//삭제여부(Y/N)
	private String crtDt;	//생성일
	private String crtId;	//생성자
	private String modDt;	//수정일
	private String modId;	//수정자

	private String currPage;	//현재페이지
	private String type;		//R: 등록, M: 수정
	private String dt;		//생성일 (수정일 있으면 수정일)
	private String editYn;	//수정여부

	public Integer getBrdNo() {
		return brdNo;
	}
	public void setBrdNo(Integer brdNo) {
		this.brdNo = brdNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLnkSrc() {
		return lnkSrc;
	}
	public void setLnkSrc(String lnkSrc) {
		this.lnkSrc = lnkSrc;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
	public String getCurrPage() {
		return currPage;
	}
	public void setCurrPage(String currPage) {
		this.currPage = currPage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getEditYn() {
		return editYn;
	}
	public void setEditYn(String editYn) {
		this.editYn = editYn;
	}
}
