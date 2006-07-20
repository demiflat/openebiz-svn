<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://acegisecurity.org/authz" prefix="authz" %>
<%@ taglib uri="http://www.joda.org/joda/time/tags" prefix="joda" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<title><fmt:message key="app.title.banner" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/hacks.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/base.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/layout.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/theme.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/corners.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/text.css" media="all" />
<link rel="stylesheet" type="text/css" href="/openebiz/style/forms.css" media="all" />
<!--[if lt IE 7]>
<link rel="stylesheet" type="text/css" href="/enterprise/style/ie.css" media="all" />
<![endif]-->
<!--[if lt IE 8]>
<link rel="stylesheet" type="text/css" href="/enterprise/style/ie7.css" media="all" />
<![endif]-->
<%@ include file="/WEB-INF/jsp/utils/cal_include.jsp" %>
</head>
<body>
<!-- start doc header -->		
<div id="container">
<%@ include file="/WEB-INF/jsp/elements/corners_top.jsp"%>
<!-- end doc header -->