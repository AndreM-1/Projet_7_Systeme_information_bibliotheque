<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<header>
	<!-- Barre de navigation -->
	<div class="barreNavigation">
	 	<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		 	<s:a action="index" class="ville"><img src="jsp/assets/images/logo_bibliotheque_1.png" alt="Logo bibliothèque" height=100px width=100px>
		 	 Annecy</s:a>
	 	</div>
	 	
		<div class="collapse navbar-collapse navbar-right">
			<ul class="nav navbar-nav">
				<li><s:a action="page_generique_qsn">Qui sommes-nous?</s:a></li>
				<li class="dropdown">
					<a data-toggle="dropdown" href="#">Infos pratiques <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><s:a action="page_generique_it">Inscriptions et tarifs</s:a></li>
						<li class="divider"></li>
						<li><s:a action="page_generique_lh">Localisations/Horaires</s:a></li>
						<li class="divider"></li>
						<li><s:a action="page_generique_cp">Conditions de prêt</s:a></li>
					</ul>
				</li>
				<li><s:a action="page_generique_ml">Mentions légales</s:a></li>
				<s:if test="#session.user">
					<li>
						<a class="btn btn-primary boutonConnexion dropdown-toggle" data-toggle="dropdown"><s:property value="#session.user.pseudo"/></a>
						<ul class="dropdown-menu">
							<li><s:a action="page_utilisateur_coord">Mes coordonnées</s:a></li>
							<li class="divider"></li>
							<li><s:a action="page_utilisateur_mdp">Mon mot de passe</s:a></li>
							<li class="divider"></li>
							<li><s:a action="">Gestion des prêts</s:a></li>
							<li class="divider"></li>
							<li><s:a action="deconnexion">Déconnexion</s:a></li>
						</ul>
					</li>
				</s:if>
				<s:else>
					<li><s:a action="connexion" class="btn btn-primary boutonConnexion">Connexion</s:a></li>
				</s:else>
			</ul>
		</div>
	</div>
	
	<!-- Bannière image avec zone de recherche -->
	<div id="banniereImage">
		<div id="zoneRecherche" class="row">
			<div class="col-lg-12 text-right">
				<form class="form-inline text-right" method="POST">
					<div class="input-group">
						<input type="text" autocomplete="off" class="form-control input-lg" name="" placeholder="Entrer votre titre ici..."/>
						<span class="input-group-btn">
							<button class="btn btn-default btn-lg" type="submit"><span class="glyphicon glyphicon-search"></span></button>
						</span>
					</div>
				</form>
			</div>
			<div id="rechercheAvancee" class="col-lg-12 text-right"><s:a action="" >+Recherche avancée</s:a></div>
		</div>
	
	</div>
	 
	 
	<!-- jQuery -->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

	<!-- Javascript de Bootstrap -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
</header>