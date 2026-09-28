<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Amazon Order</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex flex-column min-vh-100">



<jsp:include page="Nav.jsp"></jsp:include>



<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-12 col-md-8 col-lg-6">

			<div class="card shadow-sm">
				<div class="card-body p-4 text-center">

					<h2 class="card-title mb-4">Amazon Order</h2>

					<div class="d-grid">
						<a href="AmazonWishList.jsp" class="btn btn-warning">WishList</a>
					</div>

				</div>
			</div>

		</div>
	</div>
</div>

<%@include file="AmazonFooter.jsp" %>
<!-- Bootstrap 5 JS bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>