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
        //La paraula reservada static permet guardar el valor d’una variable d’àmbit local dintre de la funció. 
        //Cada vegada que s’executi la funció, la variable tindrà l’últim valor que havia tingut a l’execució anterior.
            function suma(){
                static $num;
                $num++;
                return $num;
            }
            echo suma();
            echo suma();
            echo suma();
            //Variable Global
            global $num;
        ?>
    </body>
</html>
