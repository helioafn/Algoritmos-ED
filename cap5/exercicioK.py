# Escreva um programa que calcule e apresente o somatório do número de grãos de trigo que se pode obter num
# tabuleiro de xadrez, obedecendo a seguinte regra: colocar um trigo no primeiro quadro, e nos seguintes
# o dobro do quadrado anterior
base, num_graos = 2,0
for i in range(64):
	num_graos += base ** i

print(num_graos)
