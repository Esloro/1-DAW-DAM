#Pedir 10 numeros y hacerle el promedio
x=1
suma=0
while x<=10:
    num= int (input("Ingrese un número "))
    suma= suma+num
    x=x+1

promedio= suma/10
print(f"La suma de los 10 números es: {suma}")
print(f"El promedio de los 10 números es: {promedio}")
