/*
	Elaborar um programa que mostre os resultados da tabuada de um numero qualquer, a qual deve ser
	apresentada de acordo com sua forma tradicional.
*/

package main

import "fmt"

func main() {
	var n int
	fmt.Println("Insira um numero:")
	fmt.Scanf("%d", &n)

	for i := 1; i <= 10; i++ {
		fmt.Printf("%d x %d = %d\n", n, i, n*i)
	}
}
