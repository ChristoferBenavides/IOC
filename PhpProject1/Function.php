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
            function calculaEdat($data){
                $avui = date_create('today');
                $diferencia = date_diff($avui, $data)->y;
                return $diferencia;
            }
            $nomPersona = "Clara"; //tipus string
            $cognoms = "Oswin"; // tipus string
            $data_naixement = date_create("1986-03-11"); //tipus date
            $edat = calculaEdat($data_naixement);
            echo $edat;
            
            
        ?>
    </body>
</html>
