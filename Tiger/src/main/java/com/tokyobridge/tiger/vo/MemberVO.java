package com.tokyobridge.tiger.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
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
}
