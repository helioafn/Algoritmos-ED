// Construir um programa que apresente todos os valores numéricos divisiveis por 4 e menores que 200.
package main

import "fmt"

func main() {
	for i := 1; i <= 200; i++ {
		if i%4 == 0 {
			fmt.Print(i, " ")
		}
	}
	fmt.Println()
}
