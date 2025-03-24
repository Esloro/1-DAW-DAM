"""Se tiene la siguiente lista:
lista=[[100,7,85,8], [4,8,56,25], [67,89,23,1], [78,56]]
Imprimir la lista. Luego fijar con el valor cero todos los elementos mayores a 50 del primer elemento de "lista".
Volver a imprimir la lista."""

lista=[[100,7,85,8], [4,8,56,25], [67,89,23,1], [78,56]]
print(lista)


for i in range(len(lista[0])):
    if lista[0][i] > 50:
        lista[0][i] = 0

print("\nLista modificada (elementos > 50 en el primer subelemento fijados a 0):")
print(lista)