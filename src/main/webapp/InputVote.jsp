<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card shadow-sm">
        <div class="card-body p-4">
          <h3 class="card-title mb-4 text-center">Registration</h3>
          <form action="VoteServlet" method="post">

            <div class="mb-3">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" id="name" name="name">
            </div>

            <div class="mb-3">
              <label for="birthYear" class="form-label">Birth Year</label>
              <input type="text" class="form-control" id="birthYear" name="birthYear">
            </div>

            <div class="mb-3">
              <label class="form-label d-block">Gender</label>
              <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" id="genderMale" value="male">
                <label class="form-check-label" for="genderMale">Male</label>
              </div>
              <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" id="genderFemale" value="female">
                <label class="form-check-label" for="genderFemale">Female</label>
              </div>
            </div>

            <div class="d-grid">
              <input type="submit" class="btn btn-primary" value="Submit">
            </div>

          </form>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
</body>
</html>