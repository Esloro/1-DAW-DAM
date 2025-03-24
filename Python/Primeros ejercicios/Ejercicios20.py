#Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero 
# con el segundo y a este resultado se lo multiplica por el tercero.

numero=int(input("Ingrese un numero "))
numero2=int(input("Ingrese un numero "))
numero3=int(input("Ingrese un numero "))

if (numero == numero2 and numero2 == numero3):
    suma=(numero+numero2)
    producto=suma*numero3
    print(f"La suma de los 2 primeros es {suma} y el producto de la suma y el tercero es {producto}")
else:
    print("Los numeros no son iguales")
