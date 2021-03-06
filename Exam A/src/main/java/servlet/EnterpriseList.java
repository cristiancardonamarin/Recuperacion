package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Enterprise;
import service.EnterpriseService;

public class EnterpriseList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EnterpriseService service = new EnterpriseService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Enterprise> listAllEnterprises = service.listAllEnterprises();
		request.setAttribute("listAllEnterprises", listAllEnterprises);
		redirect(request, response);
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/enterpriseList.jsp");
		dispatcher.forward(req, resp);
	}

}
