#Se cuenta con la siguiente información:
#Las edades de 5 estudiantes del turno mañana.
#Las edades de 6 estudiantes del turno tarde.
#Las edades de 11 estudiantes del turno noche.
#Las edades de cada estudiante deben ingresarse por teclado.
#a) Obtener el promedio de las edades de cada turno (tres promedios)
#b) Imprimir dichos promedios (promedio de cada turno)
#c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades mayor.

suma=0
for i in range(5):
    edad=int(input("Ingrese la edad del estudiante del turno de mañana "))
    suma= (suma+edad)
    i=i+1
    promedioMañana=suma/5
print(promedioMañana)
for i in range(6):
    edad=int(input("Ingrese la edad del estudiante del turno de tarde "))
    suma= (suma+edad)
    i=i+1
    promedioTarde=suma/6
print(promedioTarde)
for i in range(11):
    edad=int(input("Ingrese la edad del estudiante del turno de noche "))
    suma= (suma+edad)
    i=i+1
    promedioNoche=suma/11
print(promedioNoche)

print(f"Promedio turno de mañana: {promedioMañana} Promedio turno de tarde: {promedioTarde} Promedio turno de noche: {promedioNoche}")
print("El turno con el promedio de edad mayor es:")
if(promedioMañana>promedioTarde and promedioTarde>promedioNoche):
    print("Turno mañana")
if(promedioTarde>promedioNoche):
    print("Turno tarde")
elif(promedioNoche>promedioTarde):
    print("Turno noche")