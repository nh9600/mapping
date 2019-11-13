package com.mapp.bdi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URIController01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String prefix = "/WEB-INF/view";//앞에 붙는거
	private static final String suffix = ".jsp";//뒤에 붙는거

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		uri=prefix+uri.substring(4)+suffix;// 앞에 web-inf/view+ substring(4)/uri에서 자름 + .jsp, 0번째 방부터
		String msg=(String)request.getAttribute("msg");//msg=test컨트롤러 
		msg+=",난 URIController를 거치지";
		request.setAttribute("msg", msg);//같은 키값으로 
		RequestDispatcher rd = request.getRequestDispatcher(uri);//주소를 연결, 무조건 target.jsp로 가게했음
		rd.forward(request, response);//이제 target.jsp로 감
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
