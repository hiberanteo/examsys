<%@ page contentType="text/html;charset=gb2312"%> 
<%@ page import="java.sql.*"%> 
<html> 
<body> 
<%/*Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance(); 
String url="jdbc:microsoft: sqlserver://localhost:1433;DatabaseName=MySQL"; 

//MySQLΪ������ݿ�� 
String user="sa";
String password="NewPassword"; 
Connection conn= DriverManager.getConnection(url,user,password); 
Statement  stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); */
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//��������
//��ȡ����
Connection conn=null;
try{
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//��������
	
	//��ȡ����
	String url="jdbc:odbc:MySQL";
	String dbname="";
	String dbpasswd="";
	
	conn= DriverManager.getConnection(url,dbname,dbpasswd);	//��ȡ����
	
	}catch(Exception e){
		e.printStackTrace();
		
	}
	Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	String sql="select * from chatroom"; 
	ResultSet rs=stmt.executeQuery(sql); 
	while(rs.next()) {%> 
	���ĵ�һ���ֶ�����Ϊ��

	<%=rs.getString(1)%> 
	���ĵڶ����ֶ�����Ϊ��

	<%=rs.getString(2)%> 
	<%}%> 
	<%out.print("���ݿ�����ɹ�����ϲ��");%> 
	<%rs.close(); 
	stmt.close(); 
	conn.close(); 
	%> 

%>
</body> 
</html> 
