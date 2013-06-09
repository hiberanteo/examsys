<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>选择试卷类型</title>
<link href="student/images/css2.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
<!--
.STYLE3 {font-size: 18px; }
.STYLE4 {font-size: 18px; font-weight: bold; }
.STYLE5 {color: #FF0000}
-->
</style>
</head>
<body>
<table width="1003" height="485" border="0" cellpadding="0" cellspacing="0" class="centerbg">
  <tr>
    <td width="149" height="485">&nbsp;</td>
    <td width="741" valign="top" class="rightbian">
	 <form action="getRandomSubject.action" method="post">
	<table width="98%" border="0" align="center" cellpadding="0" cellspacing="10">
      <tr>
        <td colspan="3" bgcolor="#999999" class="STYLE4">选择类型</td>
      </tr>
	 
	 	  <td>
	 	  <select name="typeid">
					<s:iterator value="#request.types" var="type">
					<option name="typename" value ="${type.id}">${type.name}</option>
					</s:iterator>
			</select>
	 	  </td> 	
      <tr>
        <td colspan="3"><div align="center">
          <input type="submit" value=" 提交 " name="Submit" />
        </div></td>
      </tr>
    </table>
     </form>
    </td>
    <td width="113">&nbsp;</td>
  </tr>
</table>
</body>
</html>
