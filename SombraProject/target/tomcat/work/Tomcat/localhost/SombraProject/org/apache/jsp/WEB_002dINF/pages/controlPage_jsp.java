/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-25 16:41:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class controlPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("        <title>Adding information</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("  \t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  \t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction createCategory(){\r\n");
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
      out.write("\t \t\t\t  \t\t\t$('#categoryResult').html(\"You create new category: \" + response.categoryName);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction createGoods(){\r\n");
      out.write("\t\t\t\tvar regex = /^($|)([0-9]\\d{0,2}(\\,\\d{3})*|([0-9]\\d*))(\\.\\d{2})?$/;\r\n");
      out.write("\t\t\t\tvar goodsCategoryName = $(\"#goodsCategoryName option:selected\").text();\r\n");
      out.write("\t\t\t\tvar goodsProducerName = $(\"#goodsProducerName option:selected\").text();\r\n");
      out.write("\t\t\t\tvar goodsName = $(\"#goodsName\").val();\r\n");
      out.write("\t\t\t\tvar goodsDescr = $(\"#goodsDescr\").val();\r\n");
      out.write("\t\t\t\tvar goodsPrice = $(\"#goodsPrice\").val();\r\n");
      out.write("\t\t\t\tvar goodsFirstImg = $(\"#goodsFirstImg\").val();\r\n");
      out.write("\t\t\t\tvar goodsSecondImg = $(\"#goodsSecondImg\").val();\r\n");
      out.write("\t\t\t\tvar goodsThirdImg = $(\"#goodsThirdImg\").val(); \r\n");
      out.write("\t\t\t\tvar passed = goodsPrice.match(regex);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (goodsCategoryName == 'Select category'){\r\n");
      out.write("\t\t\t\t\t$('#category').html(\"Please choose category\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#price').html(\"\");\r\n");
      out.write("\t\t        \t$('#firstImg').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (goodsProducerName == 'Select producer'){\r\n");
      out.write("\t\t\t\t\t$('#category').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"Please choose producer\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#price').html(\"\");\r\n");
      out.write("\t\t        \t$('#firstImg').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (goodsName == ''){\r\n");
      out.write("\t\t\t\t\t$('#category').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"Goods name field is empty\");\r\n");
      out.write("\t\t        \t$('#price').html(\"\");\r\n");
      out.write("\t\t        \t$('#firstImg').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (passed == null) {\r\n");
      out.write("\t\t\t\t\t$('#category').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#price').html(\"Enter price only. For example: 523.36 or 0.20\");\r\n");
      out.write("\t\t\t      \t$('#firstImg').html(\"\");\r\n");
      out.write("\t\t        } else if (goodsFirstImg == ''){\r\n");
      out.write("\t\t        \t$('#category').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#price').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#firstImg').html(\"Goods image field is empty\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$('#category').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#producer').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#price').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#firstImg').html(\"\"); \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t \t$.ajax({\r\n");
      out.write("\t\t\t\t  \t\ttype: \"post\",\r\n");
      out.write("\t\t\t\t  \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addGoods\",\r\n");
      out.write("\t\t\t\t  \t\tcache: false,    \r\n");
      out.write("\t \t\t\t  \t\tdata: '&goodsCategoryName=' + goodsCategoryName + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsProducerName=\" + goodsProducerName + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsName=\" + goodsName +\r\n");
      out.write("\t \t\t\t  \t\t\t'&goodsDescr=' + goodsDescr + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsPrice=\" + goodsPrice + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsFirstImg=\" + goodsFirstImg +\r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsSecondImg=\" + goodsSecondImg + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&goodsThirdImg=\" + goodsThirdImg,\r\n");
      out.write("\t \t\t\t  \t\tsuccess: function(response){\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#goodsCategoryName option:selected\").text(\"Select category\");\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#goodsProducerName option:selected\").text(\"Select producer\");\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#goodsName\").val(\"\");\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#goodsDescr\").val(\"\");\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#goodsPrice\").val(\"\");\r\n");
      out.write("\t \t\t\t  \t\t \t$(\"#goodsFirstImg\").val(\"\");\r\n");
      out.write("\t \t\t\t  \t\t \t$(\"#goodsSecondImg\").val(\"\");\r\n");
      out.write("\t \t\t\t  \t\t \t$(\"#goodsThirdImg\").val(\"\"); \r\n");
      out.write("\t \t\t\t  \t\t \t\r\n");
      out.write("\t \t\t\t  \t\t\t$('#goodsResult').html(\"You create new goods: \" + response.goodsName);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction createProducer(){\r\n");
      out.write("\t\t\t\tvar producerName = $(\"#producerName\").val();\r\n");
      out.write("\t\t\t\tvar producerDescr = $(\"#producerDescr\").val();\r\n");
      out.write("\t\t\t\tvar producerLogo = $(\"#producerLogo\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (producerName == ''){\r\n");
      out.write("\t\t        \t$('#name').html(\"Producer name field is empty\");\r\n");
      out.write("\t\t        \t$('#img').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (producerLogo == ''){\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#img').html(\"Producer logo field is empty\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$('#name').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#img').html(\"\");\r\n");
      out.write("\t\t\t\t \t$.ajax({\r\n");
      out.write("\t\t\t\t  \t\ttype: \"post\",\r\n");
      out.write("\t\t\t\t  \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/addProducer\",\r\n");
      out.write("\t\t\t\t  \t\tcache: false,    \r\n");
      out.write("\t \t\t\t  \t\tdata: '&producerName=' + producerName + \"&producerDescr=\" + producerDescr + \"&producerLogo=\" + producerLogo,\r\n");
      out.write("\t \t\t\t  \t\tsuccess: function(response){\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#producerName\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#producerDescr\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#producerLogo\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t\r\n");
      out.write("\t \t\t\t  \t\t\t$('#producerResult').html(\"You create new category: \" + response.producerName);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t}\r\n");
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
      out.write("/admin\">Clients list</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/categoriesList\">Categories list</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/goodsList\">Goods list</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/producersList\">Producers list</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/ordersList\">Orders list</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/control\"><span class=\"glyphicon glyphicon-user\"></span>Admin</a></li>\r\n");
      out.write("      \t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\"><span class=\"glyphicon glyphicon-log-in\"></span> Log-out</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("    \t</header> \r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("\t    \t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t    \t<li class=\"active\"><a data-toggle=\"tab\" href=\"#addCategory\">New category</a></li>\r\n");
      out.write("\t\t  \t\t<li><a data-toggle=\"tab\" href=\"#addGoods\">New goods</a></li>\r\n");
      out.write("\t\t  \t\t<li><a data-toggle=\"tab\" href=\"$#addProducer\">New producer</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t    \t\t<div align=\"center\" id=\"addCategory\" class=\"tab-pane fade in active\">\r\n");
      out.write("\t      \t\t\t<table style=\"width:70%\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Сategory name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryName\" id=\"categoryName\" value='' placeholder=\"category name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"name\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Category description</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryDescr\" id=\"categoryDescr\" value='' placeholder=\"category description\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"descr\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Category image</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryImg\" id=\"categoryImg\" value='' placeholder=\"category image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"img\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style=\"padding-top:15px; font-size:15px; color:green\" id=\"categoryResult\"></div> \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-top:20px\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Create category\" onclick=\"createCategory()\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t      \t\t</div>\r\n");
      out.write("\t      \t\t\r\n");
      out.write("\t      \t\t\r\n");
      out.write("\t\t\t    <div align=\"center\" id=\"addGoods\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t\t\t\t<table style=\"width:70%\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Goods category</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"goodsCategoryName\" id=\"goodsCategoryName\" style=\"height: 30px; width: 480px\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Select category</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"category\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Goods producer</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"goodsProducerName\" id=\"goodsProducerName\" style=\"height: 30px; width: 480px\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option >Select producer</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"producer\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Goods name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsName\" id=\"goodsName\" value='' placeholder=\"goods name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"name\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Goods price</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsPrice\" id=\"goodsPrice\" value='' placeholder=\"goods price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"price\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Goods description</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsDescr\" id=\"goodsDescr\" value='' placeholder=\"goods description\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"description\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">First image</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsFirstImg\" id=\"goodsFirstImg\" value='' placeholder=\"goods image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"firstImg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Second image</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsSecondImg\" id=\"goodsSecondImg\" value='' placeholder=\"goods image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"secondImg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Third image</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"goodsThirdImg\" id=\"goodsThirdImg\" value='' placeholder=\"goods image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"thirdImg\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t</table>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style=\"padding-top:15px; font-size:15px; color:green\" id=\"goodsResult\"></div> \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-top:20px\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Create goods\" onclick=\"createGoods()\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <div align=\"center\" id=\"addProducer\" class=\"tab-pane fade\">\r\n");
      out.write("\t\t\t    \t<table style=\"width:70%\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Producer name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"producerName\" id=\"producerName\" value='' placeholder=\"Producer name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"name\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Producer description</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"producerDescr\" id=\"producerDescr\" value='' placeholder=\"Producer description\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"descr\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr style = \"text-align:center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"vertical-align:middle; padding-left:200px;padding-top:10px;padding-bottom:10px; text-align: left; width:50%\">Producer image</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style = \"text-align:center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"producerLogo\" id=\"producerLogo\" value='' placeholder=\"Producer logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style = \"color:red\" id=\"img\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style=\"padding-top:15px; font-size:15px; color:green\" id=\"producerResult\"></div> \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-top:20px\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Create producer\" onclick=\"createProducer()\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t    \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t \t</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/controlPage.jsp(242,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("categoryNameList");
    // /WEB-INF/pages/controlPage.jsp(242,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/controlPage.jsp(242,10) '${categoryNameList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${categoryNameList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${categoryNameList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/pages/controlPage.jsp(254,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("producerNameList");
    // /WEB-INF/pages/controlPage.jsp(254,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/controlPage.jsp(254,10) '${producerNameList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${producerNameList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${producerNameList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
