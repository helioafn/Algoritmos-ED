# Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores pares situados
# na faixa numérica de 50 até 70

somatorio = 0
cont = 0
for i in range(50, 71):
	if i % 2 != 0:
		continue
	
	somatorio += i
	cont += 1

media = somatorio / cont
print('Soma dos valores pares no intervalo (50,70):', somatorio)
print('Media:', media)

