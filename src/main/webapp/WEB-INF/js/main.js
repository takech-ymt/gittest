document.addEventListener("DOMContentLoaded", () => {
	const sortAsc = document.getElementById("sortAsc");

	sortAsc.addEventListener("click", (e) => {
	    e.preventDefault(); // ← 通常のページ遷移を止める

	    const url = sortAsc.getAttribute("href");

		fetch("/jmaster/ItemServlet2?action=sort&key=price_asc")
		  .then(res => res.text())
		  .then(html => {
		      document.getElementById("tableArea").innerHTML = html;
		  });
	        .catch(err => console.error("通信エラー:", err));
	});
});
