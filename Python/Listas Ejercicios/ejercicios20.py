#ORDENAR LISTAS
#Realizar un programa que pida la carga de dos listas numéricas enteras de 4 elementos cada una. 
# Generar una tercer lista que surja de la suma de los elementos de la misma posición de cada lista. 
# Mostrar esta tercer lista.
lista1=[]

for i in range (4):
    print("Primera lista")
    num=input("Ingrese un numero: ")
    lista1.append(num)
    

if lista1[0] <= lista1[1] <= lista1[2]<=lista1[3]:
    print("La lista esta ordenada de menor a mayor")
else:
    print("La lista no está ordenada")