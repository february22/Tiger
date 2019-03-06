/**
 * Member Table DAO
 * 
 * @author 김정헌
 * @since 2018.12.02
 * 
 */
package com.tokyobridge.tiger.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tokyobridge.tiger.vo.MemberVO;

@Repository
public class MemberDAO implements MemberDAOIF {

	@Inject
	private SqlSession sqlSession;
	
	private static String Namespace = "com.project.tiger.mapper.memberMapper";
	
	/**
	 * 
	 * 회원 관리 테이블의 기본 SELECT문
	 * 会員管理テーブルの基本select文
	 * 
	 * @author 김정헌
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MemberVO> selectMember(MemberVO vo) throws Exception {
		return sqlSession.selectList(Namespace+".selectMember", vo);
	}
	String a="";
}
