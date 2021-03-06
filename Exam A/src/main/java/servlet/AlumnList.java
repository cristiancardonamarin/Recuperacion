package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Alumn;
import service.AlumnService;

public class AlumnList extends HttpServlet {
	private AlumnService service = new AlumnService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Alumn> listAllAlumns = service.listAllAlumns();
		request.setAttribute("listAllAlumns", listAllAlumns);
		redirect(request, response);
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/enterpriseList.jsp");
		dispatcher.forward(req, resp);
	}
}
