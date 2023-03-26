// Elaborar um programa que apresente o somatório dos valores pares existentes na faixa de 1 até 500
package main

import "fmt"

func main() {
	var resultado int
	for i := 2; i <= 500; i += 2 {
		resultado += i
	}
	fmt.Println("O somatório dos números pares de 1 a 500 é:", resultado)
}
