"""Definir una lista y almacenar los nombres de 3 empleados. Por otro lado definir otra lista y almacenar 
en cada elemento una sublista con los números de días del mes que el empleado faltó.
Imprimir los nombres de empleados y los días que faltó.
Mostrar los empleados con la cantidad de inasistencias.
Finalmente mostrar el nombre o los nombres de empleados que faltaron menos días."""

lista=[]
faltas=[]
for i in range(3):
    nombre=input("Introuce el nombre del empleado ")
    lista.append(nombre)

    cantidad=int(input(f"Introduce el numero de dias que {nombre} faltó: "))
    dias=[]
    for j in range(cantidad):
        dia=int(input(f"Introduce el día que {nombre} faltó"))
        dias.append(dia)
    faltas.append(dias)
              
for i in range (3): 
    print(f"{lista[i]} faltó los dias: {faltas[i]}")

cont= [len(dias) for dias in faltas]
for i in range (3):
    print(f"{lista[i]} faltó {cont[i]} dias")

minimo = min(cont)
empleados =[lista[i] for i in range(3) if cont[i]== minimo]

print("\n Empleados que faltaron menos dias")
for lista in empleados:
    print(lista)
