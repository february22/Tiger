/**
 * 로그인 서비스 
 * 
 * @author 김정헌
 * @since 2018.12.02
 *
 */
package com.tokyobridge.tiger.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tokyobridge.tiger.dao.MemberDAO;
import com.tokyobridge.tiger.vo.MemberVO;

@Service
public class LoginService implements LoginServiceIF {

	@Inject
	private MemberDAO dao;
	
	/**
	 * 로그인 할 때, 회원 테이블에서 회원 존재 유무와 로그인을 도와준다.
	 * 
	 * @author 김정헌
	 * @return List<MemberVO>
	 * @throws Exception
	 */
	@Override
	public MemberVO selectMember(MemberVO vo) throws Exception {

		List<MemberVO> list = dao.selectMember(vo);
		if(list == null && list.size()<0) {
			return null;
		}
		return list.get(0);
	}

}
