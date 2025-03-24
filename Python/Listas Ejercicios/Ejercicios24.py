"""Solicitar por teclado la cantidad de empleados que tiene la empresa. Crear y cargar una lista con 
todos los sueldos de dichos empleados. Imprimir la lista de sueldos ordenamos de menor a mayor."""
sueldos=[]

n=int(input("Introduce el numero de empleados de la empresa: "))
for i in range (n):
    sueldo=int(input("Introduce el sueldo "))
    sueldos.append(sueldo)
print(sueldos)

for k in range(n-1):
    for x in range(n-1):
        if sueldos[x]>sueldos[x+1]:
            aux=sueldos[x]
            sueldos[x]=sueldos[x+1]
            sueldos[x+1]=aux

print("Lista ordenada", sueldos)