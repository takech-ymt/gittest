package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/PaymentServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 * 
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String payment = request.getParameter("pay");

		String[] values = request.getParameterValues("site");
		System.out.println("@@@@@@@@@@@");

		String selectedPayment;
		if (payment == null) {
			selectedPayment = "選択されていません。";

		} else {
			switch (payment) {
			case "card":
				selectedPayment = "クレジットカード";
				break;
			case "bank":
				selectedPayment = "銀行振込";
				break;
			case "cash":
				selectedPayment = "代引き";
				break;
			default:
				selectedPayment = "???";
				break;
			}
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Payment</title></head><body>");
		out.println("あなたが選択した尾白原い方法は以下の通り");
		out.println(selectedPayment);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	//			throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//		response.setContentType("text/html;charset=UTF-8");
	//		PrintWriter out = response.getWriter();
	//
	//		out.println("<html><head><title>HelloServlet</title></head><body>");
	//
	//		out.println("<h1>ようa</h1>");
	//		out.println("</body></html>");
	//	}

}
