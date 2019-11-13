package com.mapp.bdi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mapp.bdi.service.TestService;
//jsp에서 안하려고 여기서 함,jsp가 자바로 자바가 클래스 얘를 실행 jsp가 결국엔 서블릿파일로 바뀜
//jsp가 길어짐 mvc패턴
//HttpJspBase가 서블릿파일을 상속받고 있음
//무조건 겟방식
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;//이 클래스임을 증명하는 지문같은 것,메모리 상에서 존재하는 것을 클래스로? 
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		String cmd = uri.substring(6);// /test/ 잘라줌 list만 찍히게 함 
		TestService ts = new TestService();//TestService 호출 
		if("list".equals(cmd)) {//list가 cmd랑 같은지 비교 
			request.setAttribute("list",ts.getList());//리스트 호출
		}
		String path = "/uri/target";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);//uri컨트롤러로 감
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
