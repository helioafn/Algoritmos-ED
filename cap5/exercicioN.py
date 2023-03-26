# Elaborar um programa que leia valores numericos e apresente no final o somatorio, a media e o total de valores
# lidos. O programa deve ler os valores enquanto o usuario estiver fornecendo valores positivos.

somatorio = 0
cont = 0

while True:
	entrada_usuario = float(input("Digite um numero inteiro [numeros negativos param a entrada]:"))
	if entrada_usuario < 0:
		break

	somatorio += entrada_usuario
	cont += 1

media = somatorio / cont
print("Quantidade de numeros inseridos:", cont)
print("Somatorio dos valores inseridos:", somatorio)
print("Media dos valores inseridos:", media)
