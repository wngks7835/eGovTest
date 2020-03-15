package com.sample;

import java.util.List;

import com.sample.sampleVO;

public interface sampleService {
    
	/**
     * 게시판 목록 조회
     *
     * @param svo
     * @return
     * @throws Exception
     */
    public List<sampleVO> selectSampleList() throws Exception;
}
