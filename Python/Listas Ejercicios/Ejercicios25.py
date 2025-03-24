"""Cargar una lista con 5 elementos enteros. Ordenarla de menor a mayor y mostrarla por pantalla, 
luego ordenar de mayor a menor e imprimir nuevamente. Listas: ordenamiento con listas paralelas
Cuando se tienen listas paralelas y se ordenan los elementos de una de ellas hay que tener la precaución de 
intercambiar los elementos de las listas paralelas.
"""

enteros=[]

for i in range (5):
    numero=int(input("Introduce un numero entero: "))
    enteros.append(numero)
print(enteros)

for k in range(4):
    for x in range(4):
        if enteros[x]>enteros[x+1]:
            aux=enteros[x]
            enteros[x]=enteros[x+1]
            enteros[x+1]=aux

print("Lista ordenada de menor a mayor", enteros)
for k in range(4):
    for x in range(4):
        if enteros[x]<enteros[x+1]:
            aux=enteros[x]
            enteros[x]=enteros[x+1]
            enteros[x+1]=aux

print("Lista ordenada de mayor a menor", enteros)