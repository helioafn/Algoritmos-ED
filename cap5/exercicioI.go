// Escrever um programa que apresente os valores da sequência numérica de Fibonacci, até
// o décimo quinto termo.
// A sequencia de Fibonacci é formada por: 0, 1, 1, 2, 3, 5, 8, 13,...

package main

import "fmt"

func main() {
	var a, b, aux = 0, 1, 0
	for i := 1; i <= 15; i++ {
		aux = b
		b = a + b
		a = aux
		fmt.Print(b, " ")
	}
	fmt.Println()
}
