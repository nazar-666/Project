/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-20 17:48:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newCategoryPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>New Category</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://localhost:8080/SombraProject/css/edit_form.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/json2.js\"></script>\r\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction madeAjaxCall(){\r\n");
      out.write("\t\t\t\tvar categoryName = $(\"#categoryName\").val();\r\n");
      out.write("\t\t\t\tvar categoryDescr = $(\"#categoryDescr\").val();\r\n");
      out.write("\t\t\t\tvar categoryImg = $(\"#categoryImg\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (categoryName == ''){\r\n");
      out.write("\t\t        \t$('#name').html(\"Category name field is empty\");\r\n");
      out.write("\t\t        \t$('#descr').html(\"\");\r\n");
      out.write("\t\t        \t$('#img').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (categoryDescr == ''){\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#descr').html(\"Category description field is empty\");\r\n");
      out.write("\t\t        \t$('#img').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (categoryImg == ''){\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#descr').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#img').html(\"Category image field is empty\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#descr').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#img').html(\"\");\r\n");
      out.write("\t\t\t\t \t$.ajax({\r\n");
      out.write("\t\t\t\t  \t\ttype: \"post\",\r\n");
      out.write("\t\t\t\t  \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addCategory\",\r\n");
      out.write("\t\t\t\t  \t\tcache: false,    \r\n");
      out.write("\t \t\t\t  \t\tdata: '&categoryName=' + categoryName + \"&categoryDescr=\" + categoryDescr + \"&categoryImg=\" + categoryImg,\r\n");
      out.write("\t \t\t\t  \t\tsuccess: function(response){\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#categoryName\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#categoryDescr\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#categoryImg\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t\r\n");
      out.write("\t \t\t\t  \t\t\t$('#result').html(\"You create new category: \" + response.categoryName);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body background=\"http://localhost:8080/SombraProject/img/ocean.jpg\">\r\n");
      out.write("\t\t<header>  \t\t\r\n");
      out.write("    \t\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  \t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("    \t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("     \t\t\t\t\t<a class=\"navbar-brand\">Sombra Shop</a>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("      \t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin\">Home page</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addCategory\">New category</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addGoods\">New goods</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>Admin</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Log-out</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("    \t</header>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div style=\"padding-bottom:20px\"class= \"col-xs-12 border\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<h1>New сategory</h1>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\t<table align=\"center\" style=\"width:70%\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Сategory name</th>\r\n");
      out.write("\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryName\" id=\"categoryName\" value='' placeholder=\"category name\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style = \"color:red\" id=\"name\"></div>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Category description</th>\r\n");
      out.write("\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryDescr\" id=\"categoryDescr\" value='' placeholder=\"category description\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style = \"color:red\" id=\"descr\"></div>\r\n");
      out.write("\t\t\t\t\t\t</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Category image</th>\r\n");
      out.write("\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryImg\" id=\"categoryImg\" value='' placeholder=\"category image\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style = \"color:red\" id=\"img\"></div>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"padding-top:15px; font-size:15px; color:green\" id=\"result\"></div> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"center\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div style=\"padding-top:20px\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Ajax Submit\" onclick=\"madeAjaxCall()\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}