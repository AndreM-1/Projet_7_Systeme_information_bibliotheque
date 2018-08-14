<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
</head>
<body>
	<div class="container">
		<!-- Header -->
		<%@ include file="../_include/header.jsp"%>

		<section id="resultatRecherche">
			<div class="row">
				<s:if test="%{editionTrouve==false}">
					<h4><s:actionmessage/></h4>
				</s:if>
				<s:iterator value="listEdition">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 editionAccueil">
						<!-- Il faut appliquer les classes Bootstrap à l'image et non à un bloc contenant l'image !!! -->
						<img class="col-xs-4 col-sm-4 col-md-3 col-lg-2" src="<s:property value="photo.nomPhoto"/>" alt="Photo Couverture livre" height=277px width=185px />
						<div class="col-xs-8 col-sm-8 col-md-9 col-lg-10">
							<h4>
								<s:a action="page_detail_edition">
									<!-- On met le lien sur le titre mais c'est bien l'id de l'édition que l'on passe comme paramètre -->
									<s:param name="id" value="id" />
									<s:property value="ouvrage.titre" />
								</s:a>
							</h4>
							<p><em>Auteur :</em> <s:property value="ouvrage.auteur.prenom" /> <s:property value="ouvrage.auteur.nom" /></p>
							<p><em>Edité par</em> <s:property value="editeur.nomEditeur" /> le <s:property value="dateParution" /></p>
							<p><em>Genre :</em> <s:property value="genre.genre" /></p>
							<p><em>ISBN :</em> <s:property value="isbn"/></p>
							<p><em>Nombre de pages :</em> <s:property value="nbPages"/> pages</p>
						</div>
					</div>
				</s:iterator>
			</div>
		</section>

		<!-- Footer -->
		<%@ include file="../_include/footer.jsp"%>
	</div>
</body>
</html>
