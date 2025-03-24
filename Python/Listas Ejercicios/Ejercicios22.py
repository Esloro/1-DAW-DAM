"""Se debe crear y cargar una lista donde almacenar 5 sueldos. Ordenar de menor a mayor la lista.
Ahora bien como vimos en el problema anterior con los 4 elementos que nos quedan podemos hacer el mismo proceso 
visto anteriormente, con lo cual quedará ordenado otro elemento de la lista. 
Este proceso lo repetiremos hasta que quede ordenado por completo la lista.
Como debemos repetir el mismo algoritmo podemos englobar todo el bloque en otra estructura repetitiva.
"""

sueldos=[]
for x in range(5):
    valor=int(input("Ingrese sueldo:"))
    sueldos.append(valor)


print("Lista sin ordenar")
print(sueldos)


for k in range(4):
    for x in range(4):
        if sueldos[x]>sueldos[x+1]:
            aux=sueldos[x]
            sueldos[x]=sueldos[x+1]
            sueldos[x+1]=aux


print("Lista ordenada")
print(sueldos)
