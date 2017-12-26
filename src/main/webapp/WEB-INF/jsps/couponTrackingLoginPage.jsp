<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<body>
<div class="form-style-10">
<h1>Login In!<span>Plan Your Perfect Trip Using this Site!</span></h1>


<div id="div"> </div>
<div class="section">


<!-- <form  method="post" action="distance"> -->
<form  method="post" action="loginUser">
<label>User Name :</label>
<input type="text" name="username" class="usernameC"  id="username"/> <span class="status"></span>
<label>Password :</label>
<input type="password" name="password"  class="passwordC" id="password"/>
<br>
    <span class="privacy-policy">
     <input type="checkbox" id = "check_id" name="field7" >You agree to our Terms and Policy. 
     </span>
     
  <br>   
<input type="submit" id="submit" class ="disabled" value="loginUser" />
</form>
</div>


<div class="button-section">
<form  method="post" action="loginUser">
<input type="submit" id="submit1" class= "disabled" value="registerUser" />


</form>
</div>


<div class="button-section">
<form  method="post" action="loginUser">
<input type="submit" id="submit1" class= "disabled" value="forgotCredential" />


</form>
</div>

</div>
</div>
</body>
</html>
