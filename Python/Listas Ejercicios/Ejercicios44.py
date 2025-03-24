"""Crear una lista de 5 enteros y cargarlos por teclado. Borrar los elementos mayores 
o iguales a 10 y generar una nueva lista con dichos valores."""

lista=[]
for x in range(5):
    valor=int(input("Ingrese un numero entero:"))
    lista.append(valor)
print(lista)

lista2=[]
posicion=0
while posicion<len(lista):
    if lista[posicion]>=10:
        lista2.append(lista.pop(posicion))
       
    else:
        posicion=posicion+1
    
print(lista) 
print("La lista actualizada",lista2)  