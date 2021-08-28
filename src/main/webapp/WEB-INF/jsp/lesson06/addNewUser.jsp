<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 추가</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>
		
		<!-- <form method="post" action="/lesson06/add_user" id="userForm"> -->
			<label>이름</label> <input type="text" name="name" class="form-control" id="nameInput">
			<label>생년월일</label> <input type="text" name="yyyymmdd" class="form-control" id="yyyymmddInput">
			<label>이메일</label> <input type="text" name="email" class="form-control" id="emailInput">
			<textarea rows="8" class="form-control" name="introduce" id="introduceInput"></textarea>
			
			<button type="button" class="btn btn-success" id="addBtn">추가</button>
		<!-- </form> -->
	</div>
	
	<script>
		$(document).ready(function(){
		//	$("#userForm").on("submit", function(e) {
			$("#addBtn").on("click", function(e) {
				e.preventDefault();
				
				var name = $("#nameInput").val();
				var yyyymmdd = $("#yyyymmddInput").val();
				var email = $("#emailInput").val();
				var introduce = $("#introduceInput").val().trim();
				
				if(name == null || name == "") {
					alert("이름을 입력하세요");
					return;
				}
				
				if(yyyymmdd == null || yyyymmdd == "") {
					alert("생년월일을 입력하세요");
					return;
				}
				
				if(email == null || email == "") {
					alert("이메일을 입력하세요");
					return;
				}
				
				if(introduce == null || introduce == "") {
					alert("자기소개를 입력하세요");
					return;
				}
				
				$.ajax({
					type:"post",
					url:"/lesson06/add_user",
					data:{"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce},
					success:function(data) {
						//result : success or fail
						if(data.result == "success") {
							alert("추가 성공");	
						} else {
							alert("추가 실패");
						}
					},
					error:function(e) {
						alert("error");
					}
				});
			});
		});
	</script>
</body>
</html>