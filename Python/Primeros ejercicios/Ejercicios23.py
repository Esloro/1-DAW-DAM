#Escribir un programa en el cual: dada una lista de tres valores numéricos distintos 
# se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos)

numero=int(input("Ingrese un numero "))
numero2=int(input("Ingrese un numero "))
numero3=int(input("Ingrese un numero "))

print("El mayor de los tres valores es")
if numero>numero2 and numero>numero3:
    print(numero)
else:
    if numero2>numero3:
        print(numero2)
    else:
        print(numero3)

print("El menor de los tres valores es")
if numero<numero2 and numero<numero3:
    print(numero)
else:
    if numero2<numero3:
        print(numero2)
    else:
        print(numero3)