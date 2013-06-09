public class convert 
{
/** 把ISO-8859-1码转换成GB2312*/
public static String ISOtoGB(String iso)
{
   String gb;
   try
   {
    if(iso.equals("") || iso == null)
    {
     return "";
    }
    else
    {
     iso = iso.trim();
     gb = new String(iso.getBytes("ISO-8859-1"),"GB2312");
     return gb;
    }
   }
   catch(Exception e)
   {
    System.err.print("编码转换错误："+e.getMessage());
    return "";
   }
}
}
