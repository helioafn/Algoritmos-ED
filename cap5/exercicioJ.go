/*
	Elabore um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit, 
	de dez em dez graus, iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius.
	O programa deve apresentar os valores das duas temperaturas.
*/

package main

import "fmt"

func main() {

	for celsius := 10.0; celsius <= 100.0; celsius += 10.0 {
	fahrenheit := (celsius * 9) / 5 + 32
	fmt.Printf("%.1fºC %.1fºF\n", celsius, fahrenheit)
} 	
	
}
