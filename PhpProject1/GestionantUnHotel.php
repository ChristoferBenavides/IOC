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
            //array
            $taules = array();
            $taules[0] = rand(0,5);
            $taules[1] = rand(0,5);
            $taules[2] = rand(0,5);
            $taules[3] = rand(0,5);
            $taules[4] = rand(0,5);
            $taules[5] = rand(0,5);
            $taules[6] = rand(0,5);
            $taules[7] = rand(0,5);
            $taules[8] = rand(0,5);
            $taules[9] = rand(0,5);
            
            //En aquest cas utilitzem la funció array_push, que afegeix una dada al final de l’array.
            $taules = array();
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            array_push($taules, rand(0,5));
            
            //for
            $taules = array();
            for($numTaula=0;$numTaula < 10 ; $numTaula++ ){
                $taules[$numTaula] = rand(0,5);
            }
            echo $taules[4];
            /*Foreach
                foreach (expresio_array as $clau => $valor){
                    sentencies
                }*/
            
            //creació de l'array
            $taules = array();
 
            //Omplir l'array associatiu:
            for($numTaula=0;$numTaula < 10 ; $numTaula++ ){
                $taules["taula ".$numTaula] = rand(0,5);
            }
 
            //visualització del contingut de l'array
            //$comensals = $taules[$posicio];.(foreach)
            foreach($taules as $posicio => $comensals){
                //if
                if ($comensals == 0){
                    echo "La $posicio està buida\n<br>";
                }
                elseif ($comensals == 5){
                    echo "La $posicio està plena\n<br>";
                }
                else {
                    echo "A la $posicio hi ha $comensals comensals\n<br>";
                }
            }
            //Sortida:
          /*A la taula 0 hi ha 2 comensals
            A la taula 1 hi ha 3 comensals
            A la taula 2 hi ha 1 comensals
            A la taula 3 hi ha 3 comensals
            La taula 4 està buida
            A la taula 5 hi ha 2 comensals
            La taula 6 està plena
            La taula 7 està plena
            La taula 8 està plena
            La taula 9 està buida*/
        ?>
        
        
    </body>
</html>
