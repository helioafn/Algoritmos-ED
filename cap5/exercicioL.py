# Elaborar um programa que leia quinze valores numéricos inteiros e no final apresente o somatorio da fatorial
# de cada valor lido.
somatorio = 0

for i in range(15):
	fat = 1
	entrada = int(input("Digite um numero: "))
	for j in range(1,entrada+1):
		fat *= j	
	somatorio += fat

print(somatorio)
