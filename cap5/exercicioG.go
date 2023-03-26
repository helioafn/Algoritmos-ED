// Elaborar um programa que apresente os resultados das potências do valor de base 3, elevado a um expoente que
// varie do valor 0 até 15. Leve em consideração as definições matemáticas de potência n^0 = 1, n^1 = n

package main

import "fmt"

func main() {
	base := 3
	pot := 1
	for i := 0; i <= 15; i++ {
		if i == 0 {
			fmt.Print("1 ")
			continue
		}
		pot *= base
		fmt.Print(pot, " ")

	}

	fmt.Println()
}
