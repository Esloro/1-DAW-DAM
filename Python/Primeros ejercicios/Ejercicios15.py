#Ejercicio 15 uso de and

num1=int(input("Ingrese primer valor:"))
num2=int(input("Ingrese segundo valor:"))
num3=int(input("Ingrese tercer valor:"))
print("El mayor de los tres valores es")
if num1>num2 and num1>num3:
    print(num1)
else:
    if num2>num3:
        print(num2)
    else:
        print(num3)
