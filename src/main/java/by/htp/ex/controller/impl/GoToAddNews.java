package by.htp.ex.controller.impl;

import java.io.IOException;
import java.util.Locale;

import by.htp.ex.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToAddNews implements Command{

	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute(RequestParam.JSP_ACTION_PARAM_NAME, RequestParam.ADD_NEWS);
		request.setAttribute(RequestParam.JSP_LOCALE_PARAM_NAME, Locale.getDefault());
		request.getRequestDispatcher("/WEB-INF/pages/tiles/addNews.jsp").forward(request, response);

	}
}
