package com.mapp.bdi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URIController02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX ="WEF-INF";
	private static final String SUFFIX =".jsp";

	private static final String getFowardURI(HttpServletRequest request) {
		return PREFIX+request.getRequestURI()+SUFFIX;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(getFowardURI(request));
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
