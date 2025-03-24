"""Crear dos listas paralelas. En la primera ingresar los nombres de empleados y en la segunda los sueldos de cada empleado.
Ingresar por teclado cuando inicia el programa la cantidad de empleados de la empresa.
Borrar luego todos los empleados que tienen un sueldo mayor a 10000 (tanto el sueldo como su nombre)"""

lista=[]
lista2=[]
n=int(input("Cuantos empleados tiene la empresa "))

for x in range (n):
    nombres=input("Ingrese el nombre de los empleados:")
    lista.append(nombres)
    sueldos=int(input("Ingrese el sueldo de los empleados:"))
    lista2.append(sueldos)
    
print(lista)
print(lista2)

posicion=0


while posicion <len(lista):
    if (lista2[posicion]>1000):
        lista.pop(posicion) 
        lista2.pop(posicion)
    else:
        posicion=posicion+1
print(f"Las listas actualizadas {lista, lista2}")  
      


