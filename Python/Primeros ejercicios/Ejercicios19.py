#Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, 
# imprimir en pantalla la leyenda "Alguno de los números es menor a diez".

numero=int(input("Ingrese un numero "))
numero2=int(input("Ingrese un numero "))
numero3=int(input("Ingrese un numero "))

if (numero <10 or numero2 <10 or numero3 <10):
    print(f"Algún numero ees menor a diez. Numeros: {numero, numero2, numero3}")
else:
    print("Todos los numeros son mayor que 10 ")