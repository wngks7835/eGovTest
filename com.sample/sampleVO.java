package com.sample;

import java.io.Serializable;

@SuppressWarnings("serial")
public class sampleVO implements Serializable{

    /**
     * 게시물번호
     */
	public int nttNo;
	
    /**
     * 게시물제목
     */	
	public String nttSj = "";
	
    /**
     * 게시물내용
     */	
	public String nttCn = "";
	
    /**
     * 댓글여부
     */
	public String answerAt = "";
	
    /**
     * 부모글번호
     */
	public int parntscttNo;
	
    /**
     * 댓글위치
     */
	public int answerLc; 
	
    /**
     * 정렬순서
     */
	public int sortOrdr;
	
    /**
     * 조회수
     */
	public int rdcnt;
	
    /**
     * 사용여부
     */
	public String useAt = "";
	
    /**
     * 게시시작일
     */
	public String ntceBgnde = "";
	
    /**
     * 게시종료일
     */
	public String ntceEndde = "";
	
    /**
     * 비밀번호
     */
	public String password = "";
	
    /**
     * 첨부파일ID
     */
	public String atchFileId = ""; 
	
    /**
     * 최초등록시점
     */
	public String frstRegistPnttm = "";
	
    /**
     * 최종수정시점
     */
	public String lastUpdtPnttm = "";
	
	public int getNttNo() {
		return nttNo;
	}
	public void setNttNo(int nttNo) {
		this.nttNo = nttNo;
	}
	public String getNttSj() {
		return nttSj;
	}
	public void setNttSj(String nttSj) {
		this.nttSj = nttSj;
	}
	public String getNttCn() {
		return nttCn;
	}
	public void setNttCn(String nttCn) {
		this.nttCn = nttCn;
	}
	public String getAnswerAt() {
		return answerAt;
	}
	public void setAnswerAt(String answerAt) {
		this.answerAt = answerAt;
	}
	public int getParntscttNo() {
		return parntscttNo;
	}
	public void setParntscttNo(int parntscttNo) {
		this.parntscttNo = parntscttNo;
	}
	public int getAnswerLc() {
		return answerLc;
	}
	public void setAnswerLc(int answerLc) {
		this.answerLc = answerLc;
	}
	public int getSortOrdr() {
		return sortOrdr;
	}
	public void setSortOrdr(int sortOrdr) {
		this.sortOrdr = sortOrdr;
	}
	public int getRdcnt() {
		return rdcnt;
	}
	public void setRdcnt(int rdcnt) {
		this.rdcnt = rdcnt;
	}
	public String getUseAt() {
		return useAt;
	}
	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}
	public String getNtceBgnde() {
		return ntceBgnde;
	}
	public void setNtceBgnde(String ntceBgnde) {
		this.ntceBgnde = ntceBgnde;
	}
	public String getNtce_Endde() {
		return ntceBgnde;
	}
	public void setNtce_Endde(String ntce_Endde) {
		this.ntceBgnde = ntce_Endde;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAtchFileId() {
		return atchFileId;
	}
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}
	public String getFrst_RegistPnttm() {
		return frstRegistPnttm;
	}
	public void setFrst_RegistPnttm(String frst_RegistPnttm) {
		this.frstRegistPnttm = frst_RegistPnttm;
	}
	public String getLast_Updt_Pnttm() {
		return lastUpdtPnttm;
	}
	public void setLast_Updt_Pnttm(String last_Updt_Pnttm) {
		this.lastUpdtPnttm = last_Updt_Pnttm;
	}
	
}
