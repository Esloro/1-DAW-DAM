# Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas. 
# Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas 
# mayores de edad (mayores o iguales a 18 años) -->

nombres=[]
edades=[]

for x in range(5):
    nom=input("Ingrese el nombre de la persona: ")
    nombres.append(nom)
    ed=int(input("Ingrese la edad de dicha persona: "))
    edades.append(ed)
    promedio=edades[x]
print("Nombre de las personas mayores de edad: ")
for x in range(5):
    if edades[x]>=18:
        print(nombres[x])
    

