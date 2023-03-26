// Elaborar um programa que apresente todos os números inteiros ímpares dentro da faixa de 0 a 20

package main

import "fmt"

func main() {
	for i := 0; i <= 20; i++ {
		if i%2 != 0 {
			fmt.Print(i, " ")
		}
	}
	fmt.Println()
}
