package com.sample;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.sampleVO;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("sampleMybatisDAO")
public class sampleMybatisDAO extends EgovComAbstractDAO{
	
	/**
	 * 게시판에 대한 목록을 조회한다.
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	
	@SuppressWarnings("unchecked")
	public List<sampleVO> selectSampleList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
