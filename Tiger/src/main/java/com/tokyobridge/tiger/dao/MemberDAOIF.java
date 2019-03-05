/**
 * Member Table DAO
 * 
 * @author 김정헌
 * @since 2018.12.02
 * 
 */
package com.tokyobridge.tiger.dao;

import java.util.List;

import com.tokyobridge.tiger.vo.MemberVO;


public interface MemberDAOIF {
	
	/**
	 * 
	 * 회원 관리 테이블의 기본 SELECT문
	 * 会員管理テーブルの基本select文
	 * 
	 * @author 김정헌
	 * @return
	 * @throws Exception
	 */
	public List<MemberVO> selectMember(MemberVO vo)throws Exception;
	
}
