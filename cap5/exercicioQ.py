# Escrever um programa que possibilite calcular a área total em metros de uma residência com os seus cômodos.
# Solicitar o nome do cômodo, largura e comprimento. Exibir a área de tal cômodo. 
# Repetir até que o usuário digite 'NÃO'. Apresente a área acumulada da área residencial.

area_total = 0.0
comodo = ''
largura_comodo = 0.0
comprimento_comodo = 0.0
area_comodo = 0.0

while True:
	comodo = input('Digite o nome do cômodo[\'não\' interrompe a entrada]:')

	if comodo == 'não':
		print('Total da área residencial:', area_total)
		break

	largura_comodo = float(input('Digite a largura do comôdo:'))
	comprimento_comodo = float(input('Digite o comprimento do cômodo:'))
	area_comodo = largura_comodo * comprimento_comodo
	print('Área de', comodo, ':', area_comodo)
	area_total += area_comodo