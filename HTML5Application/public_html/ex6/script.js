/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
//Seleccio de la obra del frame
let selectObra = document.getElementById("obra");
let frame = document.getElementById("contingut");
console.log(selectObra);
selectObra.addEventListener('change', () => {
    let seleccio= selectObra.value;
    let url = "";

    switch(seleccio) {
      case "tirant_lo_blanc":
        url = 'http://localhost:8383/HTML5Application/ex6/llibres/tirant_lo_blanc.html';
        break;
      case "quijote_de_la_mancha":
        url = 'http://localhost:8383/HTML5Application/ex6/llibres/quijote_de_la_mancha.html';
        break;
      case "guerra_i_pau":
        url = 'http://localhost:8383/HTML5Application/ex6/llibres/guerra_pau.html';
        break;
      case "la_divina_comedia":
        url = 'http://localhost:8383/HTML5Application/ex6/llibres/la_divina_comedia.html';
        break;
      case "la_isla_del_tesoro":
        url = 'http://localhost:8383/HTML5Application/ex6/llibres/la_isla_del_tesoro.html';
        break;
      default:
        url = '';
        break;
    }
    console.log(url);
  frame.src = url;
});

//Seleccio de l'estil
function actualizarEstilo() {
  let estilo = document.getElementById("estil").value;
  document.getElementById("contingut").className = estilo;
  console.log(estilo);
}

//Tamany de font
const rang = document.getElementById('rango');
const iframe = document.getElementById('contingut');

rang.addEventListener('input', () => {
  const body = iframe.contentWindow.document.querySelector('body');
  body.style.fontSize = rang.value + 'px';
});

// Canviar la font
function actualitzarFont() {
  
  let frame = document.getElementById("contingut");
  let body = frame.contentWindow.document.querySelector("body");
  
  let font = document.getElementById("font").value;
  console.log(font);

  body.style.fontFamily = font;
}



