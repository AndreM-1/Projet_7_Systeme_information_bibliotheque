<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<%@ include file="../_include/head.jsp"%>
	</head>
	<body>
	
		<div class="container">
			<!-- Header -->
			<%@ include file="../_include/header.jsp"%>

			<section>
				<s:if test="#session.user">
					<!-- Menu de navigation -->
					<nav id="navProfilUtilisateur">
						<ul>
							<li><s:a action="page_utilisateur_coord">Mes coordonnées</s:a></li>
							<li><s:a action="page_utilisateur_mdp">Modifier mon mot de passe</s:a></li>
							<li><s:a action="page_utilisateur_gdp" id="gestionprets">Gestion des prêts</s:a></li>
						</ul>
					</nav>
			
					<!-- Section permettant à l'utilisateur de visualiser les prêts effectutés -->
					<h3 class="statutPret">Livres à rendre ou à prolonger</h3>
					<s:if test="%{bEmpruntNonRendu==true}">
						<h4>Vous n'avez aucun livre à rendre.</h4>
					</s:if>
					<div class="row">
						<s:iterator value="listEmpruntNonRendu">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 editionAccueil">	
								<!-- Il faut appliquer les classes Bootstrap à l'image et non à un bloc contenant l'image !!! -->
								<img class="col-xs-5 col-sm-4 col-md-3 col-lg-3" src="<s:property value="exemplaire.edition.photo.nomPhoto"/>" alt="Photo Couverture livre" height=401px width=268px/>
								<div class="col-xs-7 col-sm-8 col-md-9 col-lg-9">
									<h4><s:property value="exemplaire.edition.ouvrage.titre"/></h4>				
									<p><em>Auteur : </em><s:property value="exemplaire.edition.ouvrage.auteur.prenom"/> <s:property value="exemplaire.edition.ouvrage.auteur.nom"/></p>
									<p><em>Edité par</em> <s:property value="exemplaire.edition.editeur.nomEditeur"/> le <s:property value="exemplaire.edition.dateParution"/></p>
									<p><em>Genre :</em> <s:property value="exemplaire.edition.genre.genre"/></p>
									<p><em>ISBN :</em> <s:property value="exemplaire.edition.isbn"/></p>
									<p><em>Nombre de pages :</em> <s:property value="exemplaire.edition.nbPages"/> pages</p>
									<p><em>Période de l'emprunt :</em> Du <s:property value="dateDeDebut"/> au <s:property value="dateDeFin"/></p>
									<p><em>Statut du prêt :</em> <s:property value="statutEmprunt.statutEmprunt"/></p>
									<s:if test="%{prolongation==true}">
										<p><em>Prolongation du prêt :</em> 
											<s:a action="prolonger_emprunt" class="btn btn-primary ">
												<s:param name="bibliothequeId" value="exemplaire.bibliotheque.id"/>
												<s:param name="editionId" value="exemplaire.edition.id"/>
												Prolonger
											</s:a>
										</p>
									</s:if>
									<s:else>
										<p><em>Prolongation du prêt :</em> </p>
										<p>Vous avez déjà prolongé le prêt de cet ouvrage ou dépassé la date limite pour le prolonger.<br/> N'oubliez pas de le rendre dès que possible.</p>
									</s:else>
								</div>
							</div>
						</s:iterator>
					</div>
					
					<h3 class="statutPret">Prêts en cours</h3>
					<s:if test="%{bEmpruntEnCours==true}">
						<h4>Vous n'avez aucun prêt en cours pour le moment.</h4>
					</s:if>
					<div class="row">
						<s:iterator value="listEmpruntEnCours">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 editionAccueil">	
								<!-- Il faut appliquer les classes Bootstrap à l'image et non à un bloc contenant l'image !!! -->
								<img class="col-xs-5 col-sm-4 col-md-3 col-lg-3" src="<s:property value="exemplaire.edition.photo.nomPhoto"/>" alt="Photo Couverture livre" height=401px width=268px/>
								<div class="col-xs-7 col-sm-8 col-md-9 col-lg-9">
									<h4><s:property value="exemplaire.edition.ouvrage.titre"/></h4>				
									<p><em>Auteur : </em><s:property value="exemplaire.edition.ouvrage.auteur.prenom"/> <s:property value="exemplaire.edition.ouvrage.auteur.nom"/></p>
									<p><em>Edité par</em> <s:property value="exemplaire.edition.editeur.nomEditeur"/> le <s:property value="exemplaire.edition.dateParution"/></p>
									<p><em>Genre :</em> <s:property value="exemplaire.edition.genre.genre"/></p>
									<p><em>ISBN :</em> <s:property value="exemplaire.edition.isbn"/></p>
									<p><em>Nombre de pages :</em> <s:property value="exemplaire.edition.nbPages"/> pages</p>
									<p><em>Période de l'emprunt :</em> Du <s:property value="dateDeDebut"/> au <s:property value="dateDeFin"/></p>
									<p><em>Statut du prêt :</em> <s:property value="statutEmprunt.statutEmprunt"/></p>
									<s:if test="%{prolongation==true}">
										<p><em>Prolongation du prêt :</em> 
											<s:a action="prolonger_emprunt" class="btn btn-primary ">
												<s:param name="bibliothequeId" value="exemplaire.bibliotheque.id"/>
												<s:param name="editionId" value="exemplaire.edition.id"/>
												Prolonger
											</s:a>
										</p>
									</s:if>
									<s:else>
										<p><em>Prolongation du prêt :</em> Vous avez déjà prolongé le prêt de cet ouvrage. N'oubliez pas de le rendre avant la fin de la
										période d'emprunt.</p>
									</s:else>
								</div>
							</div>
						</s:iterator>
					</div>					
					
					<h3 class="statutPret">Livres rendus</h3>
					<s:if test="%{bEmpruntRendu==true}">
						<h4>Vous n'avez rendu aucun livre pour le moment.</h4>
					</s:if>
					<div class="row">
						<s:iterator value="listEmpruntRendu">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 editionAccueil">	
								<!-- Il faut appliquer les classes Bootstrap à l'image et non à un bloc contenant l'image !!! -->
								<img class="col-xs-5 col-sm-4 col-md-3 col-lg-3" src="<s:property value="exemplaire.edition.photo.nomPhoto"/>" alt="Photo Couverture livre" height=401px width=268px/>
								<div class="col-xs-7 col-sm-8 col-md-9 col-lg-9">
									<h4><s:property value="exemplaire.edition.ouvrage.titre"/></h4>				
									<p><em>Auteur : </em><s:property value="exemplaire.edition.ouvrage.auteur.prenom"/> <s:property value="exemplaire.edition.ouvrage.auteur.nom"/></p>
									<p><em>Edité par</em> <s:property value="exemplaire.edition.editeur.nomEditeur"/> le <s:property value="exemplaire.edition.dateParution"/></p>
									<p><em>Genre :</em> <s:property value="exemplaire.edition.genre.genre"/></p>
									<p><em>ISBN :</em> <s:property value="exemplaire.edition.isbn"/></p>
									<p><em>Nombre de pages :</em> <s:property value="exemplaire.edition.nbPages"/> pages</p>
									<p><em>Période de l'emprunt :</em> Du <s:property value="dateDeDebut"/> au <s:property value="dateDeFin"/></p>
									<p><em>Statut du prêt :</em> <s:property value="statutEmprunt.statutEmprunt"/></p>
								</div>
							</div>
						</s:iterator>
					</div>					
				</s:if>
			</section>
			
			<!-- Pied de page -->
			<%@ include file="../_include/footer.jsp"%>
	
		</div>
	
	</body>
</html>