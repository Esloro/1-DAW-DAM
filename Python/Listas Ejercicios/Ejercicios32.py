"""Se tiene la siguiente lista:
lista=[[4,12,5,66], [14,6,25], [3,4,5,67,89,23,1], [78,56]]
Imprimir la lista. Luego fijar con el valor cero todos los elementos mayores a 10 contenidos en todos los 
elementos de la variable "lista". Volver a imprimir la lista."""

lista=[[4,12,5,66], [14,6,25], [3,4,5,67,89,23,1], [78,56]]
print(lista)

 
for sublista in lista:
    for i in range(len(sublista)):
        if sublista[i] > 10:
            sublista[i] = 0  
   


print("\nLista modificada (elementos > 10 en el primer subelemento fijados a 0):")
print(lista)