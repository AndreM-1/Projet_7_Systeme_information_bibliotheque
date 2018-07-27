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
			
			<h1 class="text-center">Localisation/Horaires</h1>
			<section>
				<div class="localHoraires">
					<div class="imgBibliotheque">
						<img src="jsp/assets/images/img_bibliotheque_les_romains.png" alt="Bibliothèque Les Romains" height=350px width=350px>
					</div>
					<div>
						<p>Les Romains</p>
						<p>Adresse : 1 Boulevard de la Rocade - 74000 Annecy</p>
						<p>Téléphone : 04-50-88-38-10</p>
						<p>Horaires : Du Lundi au Samedi : 10h - 19h</p>
					</div>
				</div>
				<div class="localHoraires">
					<div class="imgBibliotheque">
						<img src="jsp/assets/images/img_bibliotheque_novel.png" alt="Bibliothèque Novel" height=350px width=350px>
					</div>
					<div>
						<p>Novel</p>
						<p>Adresse : 7 bis rue Louis Armand - 74000 Annecy</p>
						<p>Téléphone : 04-50-33-87-41</p>
						<p>Horaires : Du Lundi au Samedi : 10h - 19h</p>
					</div>
				</div>
				<div class="localHoraires">
					<div class="imgBibliotheque">
						<img src="jsp/assets/images/img_bibliotheque_les_tilleuls.png" alt="Bibliothèque Les Tilleuls" height=350px width=350px>
					</div>
					<div>
						<p>Les Tilleuls</p>
						<p>Adresse : 11 rue du Lachat - 74940 Annecy</p>
						<p>Téléphone : 04-50-09-85-89</p>
						<p>Horaires : Du Lundi au Samedi : 10h - 19h</p>
					</div>
				</div>
				<div class="localHoraires">
					<div class="imgBibliotheque">
						<img src="jsp/assets/images/img_bibliotheque_bonlieu.png" alt="Bibliothèque Bonlieu" height=350px width=350px>
					</div>
					<div>
						<p>Bonlieu</p>
						<p>Adresse : 1, rue Jean Jaurès Annecy - 74000 Annecy</p>
						<p>Téléphone : 04-50-33-87-00</p>
						<p>Horaires : Du Lundi au Samedi : 10h - 19h</p>
					</div>
				</div>				
								
			</section>
			
			<!-- Footer -->
			<%@ include file="../_include/footer.jsp"%>
		</div>
	</body>
</html>