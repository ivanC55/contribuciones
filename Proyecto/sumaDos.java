public class sumaDos {
public static void main(String[] args) {
    int primero = 5;
    int segundo = 9;
    int suma = primero + segundo;
    System.out.println("La suma es : " + suma);
}
}


"use strict";

/** Carga el módulo. Función de node.js para cargar módulos  */
const prompt = require('prompt-sync')();

let numeroAleatorio = 0;
let arrayNumAleatorios = [];
let arrayNumUsuario = [];
let numeroUsuario = 0;
let contadorAciertos= 0;
let arrayNumerosAcertados= [];

console.log("\n----Programa para adivinar números aleatorios de 0 a 20----\n");

//Genero 10 números aleatorios del 0 al 20 y los añado a un array.
for (let i = 0; i < 10; i++) {
    numeroAleatorio = Math.floor(Math.random() * 20);
    arrayNumAleatorios.push(numeroAleatorio);
}

arrayNumAleatorios.forEach(element => {
    console.log (element);
});

//Pido al usuario 5 números y los añado a otro array
for (let i = 0; i < 5; i++) {
    numeroUsuario = prompt("Introduce número: ");
    arrayNumUsuario.push(numeroUsuario);
}


//Comparo los dos arrays para saber el número de aciertos y los números acertados
arrayNumUsuario.forEach(element => {
    if(arrayNumAleatorios.includes(Number(element))){
        arrayNumerosAcertados.push(element);
        contadorAciertos++;
    }
});

console.log("Has acertado: "+ contadorAciertos);

console.log("Los números acertados son: ");
arrayNumerosAcertados.forEach(element => {
    console.log(element);
});
