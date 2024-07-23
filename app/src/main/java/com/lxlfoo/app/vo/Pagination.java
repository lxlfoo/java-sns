package com.lxlfoo.app.vo;

public class Pagination {

	private Integer size;
	private Integer offset;
	private Integer currPage;
	private Integer EndPage;

	private String keyword;	//검색어

	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public Integer getEndPage() {
		return EndPage;
	}
	public void setEndPage(Integer endPage) {
		EndPage = endPage;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
