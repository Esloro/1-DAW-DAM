"""Crear una lista y almacenar los nombres de 5 países. Ordenar alfabéticamente la lista e imprimirla."""
paises=[]

for i in range (5):
    nombre=input("Introudce el nombre del pais: ")
    paises.append(nombre)

paises.sort()
print(paises)