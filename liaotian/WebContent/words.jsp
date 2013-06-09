<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title> 发言栏</title>
</head>
<body>
<base target=view>
<font color=<%=session.getValue("color") %>size=+2>
<%=session.getValue("nick") %></font>,欢迎光临
上线地址：<font color=green size=+2><%=request.getRemoteAddr() %></font>
<font color=red>
<%
String errmsg=request.getParameter("errmsg");
if(errmsg!=null)
	out.print(errmsg);
%>
</font>
<form action=saveword.jsp method=post>
<table border=0>
<tr><td valign=top><font>想说的话</font></td>
    <td valign=top><textarea name=note rows=2 cols=60></textarea></td>
    </tr>
    <tr><td colspan=2><center><input type=submit name=send value=我有话要说>
    <input type=reset name=clear value=重新输入>
    <a href=view.jsp>查看信息</a>
    <a href=enter.jsp target=_top>重新登录</a>
    </center>
    </tr>
    </table>
    </form>

</body>
</html>