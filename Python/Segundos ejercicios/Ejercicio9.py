#Calcula los numeros primos de n numeros, por consola me pedira un numero y con el while tenemos que mostrar lso numeros primos
n =int(input("Ingrese un numero "))
print (n)
num=0
while num <= n:
    divisor=2
    while divisor < num:
        if num % divisor == 0:
            break   
        divisor+=1
    else:
        print(f"El numero {num} es primo ")
    num+=1
