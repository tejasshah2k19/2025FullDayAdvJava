<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Amazon Login</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container">
	<div class="row justify-content-center align-items-center min-vh-100">
		<div class="col-11 col-sm-8 col-md-6 col-lg-4">

			<div class="card shadow-sm">
				<div class="card-body p-4">

					<h2 class="card-title text-center mb-4">Amazon Login</h2>

					<form method="post" action="AmazonLoginController">

						<div class="mb-3">
							<label for="email" class="form-label">Email</label>
							<input type="text" class="form-control" id="email" name="email"
								placeholder="Enter your email"/>
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">Password</label>
							<input type="password" class="form-control" id="password" name="password"
								placeholder="Enter your password"/>
						</div>

						<div class="d-grid">
							<input type="submit" class="btn btn-warning" value="Login"/>
						</div>

					</form>

					<div class="text-center mt-3">
						<span>New here?</span>
						<a href="AmazonSignup.jsp">Signup</a>
					</div>

					<div class="text-danger text-center mt-3">${error}</div>

				</div>
			</div>

		</div>
	</div>
</div>

<!-- Bootstrap 5 JS bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>