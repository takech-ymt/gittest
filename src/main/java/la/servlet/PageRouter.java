package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageRouter {

	// ページの遷移先を指定
	public void gotoPage(HttpServletRequest request,
			HttpServletResponse response, String page) throws ServletException,
			IOException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	
	// ページの遷移先を指定し、遷移先ページのコンポーネントのタイプを指定（pageType）
	public void gotoPage(HttpServletRequest request,
			HttpServletResponse response, String page, String pageType) throws ServletException,
			IOException {
		request.setAttribute("pagetype", pageType);
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
