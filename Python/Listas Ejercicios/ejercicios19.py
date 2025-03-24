#Realizar un programa que pida la carga de dos listas numéricas enteras de 4 elementos cada una. 
# Generar una tercer lista que surja de la suma de los elementos de la misma posición de cada lista. 
# Mostrar esta tercer lista.
lista1=[]
lista2=[]
resultado=[]
for i in range (4):
    print("Primera lista")
    num=int(input("Ingrese un numero: "))
    lista1.append(num)

    print("Segunda lista")
    num1=int(input("Ingrese un numero: "))
    lista2.append(num1)

for i in range(4):
    resultado.append(lista1[i] + lista2[i])

print(resultado)