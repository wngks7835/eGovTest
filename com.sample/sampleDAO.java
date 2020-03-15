package com.sample;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.sampleVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("sampleDAO")
public class sampleDAO extends EgovAbstractDAO{
	
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
		return (List<sampleVO>) list("sampleDAO.selectSampleList");
	}

}
