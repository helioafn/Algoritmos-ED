# Construir um programa que apresente como resultado a fatorial dos valores ímpares situados na faixa numérica
# de 1 até 10

for i in range(10):
	if i % 2 == 0:
		continue
	fat = 1
	for j in range(1, i+1):
		fat *= j
	print(fat)	
