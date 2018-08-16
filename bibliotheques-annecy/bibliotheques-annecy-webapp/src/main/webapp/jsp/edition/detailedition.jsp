<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<%@ include file="../_include/head.jsp"%>	
	</head>
	<body>
		<div class="container">
			<!-- Header -->
			<%@ include file="../_include/header.jsp"%>
		
			<section id="editionDetailee">
				<div class="row">
					<s:iterator value="listExemplaire" begin ="1" end ="1">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 editionAccueil">	
							<!-- Il faut appliquer les classes Bootstrap à l'image et non à un bloc contenant l'image !!! -->
							<img class="col-xs-5 col-sm-4 col-md-3 col-lg-3" src="<s:property value="edition.photo.nomPhoto"/>" alt="Photo Couverture livre" height=401px width=268px/>
							<div class="col-xs-7 col-sm-8 col-md-9 col-lg-9">
								<h4><s:property value="edition.ouvrage.titre"/></h4>				
								<p><em>Auteur : </em><s:property value="edition.ouvrage.auteur.prenom"/> <s:property value="edition.ouvrage.auteur.nom"/></p>
								<p><em>Edité par</em> <s:property value="edition.editeur.nomEditeur"/> le <s:property value="edition.dateParution"/></p>
								<p><em>Genre :</em> <s:property value="edition.genre.genre"/></p>
								<p><em>ISBN :</em> <s:property value="edition.isbn"/></p>
								<p><em>Nombre de pages :</em> <s:property value="edition.nbPages"/> pages</p>
								<p class="text-justify"><em>Resumé : </em><s:property value="edition.ouvrage.resume"/></p>
							</div>
						</div>
					</s:iterator>
				</div>
				<s:if test="%{exemplaireTrouve==true}">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 table-responsive">
							<table class="table table-bordered table-striped table-condensed">
								<thead>
									<tr>
										<th class="text-center">Bibliothèque</th>
										<th class="text-center">Nombre d'exemplaires disponibles</th>
										<th class="text-center">Emprunt</th>
									</tr>
								</thead>
								<tbody>
									<s:iterator value="listExemplaire">
										<s:if test="%{nbExemplaires!=0}">
											<tr>
												<td class="text-center"><s:property value="bibliotheque.nomBibliotheque"/></td>
												<td class="text-center"><s:property value="nbExemplaires"/></td>
												<td class="text-center"><s:a action="" class="btn btn-primary">Emprunter</s:a></td>
											</tr>
										</s:if>
									</s:iterator>
								</tbody>	
							</table>
						</div>
					</div>
				</s:if>	
				<s:else>
					<h3 class="text-center">Aucun exemplaire de cet ouvrage n'est disponible pour le moment. Veuillez revenir plus tard.</h3>
				</s:else>
			</section>
		
			<!-- Footer -->
			<%@ include file="../_include/footer.jsp"%>
		</div>		
	</body>
</html>
