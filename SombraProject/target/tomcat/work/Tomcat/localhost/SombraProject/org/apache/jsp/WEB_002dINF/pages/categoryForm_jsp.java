/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-01 13:36:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoryForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>New/Edit Category</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/edit_form.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" language=\"javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/json2.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction madeAjaxCall(){\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("\t\t  type: \"post\",\r\n");
      out.write("\t\t  url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkAddCategory\",\r\n");
      out.write("\t\t  cache: false,    \r\n");
      out.write("\t\t  data:'&categoryName=' + $(\"#categoryName\").val() + \"&categoryDescr=\" + $(\"#categoryDescr\").val() + \"&categoryImg=\" + $(\"#categoryImg\").val(),\r\n");
      out.write("\t\t  success: function(response){\r\n");
      out.write("\t\t   $('#result').html(\"\");\r\n");
      out.write("\t\t   var obj = JSON.parse(response);\r\n");
      out.write("\t\t   $('#result').html(\"categoryName:- \" + obj.categoryName +\"</br>categoryDescr:- \" + obj.categoryDescr  + \"</br>categoryImg:- \" + obj.categoryImg);\r\n");
      out.write("\t\t  },\r\n");
      out.write("\t\t  error: function(){      \r\n");
      out.write("\t\t   alert('Error while request..');\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"result\"></div>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/pages/categoryForm.jsp(39,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("saveCategory");
    // /WEB-INF/pages/categoryForm.jsp(39,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/pages/categoryForm.jsp(39,1) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("category");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write("\r\n");
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
          out.write("/newCategory\">New category</a></li>\r\n");
          out.write("      \t\t\t\t\t<li><a href=\"#\">Page 2</a></li>\r\n");
          out.write("   \t\t\t\t\t</ul>\r\n");
          out.write("    \t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
          out.write("      \t\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>Admin</a></li>\r\n");
          out.write("      \t\t\t\t\t<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Log-out</a></li>\r\n");
          out.write("   \t\t\t\t\t</ul>\r\n");
          out.write("  \t\t\t\t</div>\r\n");
          out.write("\t\t\t</nav>\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t<div align=\"center\" class=\"form-group\" id=\"page\">\r\n");
          out.write("\t\t\t\t\t<div id=\"page\" class= \"col-xs-12 border\" align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t<h1>New/Edit Category</h1>\r\n");
          out.write("\t\t            </div>\r\n");
          out.write("\t\t\t\t\t<div id=\"page\" class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-4 control-label\">Category name</label>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
          out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryName\" id=\"categoryName\" placeholder=\"category name\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"page\" class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-4 control-label\">Category description</label>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
          out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryDescr\" id=\"categoryDescr\" placeholder=\"category name\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div id=\"page\" class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-4 control-label\">Category image</label>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
          out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"categoryImg\" id=\"categoryImg\" placeholder=\"category name\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<div id=\"page\" align=\"center\" class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
          out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" value=\"Submit\"> SAVE</button>\r\n");
          out.write("\t\t\t\t\t\t<input type=\"button\" value=\"Ajax Submit\" onclick=\"madeAjaxCall();\">\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}