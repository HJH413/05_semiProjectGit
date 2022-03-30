<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="../resources/dist/css/adminlte.min.css">

 <!-- AdminLTE App -->
<!--<script src="../resources/dist/js/adminlte.min.js"></script> -->

<style type="text/css">
.card-info {
	display: flex;
	flex-direction: column;
	width: 100%;
	height: 100vh;
	justify-content: center;
	align-items: center;
	box-sizing: border-box; margin:0;
	
}

.card-header {
	background: none;
}

.card-bottom {
	display: flex;
	flex-direction: column;
	align-items: center;
}


.btn-info {
	padding: 6px 120px;
	background:#00c2cb;
	border: #00c2cb;
}

</style>

</head>
<body>


	<div class="card card-info">
		<!-- <div class="card-header">
			<img src='../resources/dist/img/logo.png' width='200' height='200'>
			<h3 class="card-title">로그인</h3>
		</div> -->
		<div>
			<img src='../resources/dist/img/logo.png' width='200'>
		</div>
		<!-- /.card-header -->
		<!-- form start -->
		<form class="form-horizontal" action="login.do" method='post'>
			<div class="card-body">
				<div class="form-group row">
					<label for="userid" class="col-md-8 col-form-label">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userid"
							placeholder="아이디" required='required'>
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-md-8 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="비밀번호" required='required'>
					</div>
				</div>
				<div class="form-group row">
					<div class="offset-sm-2 col-sm-10">
						<div class="form-check">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck2"> <label class="form-check-label"
								for="exampleCheck2">아이디 저장</label>
						</div>
					</div>
				</div>
			</div>
			<!-- /.card-body -->
			<div class="card-bottom">
				<button type="submit" class="btn btn-info">로그인</button>
			</div>
			<!-- /.card-footer -->
			
		</form>
			<div>
				<a href='signup.do'>회원가입</a>
			</div>
	</div>


</body>
</html>