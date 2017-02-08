<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/includes/taglibs.jsp"%>

<title>Login</title>

<div class="container-fluid">
	<div id="page-login" class="row">
		<div class="col-xs-12 col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
			<div class="text-right" style="display: none">
				<a href="page_register.html" class="txt-default">Need an account?</a>
			</div>
			<div class="box">
				<div class="box-content">
					<form id="loginForm" class="loginbox" name="loginForm" action="j_spring_security_check" method="post">
					
						<div class="text-center">
							<h3 class="page-header">Login Page</h3>
						</div>
						<div class="form-group">
							<label class="control-label">Username</label>
							
							<input type="text"
								class="form-control" id="j_username" placeholder="Tên đăng nhập" name="j_username" />
						</div>
						<div class="form-group">
							<label class="control-label">Password</label>
							
							<input type="password"
								class="form-control" id="j_password" placeholder="Mật khẩu" name="j_password" />
						</div>
						<div class="text-center">
							<c:if test="${not empty param.authfailed}">
								<div class="error txtcenter" style="margin-bottom: 8px">
									Tên đăng nhập hoặc mật khẩu không chính xác
								</div>
								<div style="display: none;">
									Lỗi:
									<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
								</div>
							</c:if>

							<button class="btn btn-primary">Đăng nhập</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>