<?php
	$nome = $_POST["nome"];			# Recebe o input
	$idade = $_POST["idade"];
	$cor = $_POST["cor"];
	echo "Ola, " . $nome . "!";		// Mostra
	echo "\nVoce tem " . $idade . " anos.";
	echo "\nSua cor favorita é " . $cor . ".";
?>