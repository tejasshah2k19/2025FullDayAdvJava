<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Internship Registration</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<style>
	body {
		background-color: #f4f6f9;
	}
	.registration-card {
		max-width: 600px;
		margin: 60px auto;
		padding: 30px;
		background: #ffffff;
		border-radius: 10px;
		box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
	}
	.registration-card h1 {
		font-size: 1.75rem;
		margin-bottom: 25px;
		text-align: center;
		color: #2c3e50;
	}
	.error {
		color: #dc3545;
		font-size: 0.875rem;
		display: block;
		margin-top: 4px;
	}
</style>
</head>
<body>

	<div class="container">
		<div class="registration-card">
			<h1>Internship Registration</h1>

			<form action="InternshipRegistrationController" method="post" novalidate>

				<div class="mb-3">
					<label for="name" class="form-label">Name</label>
					<input type="text" class="form-control" id="name" name="name" />
					<span class="error">${nameError}</span>
				</div>

				<div class="mb-3">
					<label for="email" class="form-label">Email</label>
					<input type="text" class="form-control" id="email" name="email" />
					<span class="error">${emailError}</span>
				</div>

				<div class="mb-3">
					<label for="technology" class="form-label">Technology</label>
					<input type="text" class="form-control" id="technology" name="technology" />
					<span class="error">${technologyError}</span>
				</div>

				<div class="mb-3">
					<label for="collegeName" class="form-label">College Name</label>
					<input type="text" class="form-control" id="collegeName" name="collegeName" />
					<span class="error">${collegeNameError}</span>
				</div>

				<div class="d-grid">
					<input type="submit" class="btn btn-primary" value="Register" />
				</div>

			</form>
		</div>
	</div>

</body>
</html>
