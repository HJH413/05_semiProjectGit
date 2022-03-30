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
	background:#f5f6f7;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.card-body {
	display: flex;
	flex-direction: column;
	height: 100%;
	justify-content: center;
	align-items: center;
}

.card-footer {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.card-body>div input {

	width:350px;
}
#logo {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	margin-top: 50px;
	margin-bottom: 20px;
	margin-left:10px;
}

h2 {
	/* margin-top: 50px; */
	font-weight: bold;
}

#card-body2 #check #allcheck {
	width:50px;
}
#card-body2 #check #agree1 {
	width:50px;
}
#card-body2 #check #agree2 {
	width:50px;
}
#card-body2 #check #agree3 {
	width:50px;
}
#card-body2 #check #agree4 {
	width:50px;
}

#signupbtn {
	margin-top:50px;
	width:370px;
	background-color:#00c2cb;
	border:#00c2cb;
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
			<img src='../resources/dist/img/logo.png' width='100' id='logo'>
			<h2>회원가입</h2>
		</div>
		<!-- /.card-header -->
		<!-- form start -->
		<form class="form-horizontal" action="insertAccount.do" method='post'>
			<div class="card-body">

				<div class="form-group">
					<label for="username" class="col-md-8 col-form-label">이름</label>
					<input type="text" class="form-control" id="username" placeholder="이름" name="account_Name">
				</div>
				<div class="form-group" >
					<label for="userid"  class="col-md-8 col-form-label">아이디</label>
					<input type="text" class="form-control" id="userid" placeholder="아이디" name="account_Id">
				</div>
				<div class="form-group"> 
					<label class="col-md-8 col-form-label">비밀번호</label>
					<input type="password" class="form-control" id="userpassword" placeholder="비밀번호" name="account_Password">
				</div>
				<div class="form-group">
					<label for="useremail" class="col-md-8 col-form-label">이메일</label>
					<input type="email" class="form-control" id="useremail" placeholder="이메일" name="account_Email">
				</div>
				<div class="form-group">
					<label for="usertel" class="col-md-8 col-form-label">전화번호</label>
					<input type="text" class="form-control" id="usertel" placeholder="전화번호" name="account_Tel">

				</div>
				<div class="form-group ">
					<label for="useraddr" class="col-md-8 col-form-label">주소</label><button>주소찾기</button>
					<input type="text" class="form-control" id="useraddr" placeholder="우편번호" name="account_Addr">
					<input type="text" class="form-control" id="useraddr" placeholder="주소">
					<input type="text" class="form-control" id="useraddr" placeholder="상세주소">
				</div>
				<br/>
				
	
			
				
			<div class="card-body" id=card-body2>
					<div class="form-group" id='check'>
					<label for="userpassword" >약관동의</label>
						<div>
							<input type='checkbox' id='allcheck'> 
							<label for='allcheck'>전체동의</label><hr/>
							
							<input type='checkbox' id='agree1' required> 
							<label for='agree1'>(필수)만14세 이상입니다.</label><br/> 
							
							<input type='checkbox' id='agree2' required> 
							<label for='agree2'>(필수)이용약관</label><br/>
							
							<input type='checkbox' id='agree3' required> 
							<label for='agree3'>(필수)개인정보수집 및 이용동의</label><br/> 
							
							<input type='checkbox' id='agree4'> 
							<label for='agree4'>(선택)이벤트,프로모션 알림 메일 및 SMS 수신</label>
						</div>
				</div>
			</div>
				
				<div class='card-bottom'>
					<button type="submit" class="btn btn-info" id='signupbtn'>회원가입</button>
				</div>
					<br/><p>이미 아이디가 있으신가요? <a href='login.do' id='loginlink'>로그인</a></p><br/><br/>
			</div>

			<!-- /.card-body -->
			<!-- /.card-footer -->
			<!-- <div class="card-footer" id='card-footer'>
				
			</div> -->

				<!-- FOOTER -->
				<footer id="footer">
					<!-- top footer -->
					<div class="section">
						<!-- container -->
						<div class="container">
							<!-- row -->
							<div class="row">
								<div class="col-md-3 col-xs-6"></div>
								<div class="clearfix visible-xs"></div>
							</div>
							<!-- /row -->
						</div>
						<!-- /container -->
					</div>
					<!-- /top footer -->
			
					<!-- bottom footer -->
					<div id="bottom-footer" class="section">
						<div class="container">
							<!-- row -->
							<div class="row">
								<div class="col-md-12 text-center">
			
									<span class="copyright"> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
										Copyright &copy;<script>document.write(new Date().getFullYear());</script>
										All rights reserved | This template is made with <i
										class="fa fa-heart-o" aria-hidden="true"></i> by <a
										href="https://colorlib.com" target="_blank">Colorlib</a> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
									</span>
								</div>
							</div>
							<!-- /row -->
						</div>
						<!-- /container -->
					</div>
					<!-- /bottom footer -->
				</footer>
		</form>
	</div>



</body>
</html>