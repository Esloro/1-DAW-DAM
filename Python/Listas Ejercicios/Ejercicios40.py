"""Desarrollar un programa que cree una lista de 50 elementos. El primer elemento es una lista con un 
elemento entero, el segundo elemento es una lista de dos elementos etc.
La lista debería tener esta estructura y asignarle esos valores a medida que se crean los elementos:"""

lista=[]
for x in range (50):
    lista1 = [i for i in range(1, x + 1)] 
    numero=int(input("Introduce un valor entero"))
    lista1.append(numero)
    lista.append(lista1)
    x=x+1

print(lista)