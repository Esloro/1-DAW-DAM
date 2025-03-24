#Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, 
# imprimir en pantalla la leyenda "Todos los números son menores a diez".

numero=int(input("Ingrese un numero "))
numero2=int(input("Ingrese un numero "))
numero3=int(input("Ingrese un numero "))

if (numero <10 and numero2 <10 and numero3 <10):
    print(f"Todos los numeros son menores a diez. Numeros: {numero, numero2, numero3}")
else:
    print("Algún número es mayor o igual que 10 ")