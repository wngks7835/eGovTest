package com.sample;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.sampleService;

@Controller
public class sampleController{
	
	@Resource(name = "sampleService")
	private sampleService sampleService;

	@RequestMapping("/sampleList.do")
	public String sampleList(HttpServletRequest request, HttpServletResponse response, Model model ) throws Exception {
		System.out.println("여긴 타니 ?");
		List<sampleVO> result = null;
		try {
			result = sampleService.selectSampleList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		model.addAttribute("sampleList", result);
		
		
		System.out.println(result+"결과");
		return "/sampleList";
	}
	
	@RequestMapping("/sampleRegist.do")
	public String sampleRegist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		return "/sampleRegist";
	}
	
	@RequestMapping("/sampleInsert.do")
	public String sampleInsert(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		sampleVO sampleVO = null;
		try {
			System.out.println(sampleVO.getNttCn() + "-----------------------결과 ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		return "redirect:/sampleList.do";
	}
}
