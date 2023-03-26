/*
Construir um programa que apresente a soma dos cem primeiros numeros naturais
*/
package main

import "fmt"

func main() {
	var resultado int

	for i := 1; i <= 100; i++ {
		resultado += i
	}

	fmt.Println("A soma de 1 a 100 é:", resultado)
}
