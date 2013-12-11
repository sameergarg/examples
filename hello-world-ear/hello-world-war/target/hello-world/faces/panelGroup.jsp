<?xml version="1.0" encoding="UTF-8"?>
<%-- tpl:insert page="/template/template1.jtpl" --%><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://www.lloydstsb.com/faces/facestags" prefix="lf"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<f:view>
<html xmlns="http://www.w3.org/1999/xhtml" lang="${sessionScope.lang}" xml:lang="${sessionScope.lang}">
	<head>
		<%-- tpl:put name="headarea" --%><%-- /tpl:put --%>
	</head>
	<body>
		<%-- tpl:put name="collector" --%>
			<lf:scriptCollector>
		<%-- /tpl:put --%>
		<div id="wrapper">
			<div class="pageWrap">
				<div id="page" class="content">
				
					<div class="primaryWrap">
					
						<div class="primary">
						<div class="panel">
						<%-- tpl:put name="bodyarea" --%>
						<lf:panelGroup styleClass="radioGroup clearfix">
			
						</lf:panelGroup>

		<%-- /tpl:put --%>
							</div>
						</div>
						
					</div>
					<div class="secondary">
						<div class="panel">
							<%-- tpl:put name="promoArea1" --%><%-- /tpl:put --%>
							<%-- tpl:put name="menuParams" --%><%-- /tpl:put --%>
						
							<%-- tpl:put name="promoArea2" --%><%-- /tpl:put --%>
						</div>
					</div>
				</div>				
			</div>
		</div>
		</lf:scriptCollector>
	</body>
</html>
</f:view>
<%-- /tpl:insert --%>
