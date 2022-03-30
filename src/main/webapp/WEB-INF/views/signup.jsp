<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="../resources/dist/css/adminlte.min.css">

<style type="text/css">
.card-info {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.card-body {
	display: flex;
	flex-direction: column;
	height: 100vh;
	justify-content: center;
	align-items: center;
}

.card-footer {
	display: flex;
	flex-direction: column;
	align-items: center;
}
.form-control {
	
}

/* h3 {
	margin-top: 30px;
} */
.btn-info {
	
}
</style>
</head>
<body>

	<div class="card card-info">
		<!-- <div class="card-header">
			<h3 class="card-title">회원가입</h3>
			<hr />
		</div> -->
		<div>
			<h3>회원가입</h3>
		</div>
		<!-- /.card-header -->
		<!-- form start -->
		<form class="form-horizontal" action="signup.do" method='post'>
			<div class="card-body">

				<div class="form-group row">
					<label for="username" class="col-md-8 col-form-label">이름</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="username"
							placeholder="이름">
					</div>
				</div>
				<div class="form-group row">
					<label for="userid" class="col-md-8 col-form-label">아이디</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userid"
							placeholder="아이디">
					</div>
				</div>
				<div class="form-group row">
					<label for="userpassword" class="col-md-8 col-form-label">비밀번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="userpassword"
							placeholder="비밀번호">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-md-8 col-form-label">이메일</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="" placeholder="이메일">
					</div>


				</div>
				<div class="form-group row">
					<label for="userpassword" class="col-md-8 col-form-label">전화번호</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="userpassword"
							placeholder="전화번호">
					</div>
				</div>
				<div class="form-group row">
					<label for="userpassword" class="col-md-8 col-form-label">주소</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="userpassword"
							placeholder="우편번호">
						<button type='submit'>우편번호 찾기</button>
					</div>
				</div>
				<div class="form-group row">
					<label for="userpassword" class="col-md-8 col-form-label">약관동의</label>
					<div>
						<input type='checkbox' id='allacheck'> <label
							for='allacheck'>전체동의</label>
						<hr />
						<input type='checkbox' id='agree1' required='required'> <label
							for='agree1'>만14세 이상입니다.(필수)</label><br /> <input type='checkbox'
							id='agree2' required='required'> <label for='agree2'>이용약관(필수)</label><br />
						<input type='checkbox' id='agree3' required='required'> <label
							for='agree3'>개인정보수집 및 이용동의(필수)</label><br /> <input
							type='checkbox' id='agree4'> <label for='agree4'>이벤트,프로모션
							알림 메일 및 SMS 수신(선택)</label>
					</div>
				</div>
				<div>
					<button type="submit" class="btn btn-info col-md-9">회원가입하기</button>
				</div>
			</div>

			<!-- /.card-body -->
			<!-- /.card-footer -->
			<div class="card-footer">
				<br /> 이미 아이디가 있으신가요?<a href='login.do'>로그인</a>
			</div>

		</form>
	</div>

</body>
</html>