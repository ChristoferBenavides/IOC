<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHPWebPage.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            $nomPersona = "Clara"; //tipus string
            $cognoms = "Oswin"; // tipus string
            $edat = 30; // tipus integer
            $sou = 30000; //tipus integer
            $data_naixement = strtotime("1986-03-11"); //timestamp (int)
            $telefon = "935555555"; // tipus string
            $adrecaPostal = "Blackpool, England"; //tipus string
            $email = "oswin@dr.who"; //tipus string
            $treballa = true; // tipus boolean
            $alcada = 167.23; // tipus float
            $convStringData = date("jS F, Y", $data_naixement); //Converteix a string una data segons un format donat.
        ?>
    </body>
</html>
