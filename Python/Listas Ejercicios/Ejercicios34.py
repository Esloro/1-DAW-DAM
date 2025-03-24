"""Crear y cargar una lista con los nombres de tres alumnos. Cada alumno tiene dos notas, almacenar las notas en una 
lista paralela. Cada componente de la lista paralela debe ser también una lista con las dos notas. Imprimir luego cada nombre y sus dos notas.
Si cargáramos los datos por asignación sería algo parecido a esto:
alumnos=["juan", "ana", "luis"]
notas=[[10,8], [6,5], [2,8]]
En la componente 0 de la lista alumnos tenemos almacenado el nombre "juan" y como son listas paralelas en la 
componente 0 de la lista notas tenemos almacenado una lista con las dos notas 10 y 8.
Nuestro objetivo como lo pide el problema es cargar los datos por teclado.
"""

nombres=[]
notas=[]
for x in range(3):
    nom=input("Ingrese el nombre del alumno:")
    nombres.append(nom)
    no1=int(input("Ingrese la primer nota:"))
    no2=int(input("Ingrese la segunda nota:"))
    notas.append([no1,no2])


for x in range(3):
    print(nombres[x],notas[x][0],notas[x][1])

nombres=[]
notas=[]
