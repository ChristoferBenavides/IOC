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
            //funció define, que defineix una constant en el programa.
            //Llistat del nombre de persones per habitació
 
            //Crear l'estructura inicial
            define("NUM_PLANTES", 5);
            define("NUM_HAB", 10);
            define("MAX_CLIENTS", 4);
            $habitacions = array();
            for($pis=0; $pis < NUM_PLANTES; $pis++){
                $habitacions[$pis] = array();
                for($porta=0; $porta < NUM_HAB; $porta++){
                    $habitacions[$pis][$porta] = rand(0,MAX_CLIENTS);
                }
            }
 
            //recórrer l'estructura per obtenir la informació:
            for($pis=0; $pis < NUM_PLANTES; $pis++){
                for($porta=0; $porta < NUM_HAB; $porta++){
                    switch ($habitacions[$pis][$porta]){
                        case 0:
                            echo "La habitació $porta de la planta $pis està buida.\n";
                            break;
                        case 4:
                            echo "La habitació $porta de la planta $pis està plena.\n";
                            break;
                        default :
                            echo "A la habitació $porta de la planta $pis hi ha ". $habitacions[$pis][$porta]. " persones.\n";
                    }
                }
            }
            
            //Cercar si hi ha habitacions lliures
            //Crear l'estructura inicial
            define("NUM_PLANTES", 5);
            define("NUM_HAB", 10);
            define("MAX_CLIENTS", 4);
            $habitacions = array();
            for($pis=0; $pis < NUM_PLANTES; $pis++){
                $habitacions[$pis] = array();
                for($porta=0; $porta < NUM_HAB; $porta++){
                    $habitacions[$pis][$porta] = rand(0,MAX_CLIENTS);
                }
            }
            //recórrer l'estructura per obtenir la informació:
            $pis=0;
            $porta=0;
            $trobat = false;
            while (!$trobat && $pis < NUM_PLANTES){
                if($habitacions[$pis][$porta] === 0){
                    $trobat = true;
                }
                if($porta == NUM_HAB -1){
                    $porta = 0;
                    $pis++;
                }
                else{
                    $porta++;
                }
            }
            echo ($trobat)? "Almenys hi ha una habitació lliure." : "No existeixen habitacions lliures.";
            /*S’anomena operador ternari i ens estalvia molt temps en l’escriptura del nostre codi, alhora que el simplifica.
            expressio1 ? expressio2 : expressio3
            if (expressio1) {
                expressio2;
            } else {
                expressio3;
            }
            .........
            sense operador ternari
            $faFred=false;             
            if ($faFred) {
                $temps = "Fa molt de fred";
            } else {
                $temps = "No fa fred";
            }
            echo $temps;
             * 
            //amb operador ternari
            $faFred=false;
            $temps = ($faFred)? "Fa molt de fred" : "No fa fred";
            echo $temps; */
            
        ?>
    </body>
</html>
