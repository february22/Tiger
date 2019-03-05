package com.tokyobridge.tiger.vo;

import java.io.Serializable;

public class MemberVO implements Serializable{
	
	/** Index (PK)*/
	private Integer index_no;
	/** Del Sign 삭제싸인 1이면 삭제된 데이터*/
	private String del_sign;
	/** User Id */
	private String user_id;
	/** User Password*/
	private String user_pw;
	/** User Name */
	private String user_nm;
	/** Responsibility 직책 회원:0 관리자:9*/
	private String responsibility;
	/** Spare Flag 예비플레그 1*/
	private String spare_flg1;
	/** Spare Flag 예비플레그 2*/
	private String spare_flg2;
	/** Spare Flag 예비플레그 3*/
	private String spare_flg3;
	/** Spare Flag 예비플레그 4*/
	private String spare_flg4;
	/** Spare Flag 예비플레그 5*/
	private String spare_flg5;

	
	public MemberVO() {
		super();
	}
	
	
	public Integer getIndex_no() {
		return index_no;
	}
	public void setIndex_no(Integer index_no) {
		this.index_no = index_no;
	}
	public String getDel_sign() {
		return del_sign;
	}
	public void setDel_sign(String del_sign) {
		this.del_sign = del_sign;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_nm;
	}
	public void setUser_name(String user_nm) {
		this.user_nm = user_nm;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getSpare_flg1() {
		return spare_flg1;
	}
	public void setSpare_flg1(String spare_flg1) {
		this.spare_flg1 = spare_flg1;
	}
	public String getSpare_flg2() {
		return spare_flg2;
	}
	public void setSpare_flg2(String spare_flg2) {
		this.spare_flg2 = spare_flg2;
	}
	public String getSpare_flg3() {
		return spare_flg3;
	}
	public void setSpare_flg3(String spare_flg3) {
		this.spare_flg3 = spare_flg3;
	}
	public String getSpare_flg4() {
		return spare_flg4;
	}
	public void setSpare_flg4(String spare_flg4) {
		this.spare_flg4 = spare_flg4;
	}
	public String getSpare_flg5() {
		return spare_flg5;
	}
	public void setSpare_flg5(String spare_flg5) {
		this.spare_flg5 = spare_flg5;
	}
	@Override
	public String toString() {
		return "MemberVO [index_no=" + index_no + ", del_sign=" + del_sign + ", user_id=" + user_id + ", user_pw="
				+ user_pw + ", user_nm=" + user_nm + ", responsibility=" + responsibility + ", spare_flg1="
				+ spare_flg1 + ", spare_flg2=" + spare_flg2 + ", spare_flg3=" + spare_flg3 + ", spare_flg4="
				+ spare_flg4 + ", spare_flg5=" + spare_flg5 + "]";
	}
	
	
	


	

	
}
