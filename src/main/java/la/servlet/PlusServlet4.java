package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlusServlet4")
public class PlusServlet4 extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // リクエストパラメータの読み込み
        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");

        // 足し算の実行
        int i1 = Integer.parseInt(num1);
        int i2 = Integer.parseInt(num2);
        int answer = i1 + i2;

        // リクエストスコープに必要なデータを入れる
        request.setAttribute("data1",1);
        request.setAttribute("data2", Integer.valueOf(i2));
        request.setAttribute("answer", Integer.valueOf(answer));

        // リクエストをAnswerServletに転送する
        RequestDispatcher rd = request.getRequestDispatcher("/AnswerServlet");
        rd.forward(request, response);
    }
}