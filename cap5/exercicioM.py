# Elaborar um programa que leia dez valores numéricos inteiros e no final apresente o somatorio da fatorial
# e a média dos valores lidos.

somatorio = 0

for i in range(5):
	fat = 1
	entrada_usuario = float(input("Insira um número:"))
	for j in range(1, int(entrada_usuario)+1):
		fat *= j
	somatorio += fat

media = somatorio / 5.0
print("somatorio:", somatorio)
print("media:", media)
