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
        $quantitat = "10";
        $quantitat = (int) $quantitat;
        $quantitat++;
        echo $quantitat;
        
        //Amb la funció serialize() podem emmagatzemar en un string un objecte sencer per després 
        //tornar-lo a restaurar. La forma de restaurar-lo és utilitzant la funció unserialize().
        $arr = array("a","e","i","o","u");
        $serial = serialize($arr);
        echo($serial);
        
        $arrayText = 'a:5:{i:0;s:1:"a";i:1;s:1:"e";i:2;s:1:"i";i:3;s:1:"o";i:4;s:1:"u";}';
        $arrayOriginal = unserialize($arrayText);
        echo $arrayOriginal[1]; //e
        
        //Conversió a 'array'
        $dada = "hola";
        $arr = (array) $dada;
        echo $arr[0]; // hola
        
        ?>
    </body>
</html>
