package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>教师（学生）登录页面</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tmargin-left: 0px;\r\n");
      out.write("\t\tmargin-top: 0px;\r\n");
      out.write("\t\tmargin-right: 0px;\r\n");
      out.write("\t\tmargin-bottom: 0px;\r\n");
      out.write("\t\tbackground-color: #1D3647;\r\n");
      out.write("\t}\r\n");
      out.write("\t.STYLE1 {color: #E6EBF1}\r\n");
      out.write("\t-->\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<link href=\"teacher/images/skin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t  <table width=\"100%\" height=\"166\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td height=\"42\" valign=\"top\"><table width=\"100%\" height=\"42\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_top_bg\">\r\n");
      out.write("\t      <tr>\r\n");
      out.write("\t        <td width=\"1%\" height=\"21\">&nbsp;</td>\r\n");
      out.write("\t        <td height=\"42\">&nbsp;</td>\r\n");
      out.write("\t        <td width=\"17%\">&nbsp;</td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t    </table></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td valign=\"top\"><table width=\"100%\" height=\"532\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_bg\">\r\n");
      out.write("\t      <tr>\r\n");
      out.write("\t        <td width=\"49%\" align=\"right\"><table width=\"91%\" height=\"532\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"login_bg2\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t              <td height=\"138\" valign=\"top\"><table width=\"89%\" height=\"427\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td height=\"149\">&nbsp;</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td height=\"80\" align=\"right\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td height=\"198\" align=\"right\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                      <td width=\"35%\">&nbsp;</td>\r\n");
      out.write("\t                      <td width=\"65%\" height=\"25\" class=\"left_txt\"><p>1- 教师录入考试题目以及答案信息</p></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                      <td>&nbsp;</td>\r\n");
      out.write("\t                      <td height=\"25\" class=\"left_txt\"><p>2- 学生参加考试并自动评分和查看正确答案</p></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                      <td>&nbsp;</td>\r\n");
      out.write("\t                      <td height=\"25\" class=\"left_txt\"><p>3- 教师查看学生考试成绩</p></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                  </table></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t              </table></td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            \r\n");
      out.write("\t        </table></td>\r\n");
      out.write("\t        <td width=\"1%\" >&nbsp;</td>\r\n");
      out.write("\t        <td width=\"50%\" valign=\"bottom\"><table width=\"100%\" height=\"59\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t              <td width=\"4%\">&nbsp;</td>\r\n");
      out.write("\t              <td width=\"96%\" height=\"38\"><span class=\"login_txt_bt\">教师（学生）登录</span></td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t              <td>&nbsp;</td>\r\n");
      out.write("\t              <td height=\"21\"><table cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\" id=\"table211\" height=\"328\">\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td height=\"164\" colspan=\"2\" align=\"middle\">\r\n");
      out.write("\t                    \t<form name=\"myform\" action=\"login.action\" method=\"post\">\r\n");
      out.write("\t                        <table cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" border=\"0\" height=\"143\" id=\"table212\">\r\n");
      out.write("\t                          <tr>\r\n");
      out.write("\t                          \t<td colspan=\"2\"><FONT color=\"red\">");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("</FONT></td><!--显示错误信息 -->\r\n");
      out.write("\t                          </tr>\r\n");
      out.write("\t                          <tr>\r\n");
      out.write("\t                            <td width=\"14%\" height=\"38\" class=\"top_hui_text\"><span class=\"login_txt\">编号：&nbsp;&nbsp; </span></td>\r\n");
      out.write("\t                            <td height=\"38\" colspan=\"2\" class=\"top_hui_text\"><input name=\"id\" class=\"editbox4\" value=\"\" size=\"20\">                            </td>\r\n");
      out.write("\t                          </tr>\r\n");
      out.write("\t                          <tr>\r\n");
      out.write("\t                            <td width=\"14%\" height=\"35\" class=\"top_hui_text\"><span class=\"login_txt\"> 密 码： &nbsp;&nbsp; </span></td>\r\n");
      out.write("\t                            <td height=\"35\" colspan=\"2\" class=\"top_hui_text\"><input class=\"editbox4\" type=\"password\" size=\"20\" name=\"password\">\r\n");
      out.write("\t                              </td>\r\n");
      out.write("\t                          </tr>\r\n");
      out.write("\t                          <tr>\r\n");
      out.write("\t                            <td width=\"14%\" height=\"35\" ><span class=\"login_txt\">登录角色：</span></td>\r\n");
      out.write("\t                            <td height=\"35\" colspan=\"2\" class=\"login_txt\"><input type=\"radio\" name=\"role\" value=\"teacher\" checked=\"checked\">教师\r\n");
      out.write("\t                                <input type=\"radio\" name=\"role\" value=\"student\">学生</td>\r\n");
      out.write("\t                          </tr>\r\n");
      out.write("\t                          <tr>\r\n");
      out.write("\t                            <td height=\"35\" >&nbsp;</td>\r\n");
      out.write("\t                            <td width=\"19%\" height=\"35\" ><input name=\"Submit\" type=\"submit\" class=\"button\" id=\"Submit\" value=\"登 录\"> </td>\r\n");
      out.write("\t                            <td width=\"67%\" class=\"top_hui_text\"><input name=\"cs\" type=\"button\" class=\"button\" id=\"cs\" value=\"取 消\" onClick=\"showConfirmMsg1()\"></td>\r\n");
      out.write("\t                          </tr>\r\n");
      out.write("\t                        </table>\r\n");
      out.write("\t                        <br>\r\n");
      out.write("\t                    </form></td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td width=\"433\" height=\"164\" align=\"right\" valign=\"bottom\"></td>\r\n");
      out.write("\t                    <td width=\"57\" align=\"right\" valign=\"bottom\">&nbsp;</td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t              </table></td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t          </table>\r\n");
      out.write("\t          </td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t    </table></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td height=\"20\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"login-buttom-bg\">\r\n");
      out.write("\t      <tr>\r\n");
      out.write("\t        <td align=\"center\"><span class=\"login-buttom-txt STYLE1\">在线考试系统</span></td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t    </table></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005factionerror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }
}
