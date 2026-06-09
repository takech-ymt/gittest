package la.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") // 全てのURLリクエストに適用する場合
public class SampleFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 初期化処理
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// --- 【前処理】サーブレットが実行される前に呼ばれる ---
		request.setCharacterEncoding("UTF-8");
		System.out.println("フィルター：リクエストを処理しました。");


		// 次のフィルター、または目的のサーブレットへ処理を渡す
		chain.doFilter(request, response);

		// --- 【後処理】サーブレットの処理が終わり、レスポンスが返る前に呼ばれる ---
		System.out.println("フィルター：レスポンスを返します。");
	}

	@Override
	public void destroy() {
		// 終了処理
	}
}