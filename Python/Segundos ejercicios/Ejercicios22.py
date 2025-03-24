#Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida 
# de la base y la altura de un triángulo. El programa deberá informar:
#a) De cada triángulo la medida de su base, su altura y su superficie.
#b) La cantidad de triángulos cuya superficie es mayor a 12.

n=int(input("Cuantos pares de valores vas a ingresar: "))
cont=0
cont2=0

for i in range (n):
    base=float(input("Introduce el valor de la base "))
    altura=float(input("Introduce la altura del triangulo "))
    superficie= (base*altura)/2
    print (f"La base del triangulo es {base}, su altura es {altura} y su superficie: {superficie}")
    if (superficie >=12):
        cont=cont+1
    elif(superficie <12):
        cont2=cont2+1


print(f"Se han introducido {cont} triangulos con superficie mayor a 12 y {cont2} con una superficie inferior")