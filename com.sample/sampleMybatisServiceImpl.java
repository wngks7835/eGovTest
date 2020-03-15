package com.sample;

import javax.annotation.Resource;

import com.sample.sampleMybatisDAO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

import org.springframework.stereotype.Service;


@Service("sampleMybatisService")
public class sampleMybatisServiceImpl extends EgovAbstractServiceImpl implements sampleMybatisService{
	
	@Resource(name = "sampleMybatisDAO")
	private sampleMybatisDAO sampleMybatisDAO;
}
