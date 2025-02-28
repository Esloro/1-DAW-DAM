#Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
#Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.

suma1=0
suma2=0

print("Ingrese 10 valores para la primera lista: ")
i=0
while i <10:
    valor = int(input(f"Valor {1+i}: "))
    suma1+=valor
    i+=1

print("Ingrese 10 valores para la segunda lista: ")
i=0
while i <10:
    valor = int(input(f"Valor {1+i}: "))
    suma2+=valor
    i+=1
    
if suma1>suma2:
    print("La primera lista es mayor")
elif suma1<suma2:
    print("La segunda lista es mayor")
else:
    print("Las listas son iguales")