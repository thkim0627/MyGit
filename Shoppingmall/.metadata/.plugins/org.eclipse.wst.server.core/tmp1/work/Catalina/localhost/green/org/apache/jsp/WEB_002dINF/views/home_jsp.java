/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2022-06-20 04:55:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

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
    _jspx_dependants.put("jar:file:/C:/Development/Project/Shoppingmall/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Kmall/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1650246330080L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<!-- 0-0. viewport -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initail-scale=1\">\n");
      out.write("<title>Kmall 공식 온라인 스토어</title>\n");
      out.write("<!-- 0-1.favicon -->\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"resources/favicon/favicon.ico\"/>\n");
      out.write("<!-- 0-2.css -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/home.css\">\n");
      out.write("<!-- 0-3.jqeury -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header></header>\n");
      out.write("\t\n");
      out.write("\t<!-- 1.홈페이지 네비게이션바 영역 -->\n");
      out.write("\t<nav> \n");
      out.write("\t\t<div id=\"navbarBox\"> \n");
      out.write("\t        <!-- 1-1.네비게이션 쇼핑메뉴영역 -->\n");
      out.write("\t        <div id=\"shopMenuBox\">\n");
      out.write("\t\t        <ul id=\"shopMenu\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 1-2.네비게이션 로고영역 -->\n");
      out.write("\t        <div id=\"navbarLogo\">\n");
      out.write("\t            <h1><a href=\"home\">Kmall</a></h1>\n");
      out.write("\t        </div>\n");
      out.write("\t\t\t<!-- 1-3.네비게이션 회원메뉴 영역 -->\n");
      out.write("\t        <div id=\"memberMenuBox\">\n");
      out.write("\t\t        <ul id=\"memberMenu\">\n");
      out.write("\t\t        \t<li>\n");
      out.write("\t\t\t\t\t\t<!-- 로그인 전 표시 메뉴 -->\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- 로그인 후 표시 메뉴-->\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t    </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("\t\n");
      out.write("\t<main> \n");
      out.write("\t\t<!-- 2.홈페이지 메인이미지 영역 -->\n");
      out.write("\t\t<section> \n");
      out.write("\t\t\t<div id=\"slideBox\">\n");
      out.write("\t\t\t\t<!-- 메인이미지1 -->\n");
      out.write("\t\t\t\t<div class=\"slideHomeImgON\">\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"slideHomeImg\" src=\"https://i.pinimg.com/originals/07/5f/3e/075f3ee72f718f5fe63e0982d2bd221f.jpg\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- 메인이미지2 -->\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"slideHomeImg\" src=\"https://www.charleskeith.com/on/demandware.static/-/Library-Sites-CharlesKeith/default/dw8d6941cd/images/ambassadorPage/charles-keith-duel-bottom-banner-1000x666.jpg\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- 메인이미지3 -->\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img class=\"slideHomeImg\" src=\"https://www.charleskeith.co.uk/on/demandware.static/-/Library-Sites-CharlesKeithEU/default/dw1b60733c/images/megamenu/2022/charles-keith-third-mega-menu-week-11-boots-1000x667.jpg\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- 메인이미지 수동 슬라이드 버튼 -->\n");
      out.write("\t\t\t\t<section id=\"slideImgDotCont\">\n");
      out.write("\t\t\t\t\t<a class=\"slideHomeImgON\" href=\"#\"></a> \n");
      out.write("\t\t\t\t\t<a href=\"#\"></a> \n");
      out.write("\t\t\t\t\t<a href=\"#\"></a>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- 3.홈페이지 신상품 노출 영역 -->\n");
      out.write("\t\t<section>\n");
      out.write("\t\t\t<div id=\"goodsCont\">\n");
      out.write("\t\t\t\t<!-- 신상품 제목 -->\n");
      out.write("\t\t\t\t<div class=\"goodsTitle\">\n");
      out.write("\t\t\t\t\t<h2><span>NEW PRODUCT</span></h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- 신상품 목록1 -->\t\n");
      out.write("\t\t\t\t<ul id=\"goodsList\">\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지1 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2022/01/SUCCOFW212215436-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE CROPPED CARDIGAN</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">91,700원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지2 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/12/SUCCOFW212215462-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE CROPPED CARDIGAN</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">83,800원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지3 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/12/SUCCOFW212215207-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE KNITTED HOODIE</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">83,600원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지4 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/12/SUCCOFW212215105-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE KNITTED HOODIE</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">80,700원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- 신상품 목록2 -->\t\n");
      out.write("\t\t\t\t<ul id=\"goodsList\">\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지1 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/11/SUCCOFW212215747-1-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE BOTANICAL SWEATPANTS</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">70,100원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지2 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/11/SUCCOFW212215654-copy-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE BOTANICAL HOODIE</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">76,900원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지3 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/11/SUCCOFW212215754-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE BOTANICAL HOODIE</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">76,800원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods\">\n");
      out.write("\t\t\t\t\t\t<!-- 이미지4 영역 -->\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/11/SUCCOFW212215760-650x1200.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!-- 텍스트 영역 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"homeGoodsTextBox\">\n");
      out.write("\t\t\t\t\t\t\t<span>THE BOTANICAL SWEATPANTS</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red;\">72,500원</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- 4.홈페이지 추천상품 노출 영역 -->\n");
      out.write("\t\t<section>\n");
      out.write("\t\t\t<div id=\"goodsCont2\">\n");
      out.write("\t\t\t\t<!-- 추천상품 목록1 -->\n");
      out.write("\t\t\t\t<ul id=\"goodsList2\">\n");
      out.write("\t\t\t\t\t<!-- 이미지영역1 -->\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods2\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/03/succo_1821_white_f2-1.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<!-- 이미지영역2 -->\n");
      out.write("\t\t\t\t\t<li class=\"homeGoods2\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"https://www.succoluxury.com/wp-content/uploads/2021/03/succo_1821_white_m2-2.jpg\"></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t</main>\n");
      out.write("\t\n");
      out.write("\t<!-- 5.홈페이지 푸터 콘텐츠 영역 -->\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div id=\"homeFooterHR\"></div>\n");
      out.write("\t\t<div id=\"homeFooterCont\">\n");
      out.write("\t\t\t<!-- 고객센터 정보영역 -->\n");
      out.write("\t\t\t<div class=\"homeFooterBox\" style=\"margin-left: 0.2rem;\">\n");
      out.write("\t\t\t\t<div class=\"footerTitle\" style=\"margin-bottom: 1.1rem;\"><h2><span>CS CENTER</span></h2></div>\n");
      out.write("\t\t\t\t<ul class=\"homeFooterUL\">\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\" style=\"font-size: 1.7rem; font-weight: bold; margin-bottom: 1.2rem;\">010-5840-5084</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">thkim_o@daum.net</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">AM 09:00 ~ PM 17:00</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 은행 정보영역 -->\n");
      out.write("\t\t\t<div class=\"homeFooterBox\" style=\"margin-left: 1rem;\">\n");
      out.write("\t\t\t\t<div class=\"footerTitle\" style=\"margin-top: 3rem;\"><h2><span>BANK INFO</span></h2></div>\n");
      out.write("\t\t\t\t<ul class=\"homeFooterUL\">\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">KB 국민 : 000000-00-000000</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">KEB 하나 : 000-000000-00000</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">IBK 기업 : 000-000000-00-000</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">예금주 : (주)케이몰</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 정책 정보영역 -->\n");
      out.write("\t\t\t<div class=\"homeFooterBox\" style=\"margin-left: -0.5rem;\">\n");
      out.write("\t\t\t\t<div class=\"footerTitle\" style=\"margin-bottom: 1.3rem;\"><h2><span>POLICY</span></h2></div>\n");
      out.write("\t\t\t\t<ul class=\"homeFooterUL\">\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\"><a class=\"footerPolicyA\" href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\"><a class=\"footerPolicyA\" href=\"#\">AGREEMENT</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\"><a class=\"footerPolicyA\" href=\"#\">GUIDE</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\"><a class=\"footerPolicyA\" href=\"#\">PRIVACY</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- 회사 정보영역 -->\n");
      out.write("\t\t\t<div class=\"homeFooterBox\">\n");
      out.write("\t\t\t\t<div class=\"footerTitle\"><h2><span>COMPANY</span></h2></div>\n");
      out.write("\t\t\t\t<ul class=\"homeFooterUL\">\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">법인명(상호) : (주)케이몰(Kmall Co., Ltd.)</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">대표자(성명) : 김태형 | 사업자 등록번호 안내 : [000-00-00000]</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">통신판매업 신고 제 2022-서울길동-00203호 | 전화 : 010-5840-5084 | 팩스 : 02-000-0000</li>\n");
      out.write("\t\t\t\t\t<li class=\"footerContents\">주소 : 00000 서울특별시 강동구 천호대로185길 67-5 (길동) 한빛주택 203호</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p class=\"footerContents\" style=\"margin: 3rem 0 4rem 3.4rem; line-height: 1.5rem;\">\n");
      out.write("\t\t\tContact thkim@kmall.com for more information.<br>\n");
      out.write("\t\t\tCopyright © 케이몰. All rights reserved.\n");
      out.write("\t\t</p>\n");
      out.write("\t</footer>\n");
      out.write("\t<script src=\"resources/js/home.js\"></script>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(25,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty LoginID || not empty LoginID}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<li>\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\">SHOP</a>\n");
          out.write("\t\t\t\t\t\t\t<ul class=\"shopMenuDepth\">\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">ALL</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">OUTER</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">TOP</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">BOTTOM</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">ONEPIECE</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">SKIRT</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">SHOES</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">BAG</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">HEADWEAR</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">UNDERWEAR</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">ATC</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">ETC</a></li>\t\n");
          out.write("\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t</li>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">SALE</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">LOOKBOOK</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">CAMPAIGN</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">CONTACT</a></li>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/home.jsp(59,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty LoginID}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"loginf\">LOGIN</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"joinf\">JOIN</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"blist\">BOARD</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">SEARCH</a></li>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/home.jsp(66,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty LoginID}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"logout\">LOGOUT</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"mdetail\">MYPAGE</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"blist\">BOARD</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"#\">SEARCH</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"mdetail\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LoginName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</a></li>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
