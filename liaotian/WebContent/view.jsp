<%@ page language="java" contentType="text/html;charset=gb2312"  pageEncoding="gb2312"%>
<%@page import="java.sql.*" %>
<%@include file="opendata.jsp" %>
<%@include file="convert.jsp" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=gb2312">
<title>Insert title here</title>
</head>
<body>

<%
String errmsg=request.getParameter("errmsg");
if(errmsg!=null)
{
	//errmsg=convert(errmsg);
	out.print("<font color=red size=5>"+errmsg+"</font>");
		}
else
{
	String nick,sex,color,time,note;
	String refresh=(String)session.getValue("change");
	if(refresh.equals("0"))
		out.print(refresh);
		response.setHeader("Refresh",refresh);
    sql="select * from chatroom order by id desc limit 8";
	rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		nick=rs.getString(1);
		sex=rs.getString(2);
		color=rs.getString(3);
		time=rs.getString(4);
		note=rs.getString(5);
		out.print(time+"><font color="+color+">"+nick+"说："+note+"</font><img src="+sex+"><br>");
	}
}	
%>
</body>
</html>