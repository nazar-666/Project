/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-27 22:09:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Goods by category</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  \t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction buyGoods(){\r\n");
      out.write("\t\t\t\tvar goodsID = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t  \t\ttype: \"get\",\r\n");
      out.write("\t\t\t  \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/buyGoods\",\r\n");
      out.write("\t\t\t  \t\tcache: false,    \r\n");
      out.write(" \t\t\t  \t\tdata: '&goodsID=' + goodsID,\r\n");
      out.write(" \t\t\t  \t\tsuccess: function(response){\r\n");
      out.write(" \t\t\t  \t\t\t$('#added').html(\"Product successfully added into busket\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"http://localhost:8080/SombraProject/img/ocean.jpg\">\r\n");
      out.write("    \t<header>  \t\t\r\n");
      out.write("    \t\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  \t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("    \t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("     \t\t\t\t\t<a class=\"navbar-brand\">Sombra Shop</a>\r\n");
      out.write("    \t\t\t\t</div>\r\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("      \t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client\">Home page</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/busket\"><span class=\"glyphicon glyphicon-trash\"></span>Busket</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\"><span class=\"glyphicon glyphicon-off\"></span> Log-out</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("    \t</header> \r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"photoes\" class= \"row border\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div class= \"col-xs-4 border\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<p><img src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"350\" width=\"350\" class=\"img-thumbnail\" data-toggle=\"modal\" data-target=\".main_Photo\"></p>\r\n");
      out.write("\t\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class= \"col-xs-8 border\" >\r\n");
      out.write("\t\t\t\t\t<div id=\"duscription_of_product\" class= \"row border\">\r\n");
      out.write("\t\t\t\t\t\t<div class= \"col-xs-12 border\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class= \"col-xs-6 border\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><img align=\"middle\" src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsSecondImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"200\" width=\"200\" class=\"img-thumbnail\" data-toggle=\"modal\" data-target=\".main_Photo\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class= \"col-xs-6 border\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><img align=\"middle\" src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsThirdImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"200\" width=\"200\" class=\"img-thumbnail\" data-toggle=\"modal\" data-target=\".main_Photo\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class= \"col-xs-12 border\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 align=\"center\">Description of product</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsDescr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 align=\"center\">Producer</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producerInfo.producerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class= \"col-xs-12 border\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div align = \"center\" class= \"col-xs-6 border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>If you like it, buy it now!</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"added\" style=\"color:green\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"padding-top:10px\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Buy now\" onclick=\"buyGoods()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade main_Photo\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"Main photo\">\r\n");
      out.write("\t \t\t<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("\t    \t\t<div class=\"modal-content\">\r\n");
      out.write("\t     \t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t        \t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("\t        \t\t\t<h4 class=\"modal-title\" id=\"gridSystemModalLabel\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t      \t\t\t</div>\t\r\n");
      out.write("\t      \t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t  \t\t\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t    <!-- Indicators -->\r\n");
      out.write("\t\t\t\t\t\t  \t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t   \t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t\t  \t</ol>\r\n");
      out.write("\t\t\t\t\t\t  \t<!-- Wrapper for slides -->\r\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"carousel-inner\" role=\"listbox\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t    \t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<img src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"600\" width=\"600\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<img src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsSecondImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"600\" width=\"600\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<img src=\"http://localhost:8080/SombraProject/img/goods/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsThirdImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" height=\"600\" width=\"600\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t  \t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Controls -->\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t \t\t<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t    \t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t\t\t  \t</a>\r\n");
      out.write("\t\t\t\t\t\t  \t<a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t    \t<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t  \t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t  \t\t\t\t</div>\r\n");
      out.write("\t      \t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t      \t\t\t\t<h3 align=\"center\" style=\"color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${choosedGoods.goodsName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\t       \t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t       \t\t\t</div>\r\n");
      out.write("\t   \t\t\t</div>\r\n");
      out.write("\t  \t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </body>\r\n");
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
