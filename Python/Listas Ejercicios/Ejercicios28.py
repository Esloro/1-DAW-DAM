"""Crear una lista por asignación. La lista tiene que tener cuatro elementos. Cada elemento debe ser una lista de 3 enteros.
Imprimir sus elementos accediendo de diferentes modos."""

lista=[[1,2,3], [4,5,6], [7,8,9], [10,11,12]]


# imprimimos la lista completa
print(lista)
print("---------")
# imprimimos la primer componente
print(lista[0])
print("---------")
# imprimimos la primer componente de la lista contenida
# en la primer componente de la lista principal
print(lista[0][0])
print("---------")
# imprimimos con un for la lista contenida en la primer componente
for x in range(len(lista[0])):
    print(lista[0][x])
print("---------")               
# imprimimos cada elemento entero de cada lista contenida en la lista
for k in range(len(lista)):
    for x in range(len(lista[k])):
        print(lista[k][x])
#El resultado de ejecutar este programa es:
"""[[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]]
---------
[1, 2, 3]
---------
1
---------
1
2
3
---------
1
2
3
4
5
6
7
8
9
10
11
12"""
