<%@ page contentType="text/html;charset=gb2312"%> 
<%@ page import="java.sql.*"%> 
<html> 
<body> 
<%/*Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance(); 
String url="jdbc:microsoft: sqlserver://localhost:1433;DatabaseName=MySQL"; 

//MySQL为你的数据库的 
String user="sa";
String password="NewPassword"; 
Connection conn= DriverManager.getConnection(url,user,password); 
Statement  stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); */
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//加载驱动
//获取连接
Connection conn=null;
try{
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//加载驱动
	
	//获取连接
	String url="jdbc:odbc:MySQL";
	String dbname="";
	String dbpasswd="";
	
	conn= DriverManager.getConnection(url,dbname,dbpasswd);	//获取连接
	
	}catch(Exception e){
		e.printStackTrace();
		
	}
	Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	String sql="select * from chatroom"; 
	ResultSet rs=stmt.executeQuery(sql); 
	while(rs.next()) {%> 
	您的第一个字段内容为：

	<%=rs.getString(1)%> 
	您的第二个字段内容为：

	<%=rs.getString(2)%> 
	<%}%> 
	<%out.print("数据库操作成功，恭喜你");%> 
	<%rs.close(); 
	stmt.close(); 
	conn.close(); 
	%> 

%>
</body> 
</html> 
