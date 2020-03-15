package com.sample;

import java.util.List;

import javax.annotation.Resource;

import com.sample.sampleVO;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

import com.sample.sampleDAO;

import org.springframework.stereotype.Service;

@Service("sampleService")
public class sampleServiceImpl extends AbstractServiceImpl  implements sampleService {

	@Resource(name = "sampleDAO")
	private sampleDAO sampleDAO;
	
	/**
	 * 게시판 목록 조회.
	 *
	 * @see com.sample.sampleService#selectSampleInfo(com.sample.sampleVO)
	 */
	@Override
	public List<sampleVO> selectSampleList() throws Exception {
		// TODO Auto-generated method stub
		return sampleDAO.selectSampleList();
	}


}
