/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-02-28 01:28:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1516941422000L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecsite/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- スライドショー\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      $('.abc').bxSlider({\n");
      out.write("    \t  auto:true,\n");
      out.write("    \t  mode:'fade',\n");
      out.write("    \t  speed:1000,\n");
      out.write("    \t  slideWidth:400\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\n");
      out.write("\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\n");
      out.write("\t<meta http-equiv=\"imagetoolbar\" content=\"no\" />\n");
      out.write("\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t<title>Home画面</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\tbody {\n");
      out.write("\t\t   margin:0;\n");
      out.write("\t\t   padding:0;\n");
      out.write("\t\t   line-height:1.6;\n");
      out.write("\t\t   letter-spacing:1px;\n");
      out.write("\t\t   font-family:Verdana, Helvetica, sans-serif;\n");
      out.write("\t\t   font-size:12px;\n");
      out.write("\t\t   color:#333;\n");
      out.write("\t\t   background:#fff;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\ttable {\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t\tmargin:0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t/* ========TEMPLATE LAYOUT======== */\n");
      out.write("\t\t#top {\n");
      out.write("\t\t   width:780px;\n");
      out.write("\t\t   margin:30px auto;\n");
      out.write("\t\t  /* border:1px solid #333;*/\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t#header {\n");
      out.write("\t\t   width: 100%;\n");
      out.write("\t\t   height: 40px;\n");
      out.write("\t\t   background-color: black;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*左上タイトル*/\n");
      out.write("\n");
      out.write(" .logo{\tfloat:left;\n");
      out.write(" \t\twidth:100px;\n");
      out.write("\t\tpadding-left:10px;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tline-height:35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/*右上メニューの配置*/\n");
      out.write("\n");
      out.write("header ul{\n");
      out.write("\tfloat:right;\n");
      out.write("\tline-height:25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header ul li{\n");
      out.write("\tfloat:left;\n");
      out.write("\tpadding-right:20px;\n");
      out.write("\tist-style:none;\n");
      out.write("\tfont-size:10px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t#main {\tclear:both;\n");
      out.write("\t\t   width: 100%;\n");
      out.write("\t\t   height: 100%;\n");
      out.write("\t\t   text-align: center;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".abc{\n");
      out.write("\t\twidth: 100％;\n");
      out.write("\t\tmargin-top:100px;\n");
      out.write("\t\toverflow:hidden;\n");
      out.write("\t\tmargin:0 auto;\n");
      out.write("    \t/*position:relative;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".abc_wrap {\n");
      out.write("\twidth:100%;\n");
      out.write("\tmargin:0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".main-container{\n");
      out.write("\twidth:97%;\n");
      out.write("\n");
      out.write("\tmargin:0 auto;\n");
      out.write("\n");
      out.write("\t/*headerとmainの隙間*/\n");
      out.write("\tmargin-top:50px;\n");
      out.write("\n");
      out.write("\tmargin-bottom:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t#footer {\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\theight: 40px;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tclear:both;\n");
      out.write("            text-align:center;\n");
      out.write("\t\t\tline-height:30px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        /*「商品購入」ボタン*/\n");
      out.write("\t\t#text-center {\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("\n");
      out.write("\t\t<div class=\"logo\">\n");
      out.write("\t<!-- 左上　★を押したらhomeへ -->\n");
      out.write("\t<a href=\"http://localhost:8080/ecsite/\"><img src=\"img/hosi.png\" alt=\"homeへ戻る\"></a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\t\t<ul class=\"buildFrame\">\n");
      out.write("\t\t\t<li><a href=\"http://localhost:8080/ecsite/guide.jsp\">ご利用ガイド</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://localhost:8080/ecsite/login.jsp\">ログイン</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://localhost:8080/ecsite/buyItemConfirm.jsp\">カート</a></li>\n");
      out.write("\t\t\t<li><a href=\"/menu4/\">お問い合わせ</a></li>\n");
      out.write("\n");
      out.write("        <!-- ツイッターとフェイスブックアイコン-->\n");
      out.write("\t\t<li><a href=\"http://twitter.com\" target=\"_blank\" class=\"f_right face\"><span><img src=\"img/btn_twit.gif\" alt=\"ツイッター\"  /></span></a></li>\n");
      out.write("\t\t<li><a href=\"https://www.facebook.com\" target=\"_blank\" class=\"f_right twit\"><img src=\"img/btn_face.gif\" alt=\"フェイスブック\" /></a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t \t<div id=\"pr\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"main\">\n");
      out.write("\t\t<div id=\"top\">\n");
      out.write("\t\t\t<p>Home</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<img src=\"img/image1.jpg\" alt=\"画像だよ1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- スライドショー\n");
      out.write("<div class=\"abc_wrap\">\n");
      out.write("<div class=\"abc\">\n");
      out.write("    <div><img src=\"img/image1.jpg\" alt=\"画像だよ1\"></div>\n");
      out.write("    <div><img src=\"img/image2.jpg\" alt=\"画像だよ2\"></div>\n");
      out.write("    <div><img src=\"img/image3.jpg\" alt=\"画像だよ3\"></div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("-->\n");
      out.write("        <div class=\"main-container\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"amadanaItem clearfix\">\n");
      out.write("\n");
      out.write("\t\t\t\t<img src=\"img/ttl_recommend.png\" alt=\"境界線\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"cgi-bin/example.cgi\" method=\"post\">\n");
      out.write("\n");
      out.write("  <input type=\"search\" name=\"search\" placeholder=\"キーワードを入力\">\n");
      out.write("  <input type=\"submit\" name=\"submit\" value=\"検索\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- 商品一覧 -->\n");
      out.write("\t\t\t\t<table class=\"f_left\">\n");
      out.write("\t\t\t\t\t<tr class=\"row1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"itemImageSmall\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><img src=\"img/hosi2.png\" alt=\"商品1\" /></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemCategory\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><span>test1</span></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemImageSmall\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><img src=\"img/hosi2.png\" alt=\"説明2\" /></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemCategory\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><span>商品2</span></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemImageSmall\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><img src=\"img/hosi2.png\" alt=\"説明3\" /></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemCategory\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><span>商品3</span></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemImageSmall\"><a href=\"/shop/sal/item/list/category_id/51\"><img src=\"img/hosi2.png\" alt=\"説明4\" /></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemCategory\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><span>商品4</span></a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr class=\"row1\">\n");
      out.write("\t\t\t\t\t\t<td class=\"itemImageSmall\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><img src=\"img/hosi2.png\" alt=\"説明5\" /></a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"itemCategory\"><a href=\"http://localhost:8080/ecsite/buyItem.jsp\"><span>商品5</span></a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div id=\"text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- 次のページ -->\n");
      out.write("\t\t      <div class=\"navi clearfix\"><strong>1</strong> <a href=\"?category_id=0&amp;pageno=2\" onclick=\"eccube.movePage('2'); return false;\">2</a> <a href=\"?category_id=0&amp;pageno=3\" onclick=\"eccube.movePage('3'); return false;\">3</a>  <a class=\"rbtn\" href=\"?category_id=0&amp;pageno=2\" onclick=\"eccube.movePage('2'); return false;\">NEXT</a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("        2018\n");
      out.write("\t \t<div id=\"pr\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /home.jsp(256,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("HomeAction");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /home.jsp(257,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("商品購入");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /home.jsp(259,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#session.id != null");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<p>ログアウトする場合は<a href='");
        if (_jspx_meth_s_005furl_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("'>こちら</a></p>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /home.jsp(260,26) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("LogoutAction");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /home.jsp(262,3) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("#session.masterId != null");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<a href='");
        if (_jspx_meth_s_005furl_005f1(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("'>ログアウト</a>\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /home.jsp(263,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("LogoutAction");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }
}