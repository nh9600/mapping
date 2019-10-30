package com.mapp.bdi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//jsp에서 안하려고 여기서 함,jsp가 자바로 자바가 클래스 얘를 실행 jsp가 결국엔 서블릿파일로 바뀜
//jsp가 길어짐 mvc패턴?
//HttpJspBase가 서블릿파일을 상속받고 있음
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;//이 클래스임을 증명하는 지문같은 것,메모리 상에서 존재하는 것을 클래스로? 
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
