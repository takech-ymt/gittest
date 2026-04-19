package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlusServlet2")
public class PlusServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// リクエストパラメータの読み込み
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		if (num1 == null || num1.length() == 0 || num2 == null
				|| num2.length() == 0) {
			// 未入力データあり
			showNotEnteredError(out);
			return;
		}

		// 足し算の実行
		int answer = 0;
		try {
			int i1 = Integer.parseInt(num1);
			int i2 = Integer.parseInt(num2);
			answer = i1 + i2;
		} catch (NumberFormatException e) {
			// 整数ではない
			showNotIntegerError(out);
			return;
		}

		// 答えの出力
		out.println("<html><head><title>Plus</title></head><body>");
		out.println(num1 + "+" + num2 + "=" + answer);
		out.println("</body></html>");
	}

	private void showNotEnteredError(PrintWriter out) {
		out.println("<html><head><title>Plus</title></head><body>");
		out.println("<h1>整数を２つ入力してください</h1>");
		out.println("</body></html>");
	}

	private void showNotIntegerError(PrintWriter out) {
		out.println("<html><head><title>Plus</title></head><body>");
		out.println("<h1>整数ではない値が入力されました</h1>");
		out.println("</body></html>");
	}
}