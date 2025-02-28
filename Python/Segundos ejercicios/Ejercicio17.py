#Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados 
#y su promedio. Este problema ya lo desarrollamos, lo resolveremos empleando la estructura for para repetir la carga de los diez valores por teclado.

suma=0
for x in range(10):
    num= int (input("Ingrese un número "))
    suma= suma+num
    x=x+1

promedio= suma/10
print(f"La suma de los 10 números es: {suma}")
print(f"El promedio de los 10 números es: {promedio}")
