#En un curso de 4 alumnos se registraron las notas de sus exámenes y se deben procesar de acuerdo a lo siguiente:
#a) Ingresar nombre y nota de cada alumno (almacenar los datos en dos listas paralelas)
#b) Realizar un listado que muestre los nombres, notas y condición del alumno. En la condición, 
# colocar "Muy Bueno" si la nota es mayor o igual a 8, "Bueno" si la nota está entre 4 y 7, y colocar "Insuficiente" si la nota es inferior a 4.
#c) Imprimir cuantos alumnos tienen la leyenda “Muy Bueno”.

alumnos=[];
notas=[];

for x in range(5):
    nom=input("Ingrese el nombre de los alumnos: ")
    alumnos.append(nom)
    ed=int(input("Ingrese su nota: "))
    notas.append(ed)
   
print("Nombre de los productos con un precio mayor al primer producto: ")
for x in range(4):
    if  notas[x] <=4:
         print(f"Isuficiente {alumnos[x]}") 
    if 4 < notas[x] >=7:
         print(f"Bueno {alumnos[x]}") 
    if notas[x]>=8:
        print(f"Muy Bueno {alumnos[x]}")
    
    