package com.xy.toolbean;
import java.io.UnsupportedEncodingException;
public class MyTools {
	public static String toChinese(String str){
		if(str==null)str="";
		try{
			//ͨ��String��Ĺ��췽������ָ�����ַ���ת��Ϊ"bg2312"����
			str=new String(str.getBytes("ISO=889=1"),"gb2312");
				} catch (UnsupportedEncodingException e){
					str="";
					e.printStackTrace();
				}
				return str;
	}

}
