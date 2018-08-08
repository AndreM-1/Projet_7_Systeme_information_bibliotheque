<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<%@ include file="_include/head.jsp"%>	
	</head>
	<body>
		<div class="container">
			<!-- Header -->
			<%@ include file="_include/header.jsp"%>
		
			<section>
				<h1 class="text-center">Sélection <s:property value="moisCourant"/> <s:property value="anneeCourante"/></h1>
				
				<div class="row">
					<s:iterator value="listEdition">
						<div class="col-lg-6 editionAccueil">
							<div class="row">
								<div class="col-lg-4">
									<img src="<s:property value="photo.nomPhoto"/>" alt="Photo Couverture livre" height=277px width=185px/>
								</div>
								<div class="col-lg-8">
									<h4 class="text-justify"><s:property value="ouvrage.titre"/></h4>				
									<p><s:property value="ouvrage.auteur.prenom"/> <s:property value="ouvrage.auteur.nom"/></p>
									<p>Edité par <s:property value="editeur.nomEditeur"/> le <s:property value="dateParution"/></p>
									<p><s:property value="genre.genre"/></p>
								</div>
							</div>
						</div>
					</s:iterator>
				</div>
			</section>
		
			<!-- Footer -->
			<%@ include file="_include/footer.jsp"%>
		</div>		
	</body>
</html>
