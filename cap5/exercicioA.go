/*
	Elaborar um programa que apresente como resultado os quadrados dos numeros inteiros existentes
	na faixa de valores de 15 a 200
*/

package main

import "fmt"

func main() {
	for num := 15; num <= 200; num++ {
		fmt.Printf("%d ", num*num)
	}
	fmt.Println()
}
