<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进入聊天室</title>
</head>

<body>
 <% request.setCharacterEncoding("UTF-8");%>
<%String recString = request.getParameter("errMsg"); %>
 <%=recString%>

 
<table background="images/enter.jpg">
<tr>
<td align="center">
<font color=green size=5>登陆界面</font>
<form action=check.jsp method=POST>
<table border=0 style="margin-top:300" >
<tr>
<td bgcolor=yellow>昵称</td><td><input type=text size=20 name=nick></td>
</tr>
<tr>
<td bgcolor=green>密码</td><td><input type=text size=20 name=password></td>
<tr>
<td bgcolor=red>性别</td><td>男
<input type=radio name=sex value=boy.gif checked>
女<input type=radio name=sex value=girl.gif ></td>
</tr>
<tr>
<td bgcolor=blue>喜好颜色</td>
<td><select size=1 name=color>
<option selected>无
<option>红
<option>黄
<option>蓝
<option>绿
</select></td>
</tr>
<tr>
<td bgcolor=green>更新方式</td>
<td><select size=1 name=change>
<option selected>手动更新
<option>每五秒更新
<option>每十秒更新
<option>每三十秒更新
</select></td>
</tr>
<tr align=center><td colspan=2>
<input type=submit name=SEND value=登陆>
<input type=reset value=重新输入></td>
</tr>
</table>
</form>
<font color=red>
<%
String errmsg=request.getParameter("errmsg");
if(errmsg!=null)
	out.print(errmsg);	
request.setCharacterEncoding("gb2312");
 



%>


</font>
</table>
</body>
</html>