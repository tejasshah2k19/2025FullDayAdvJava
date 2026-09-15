<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Internship Registration | College Portal</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@700&family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
<style>
	:root {
		--college-primary: #0b3d64;
		--college-accent: #d4a017;
	}
	body {
		background-color: #f2f4f7;
		font-family: 'Poppins', sans-serif;
	}
	.navbar-college {
		background-color: var(--college-primary);
	}
	.navbar-college .navbar-brand {
		font-family: 'Merriweather', serif;
		color: #ffffff;
		font-size: 1.4rem;
		display: flex;
		align-items: center;
		gap: 10px;
	}
	.navbar-college .navbar-brand small {
		display: block;
		font-family: 'Poppins', sans-serif;
		font-size: 0.7rem;
		font-weight: 400;
		color: #cfe0ec;
	}
	.page-banner {
		background: linear-gradient(135deg, var(--college-primary), #145e94);
		color: #ffffff;
		padding: 40px 0;
		text-align: center;
	}
	.page-banner h1 {
		font-family: 'Merriweather', serif;
		font-size: 2rem;
		margin-bottom: 5px;
	}
	.page-banner p {
		margin: 0;
		color: #d9e8f3;
	}
	.registration-card {
		max-width: 650px;
		margin: -40px auto 60px auto;
		padding: 35px 40px;
		background: #ffffff;
		border-radius: 8px;
		border-top: 4px solid var(--college-accent);
		box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
		position: relative;
	}
	.form-label {
		font-weight: 500;
		color: var(--college-primary);
	}
	.btn-college {
		background-color: var(--college-primary);
		color: #ffffff;
		font-weight: 500;
		padding: 10px 0;
	}
	.btn-college:hover {
		background-color: #0d4d7c;
		color: #ffffff;
	}
	.error {
		color: #dc3545;
		font-size: 0.85rem;
		display: block;
		margin-top: 4px;
	}
	footer {
		background-color: var(--college-primary);
		color: #cfe0ec;
		text-align: center;
		padding: 15px 0;
		font-size: 0.85rem;
	}
</style>
</head>
<body>

	 
	<div class="page-banner">
		<h1>Internship Registration</h1>
		<p>Fill in your details below to register for upcoming internship opportunities</p>
	</div>

	<div class="container">
		<div class="registration-card">

			<form action="InternshipRegistrationController" method="post" novalidate>

				<div class="mb-3">
					<label for="name" class="form-label">Full Name</label>
					<input type="text" class="form-control" id="name" name="name" placeholder="Enter your full name" />
					<span class="error">${nameError}</span>
				</div>

				<div class="mb-3">
					<label for="email" class="form-label">Email Address</label>
					<input type="text" class="form-control" id="email" name="email" placeholder="Enter your college email" />
					<span class="error">${emailError}</span>
				</div>

				<div class="mb-3">
					<label for="technology" class="form-label">Preferred Technology</label>
					<input type="text" class="form-control" id="technology" name="technology" placeholder="e.g. Java, Python, Web Development" />
					<span class="error">${technologyError}</span>
				</div>

				<div class="mb-4">
					<label for="collegeName" class="form-label">College Name</label>
					<input type="text" class="form-control" id="collegeName" name="collegeName" placeholder="Enter your college name" />
					<span class="error">${collegeNameError}</span>
				</div>

				<div class="d-grid">
					<input type="submit" class="btn btn-college" value="Register Now" />
				</div>

			</form>
		</div>
	</div>

	<footer>
		&copy; <%= java.time.Year.now() %> XYZ College of Engineering. All rights reserved.
	</footer>

</body>
</html>
