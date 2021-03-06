/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-03 18:46:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write(" \r\n");
      out.write(" <html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>LOGIN PAGE</title>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/start_form.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://www.technicalkeeda.com/js/javascripts/plugin/json2.js\"></script>\r\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function(){\t\r\n");
      out.write("\t\t\t\t$('#password').keyup(function() {\r\n");
      out.write("\t\t\t\t\t$('#passwd').html(checkStrength($('#password').val()));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('#repeatPasswd').keyup(function() {\r\n");
      out.write("\t\t\t\t\t$('#repPasswd').html(checkEquals($('#password').val(), $('#repeatPasswd').val()));\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction checkEquals(password, repeatPasswd){\r\n");
      out.write("\t\t\t\tif (password == repeatPasswd){\r\n");
      out.write("\t\t\t\t\t$('#repPasswd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#repPasswd').addClass('equal');\r\n");
      out.write("\t\t\t\t\treturn 'The same passwords';\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#repPasswd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#repPasswd').addClass('notEqual');\r\n");
      out.write("\t\t\t\t\treturn 'Not a same passwords';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction checkStrength(password) {\r\n");
      out.write("\t\t\t\tvar strength = 0;\r\n");
      out.write("\t\t\t\tif (password.length < 4) {\r\n");
      out.write("\t\t\t\t\t$('#passwd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#passwd').addClass('short');\r\n");
      out.write("\t\t\t\t\treturn 'Too short';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (password.length > 4) strength += 1;\r\n");
      out.write("\t\t\t\t// If password contains both lower and uppercase characters, increase strength value.\r\n");
      out.write("\t\t\t\tif (password.match(/([a-z].*[A-Z])|([A-Z].*[a-z])/)) strength += 1;\r\n");
      out.write("\t\t\t\t// If it has numbers and characters, increase strength value.\r\n");
      out.write("\t\t\t\tif (password.match(/([a-zA-Z])/) && password.match(/([0-9])/)) strength += 1;\r\n");
      out.write("\t\t\t\t// If it has one special character, increase strength value.\r\n");
      out.write("\t\t\t\tif (password.match(/([!,%,&,@,#,$,^,*,?,_,~])/)) strength += 1;\r\n");
      out.write("\t\t\t\t// If it has two special characters, increase strength value.\r\n");
      out.write("\t\t\t\tif (password.match(/(.*[!,%,&,@,#,$,^,*,?,_,~].*[!,%,&,@,#,$,^,*,?,_,~])/)) strength += 1;\r\n");
      out.write("\t\t\t\tif (strength < 2) {\r\n");
      out.write("\t\t\t\t\t$('#passwd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#passwd').addClass('weak');\r\n");
      out.write("\t\t\t\t\treturn 'Weak';\r\n");
      out.write("\t\t\t\t} else if (strength == 2) {\r\n");
      out.write("\t\t\t\t\t$('#passwd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#passwd').addClass('good');\r\n");
      out.write("\t\t\t\t\treturn 'Good';\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$('#passwd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#passwd').addClass('strong');\r\n");
      out.write("\t\t\t\t\treturn 'Strong';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction registerNow(){\r\n");
      out.write("\t\t\t\tvar emailReg = /^([a-z0-9_\\.-])+@[a-z0-9-]+\\.([a-z]{2,4}\\.)?[a-z]{2,4}$/i;\r\n");
      out.write("\t\t\t\tvar login = $(\"#login\").val();\r\n");
      out.write("\t\t\t\tvar clientName = $(\"#clientName\").val();\r\n");
      out.write("\t\t\t\tvar clientSurname = $(\"#clientSurname\").val();\r\n");
      out.write("// \t\t\t\tvar date = new Date($('#clientDate').val());\r\n");
      out.write("\t\t\t\tvar date = $('#clientDate').val();\r\n");
      out.write("// \t\t\t\tvar day = date.getDate();\r\n");
      out.write("// \t\t\t\tvar month = date.getMonth()+1;\r\n");
      out.write("// \t\t\t\tvar year = date.getFullYear();\r\n");
      out.write("// \t\t\t\tvar clientDate = day+\".\"+month+\".\"+year;\r\n");
      out.write("\t\t\t\tvar clientEmail=$(\"#clientEmail\").val();\r\n");
      out.write("\t\t\t\tvar password = $('#password').val();\r\n");
      out.write("\t\t\t\tvar repeatPasswd = $(\"#repeatPasswd\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (login.length<5){\r\n");
      out.write("\t\t        \t$('#logIN').html(\"Field Login should be at least 5 character\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t} else if (clientName.length < 2){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"Field Name should be at least 2 character\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (clientSurname.length < 2){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"Field Surname should be at least 2 character\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (date==''){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"Date of birth field is empty\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (!emailReg.test(clientEmail)){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"E-mail field is not correct\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (checkStrength($('#password').val())=='Too short'){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').removeClass();\r\n");
      out.write("\t\t\t\t\t$('#passwd').addClass('short');\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t}else if (repeatPasswd != password){\r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t\t        \t$('#name').html(\"\");\r\n");
      out.write("\t\t        \t$('#surname').html(\"\");\r\n");
      out.write("\t\t        \t$('#date').html(\"\");\r\n");
      out.write("\t\t        \t$('#email').html(\"\");\r\n");
      out.write("\t\t        \t$('#passwd').html(\"\");\r\n");
      out.write("\t\t        \t$('#repPasswd').html(\"Repeat password field isn't equal password field\");\r\n");
      out.write("\t\t\t\t} else{ \r\n");
      out.write("\t\t\t\t\t$('#logIN').html(\"\");\r\n");
      out.write("\t        \t\t$('#name').html(\"\");\r\n");
      out.write("\t        \t\t$('#surname').html(\"\");\r\n");
      out.write("\t        \t\t$('#date').html(\"\");\r\n");
      out.write("\t        \t\t$('#email').html(\"\");\r\n");
      out.write("\t        \t\t$('#passwd').html(\"\");\r\n");
      out.write("\t        \t\t$('#repPasswd').html(\"\");\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t  \t\ttype: \"post\",\r\n");
      out.write("\t\t\t\t  \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/registration\",\r\n");
      out.write("\t\t\t\t  \t\tcache: false,    \r\n");
      out.write("\t \t\t\t  \t\tdata: '&login=' + login + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&clientName=\" + clientName + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&clientSurname=\" + clientSurname + \r\n");
      out.write("\t \t\t\t  \t\t\t\"&clientDate=\" + date +\r\n");
      out.write("\t \t\t\t  \t\t\t\"&clientEmail=\" + clientEmail +\r\n");
      out.write("\t \t\t\t  \t\t\t\"&password=\" + password,\r\n");
      out.write("\t \t\t\t  \t\t\t\r\n");
      out.write("\t \t\t\t  \t\tsuccess: function(response){\r\n");
      out.write("\t \t\t\t  \t\t\t$(\"#login\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#clientName\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#clientSurname\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#clientDate\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#clientEmail\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#password\").val(\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$(\"#repeatPasswd\").val(\"\");\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t\t\t\t\t$('#result').html(\"You create new user: \" + response.clientName);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t  \t\terror: function(){      \r\n");
      out.write("\t\t\t\t   \t\t\talert('Error while request..');\r\n");
      out.write("\t\t\t\t  \t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body background=\"img/ocean.jpg\">\t\r\n");
      out.write("\t\t<h1 align=\"center\">Registration area</h1>\r\n");
      out.write("\t\t<div id=\"main\" align=\"right\" class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t<label class=\"col-sm-4 control-label\">Login</label>\r\n");
      out.write("   \t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"login\" id=\"login\" placeholder=\"nazar-666\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style = \"color:red\" id=\"logIN\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t\t<label class=\"col-sm-4 control-label\">Name</label>\r\n");
      out.write("   \t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"clientName\" id=\"clientName\" placeholder=\"Nazar\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style = \"color:red\" id=\"name\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\">Surname</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"clientSurname\" id=\"clientSurname\" placeholder=\"Motruk\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style = \"color:red\" id=\"surname\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\">Date of Birth</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" class=\"form-control\" name=\"clientDate\" id=\"clientDate\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style = \"color:red\" id=\"date\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-sm-4 control-label\">E-mail</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t  \t\t<input type=\"email\" class=\"form-control\" name=\"clientEmail\" id=\"clientEmail\" placeholder=\"nazar-666@yandex.ua\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style = \"color:red\" id=\"email\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<form id=\"passwdRes\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-4 control-label\">Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t<div align=\"center\" id=\"passwd\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<form id=\"repPasswdRes\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-4 control-label\">Repeat password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"repeatPasswd\" id=\"repeatPasswd\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\" id=\"repPasswd\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<div class=\"col-sm-12\">\t\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"padding-top:15px; font-size:15px; color:green\" id=\"result\"></div>\r\n");
      out.write("\t\t\t<div align=\"center\" class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"Register Now\" onclick=\"registerNow()\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"center\" class=\"col-sm-12\">\r\n");
      out.write("\t\t       \t<a class=\"btn btn-primary\" data-toggle=\"modal\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\">Back</a>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</body>\t\t\t\r\n");
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
