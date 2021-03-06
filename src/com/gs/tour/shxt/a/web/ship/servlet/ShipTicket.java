package com.gs.tour.shxt.a.web.ship.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.tour.shxt.a.web.ship.service.WebShipService;

/**
 * Servlet implementation class ShipTicket
 */
@WebServlet("/ShipTicket.html")
public class ShipTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebShipService webShipService=new WebShipService();
		request.setAttribute("ship", webShipService.getShipList());
		request.getRequestDispatcher("WEB-INF/web/ship/ship.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
