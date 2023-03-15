/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
let notesM01 = [];
let notesM02 = [];
let notesM03 = [];


function afegirNota() {
    let modulEscollit = document.getElementById("modul").value;
    let notaEscollida = document.getElementById("nota").value;
    console.log(modulEscollit);
    console.log(notaEscollida);
  if(modulEscollit === 'M01') {
        notesM01.push(notaEscollida);
        localStorage.setItem('notesM01', notesM01.join(','));
        document.getElementById("mostrarNota").innerHTML = "Notes " + modulEscollit + ": " + notesM01.join(', ');   
        document.getElementById("mostrarNotaMitjana").innerHTML =  "Mitjana " + ": " + calcularMitjana(notesM01).toFixed(2);
   
    } else if(modulEscollit === 'M02') {
        notesM02.push(notaEscollida);
        localStorage.setItem('notesM02', notesM02.join(','));
        document.getElementById("mostrarNota").innerHTML = "Notes " + modulEscollit + ": " + notesM02.join(', ');
        document.getElementById("mostrarNotaMitjana").innerHTML =  "Mitjana " + ": " + calcularMitjana(notesM02).toFixed(2);
    } else if(modulEscollit === 'M03') {
        notesM03.push(notaEscollida);
        localStorage.setItem('notesM03', notesM03.join(','));
        document.getElementById("mostrarNota").innerHTML = "Notes " + modulEscollit + ": " + notesM03.join(', ');
        document.getElementById("mostrarNotaMitjana").innerHTML =  "Mitjana " + ": " + calcularMitjana(notesM03).toFixed(2);
    }
}
let localStorageM01 = localStorage.getItem('notesM01');
if (localStorageM01) {
  notesM01 = localStorageM01.split(',');
}

let localStorageM02 = localStorage.getItem('notesM02');
if (localStorageM02) {
  notesM02 = localStorageM02.split(',');
}

let localStorageM03 = localStorage.getItem('notesM03');
if (localStorageM03) {
  notesM03 = localStorageM03.split(',');
}

function calcularMitjana(notes) {
  let sum = 0;
  for(let i = 0; i < notes.length; i++) {
    sum += parseInt(notes[i]);
  }
  return sum / notes.length;
}
function presentarNotesMitjanes() {  
  let mitjanaM01 = calcularMitjana(notesM01).toFixed(2);
  let mitjanaM02 = calcularMitjana(notesM02).toFixed(2);
  let mitjanaM03 = calcularMitjana(notesM03).toFixed(2);
  let mitjanaTotal = calcularMitjana([...notesM01, ...notesM02, ...notesM03]).toFixed(2);
  console.log(mitjanaM01);
  console.log(mitjanaM02);
  console.log(mitjanaM03);
  console.log(mitjanaTotal);
  document.getElementById("mostrarNota").innerHTML = "";
  if (!isNaN(mitjanaTotal)){
        let llista = document.createElement('llista');
  
        let mitM01 = document.createElement('li');
        mitM01.textContent = "Mitjana M01: " + mitjanaM01;
        llista.appendChild(mitM01);

        let mitM02 = document.createElement('li');
        mitM02.textContent = "Mitjana M02: " + mitjanaM02;
        llista.appendChild(mitM02);

        let mitM03 = document.createElement('li');
        mitM03.textContent = "Mitjana M03: " + mitjanaM03;
        llista.appendChild(mitM03); 

        let mitTotal = document.createElement('p');
        mitTotal.textContent = "Mitjana Total: " + mitjanaTotal;

        let div = document.getElementById("mostrarNotaMitjana");
        div.innerHTML = "";
        div.appendChild(llista );
        div.appendChild(mitTotal);
    }
}
  
function reiniciar() {
  notesM01 = [];
  notesM02 = [];
  notesM03 = [];

  localStorage.removeItem('notesM01');
  localStorage.removeItem('notesM02');
  localStorage.removeItem('notesM03');

  document.getElementById("mostrarNota").innerHTML = "";
  document.getElementById("mostrarNotaMitjana").innerHTML = "";
}


