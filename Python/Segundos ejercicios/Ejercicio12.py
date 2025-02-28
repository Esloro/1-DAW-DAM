#Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
#Emplear el operador “%” en la condición de la estructura condicional (este operador retorna el resto de la división de dos valores, por ejemplo 11%2 retorna un 1):

num = int(input("Introduce cuantos numeros quieres cargar "))
print(num)

cont=0
cont1=0
cont2=0
while cont < num:
    numero = int(input("Introduce un numero "))
    print(numero)
    cont+=1
    if numero%2==0:
        cont1+=1
    else:
        cont2+=1


print()
print(f"Hay {cont1} numeros pares")
print(f"Hay {cont2} numeros impares")

