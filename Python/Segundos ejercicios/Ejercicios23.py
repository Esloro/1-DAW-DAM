#Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.

numeros=[]
for i in range (10):
    numero=int(input("Introduce un numero "))
    numeros.append(numero)
    ultimos = numeros[-5:]
    suma=sum(ultimos)


print(f"La suma de los ultimos 5 numeros es: {suma}")