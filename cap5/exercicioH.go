// Escrever um programa que apresente como resultado a potência de uma base qualquer
// elevada a um expoente qualquer -> B^E

package main

import "fmt"

func main() {
	var base, expoente int
	pot := 1
	fmt.Println("Insira o número base a ser calculado:")
	fmt.Scanf("%d", &base)
	fmt.Println("Insira o expoente:")
	fmt.Scanf("%d", &expoente)

	for i := 1; i <= expoente; i++ {
		pot *= base
	}
	
	fmt.Printf("%d^%d = %d\n",base, expoente, pot)
}
