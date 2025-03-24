"""Crear una lista por asignación con la cantidad de elementos de tipo lista que usted desee. Luego imprimir 
el último elemento de la lista principal. Listas: carga por teclado de componentes de tipo lista
En el concepto anterior vimos que fácilmente podemos definir por asignación una lista cuyas componentes sean también listas:
lista=[[1,2,3], [7,4], [9,2]]
En muchas situaciones debemos crear una nueva lista ingresando los datos por teclado o por operaciones del mismo programa.
"""
lista = []

cantidad = int(input("¿Cuántas sublistas desea ingresar? "))

for i in range(cantidad):
    sublista = []
    elementos = int(input(f"¿Cuántos elementos tendrá la sublista {i+1}? "))
    
    for j in range(elementos):
        elemento = int(input(f"Ingrese el elemento {j+1} de la sublista {i+1}: "))
        sublista.append(elemento)

    lista.append(sublista)

print("\nLista completa con sublistas ingresadas:")
print(lista)

print("\nÚltima sublista de la lista principal:")
print(lista[-1])
