<%@ page language="java" contentType="text/html;charset=gbk"
    pageEncoding="gbk"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>JSP�����Ĵ���</title>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>���</title>
</head>
<body>
<%

request.getSession(true);

if(request.getParameter("nick")==null)
{
	request.setCharacterEncoding("UTF-8"); 
	  String errmsg = "%E8%AF%B7%E8%BE%93%E5%85%A5%E6%98%B5%E7%A7%B0"; 
	    response.sendRedirect("enter.jsp?errmsg="+errmsg); 


}


else
{
	
	String color=request.getParameter("color");
	String change=request.getParameter("change");
    String nick=request.getParameter("nick");
	String sex=request.getParameter("sex");
	if(color.equals("��"))
		color="black";
	else if(color.equals("��"))
		color="red";
	else if(color.equals("��"))
		color="yellow";
	else if(color.equals("��"))
		color="blue";
	else
		color="green";
	if(change.equals("�ֶ�����"))
		change="0";
	else if(change.equals("ÿ�������"))
		change="5";
	else if(change.equals("ÿʮ�����"))
		change="10";
	else
		change="30";
	session.putValue("color",color);
	session.putValue("change",change);
	session.putValue("nick",nick);
	session.putValue("sex",sex);
	response.sendRedirect("chatroom.htm");	
	
}

%>
</body>
</html>