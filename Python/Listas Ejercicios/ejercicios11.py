"""Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde) 
Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados en dos listas.
Imprimir las dos listas de sueldos."""

mañana=[]
tarde=[]
for i in range(4):
    print("Sueldos del turno de mañana")
    sueldos=int(input("Introduce el sueldo de los empleados "))
    print("Sueldos del turno de tarde")
    sueldos2=int(input("Introduce el sueldo de los empleados "))
    mañana.append(sueldos)
    tarde.append(sueldos2)
print(f"\n Lista de sueldos del turno de mañana {mañana}")
print(f"\n Lista de sueldos del turno de tarde {tarde}")