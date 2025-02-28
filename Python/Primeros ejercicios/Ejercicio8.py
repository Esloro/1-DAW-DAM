numero = int(input("Ingrese un numero positivo entre 1 y 99: "))


if 1<= numero <=9:
    print(f"El numero tiene un digito, {numero} ")
elif 10<= numero <=99:
   print(f"El numero tiene dos digitos, {numero} ")
   
else:
    print("Numero fuera del rango permitido.")