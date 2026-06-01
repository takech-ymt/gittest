<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Items</title>
</head>
<body>

	ソート：
	<a href="/jmaster/ItemServlet2?action=sort&key=price_asc" id="sortDesc">値段の低い順</a> ,
	<a href="/jmaster/ItemServlet2?action=sort&key=price_desc" id="sortAsc">値段の高い順</a>
	<br>

	<form action="/jmaster/ItemServlet2" method="post">
		追加：商品名<input type="text" name="name"> 価格<input type="text"
			name="price" size="5">を
		<button>追加</button>
		<input type="hidden" name="action" value="add">
	</form>

	<form action="/jmaster/ItemServlet2" method="post">
		検索：<input type="text" name="price" size="5">円以下の商品を
		<button>検索</button>
		<input type="hidden" name="action" value="search">
	</form>

	<form action="/jmaster/ItemServlet2" method="post">
		削除：商品番号<input type="text" name="code" size="5"> 番の商品を
		<button>削除</button>
		<input type="hidden" name="action" value="delete">
	</form>
	<jsp:include page="${pagetype}" />

	<script src="/js/main.js"></script>
</body>
</html>