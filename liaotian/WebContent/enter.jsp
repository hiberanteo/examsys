<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>����������</title>
</head>

<body>
 <% request.setCharacterEncoding("UTF-8");%>
<%String recString = request.getParameter("errMsg"); %>
 <%=recString%>

 
<table background="images/enter.jpg">
<tr>
<td align="center">
<font color=green size=5>��½����</font>
<form action=check.jsp method=POST>
<table border=0 style="margin-top:300" >
<tr>
<td bgcolor=yellow>�ǳ�</td><td><input type=text size=20 name=nick></td>
</tr>
<tr>
<td bgcolor=green>����</td><td><input type=text size=20 name=password></td>
<tr>
<td bgcolor=red>�Ա�</td><td>��
<input type=radio name=sex value=boy.gif checked>
Ů<input type=radio name=sex value=girl.gif ></td>
</tr>
<tr>
<td bgcolor=blue>ϲ����ɫ</td>
<td><select size=1 name=color>
<option selected>��
<option>��
<option>��
<option>��
<option>��
</select></td>
</tr>
<tr>
<td bgcolor=green>���·�ʽ</td>
<td><select size=1 name=change>
<option selected>�ֶ�����
<option>ÿ�������
<option>ÿʮ�����
<option>ÿ��ʮ�����
</select></td>
</tr>
<tr align=center><td colspan=2>
<input type=submit name=SEND value=��½>
<input type=reset value=��������></td>
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