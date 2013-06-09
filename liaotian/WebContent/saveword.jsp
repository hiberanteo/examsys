<%@ page language="java" contentType="text/html;charset=gb2312" pageEncoding="gb2312"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.*" %>
    <%@include file="opendata.jsp" %>
   
    
<!DOCTYPE html PUBLIC "-//W3C//DT HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>
    <%
    String note=request.getParameter("note");
    if(note.length()==0)
    {
    	String errmsg="不可输入空白信息！！";
    	response.sendRedirect("view.jsp?errmsg="+errmsg);
    	 }
   else
    {
    	int month,day,hour,minute,second;
    	String nick=(String)session.getValue("nick");
    	String sex=(String)session.getValue("sex");
    	String color=(String)session.getValue("color");
    	GregorianCalendar calendar;
    	calendar=new GregorianCalendar();
    	month=calendar.get(Calendar.MONTH)+1;
    	day=calendar.get(Calendar.DAY_OF_MONTH)+1;
    	hour=calendar.get(Calendar.HOUR_OF_DAY);
    	minute=calendar.get(Calendar.MINUTE);
    	second=calendar.get(Calendar.SECOND);
    	out.print("note");
    	out.print("nick");
   
    	//note=convert(note);
     	//nick=convert(nick);
    	String time=month+"/"+day+""+hour+":"+minute+":"+second;
    	sql="insert into chatroom(nick,sex,color,time,note)values('"+nick+"','"+sex+"','"+color+"','"+time+"','"+note+"')";
    	stmt.executeQuery(sql);
    	response.sendRedirect("view.jsp");
    	 }
      %>
    
    

</body>
</html>