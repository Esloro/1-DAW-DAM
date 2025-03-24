"""Crear y cargar en un lista los nombres de 5 países y en otra lista paralela la cantidad de habitantes del mismo. 
Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes 
(de mayor a menor) e imprimir nuevamente.
"""

paises=[]
habitantes=[]
for i in range (2):
    nombre=input("Introudce el nombre del pais: ")
    paises.append(nombre)
    
    cantidad=int(input("Cantidad de habitantes"))
    habitantes.append(cantidad)
paises.sort()
print(paises)

for i in range (2):
    print(f"Paises {paises[i]}, tiene {habitantes[i]} habitantes")
habitantes.sort()
