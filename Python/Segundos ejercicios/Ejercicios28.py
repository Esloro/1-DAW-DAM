#Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
#a) La cantidad de valores ingresados negativos.
#b) La cantidad de valores ingresados positivos.
#c) La cantidad de múltiplos de 15.
#d) El valor acumulado de los números ingresados que son pares.

cont=0
cont1=0
cont2=0
for i in range(10):
    valor=int(input("Ingrese un numero entero: "))
    if valor %15 ==0:
        cont1=cont1+1
        print(f"Es valor multiplo de 15  {valor} ")     
        if valor >0:
            cont=cont+1
            print(f"Es valor es positivo  {valor} ")
        if valor <0:
            cont2=cont2+1
            print(f"Es valor es negativo  {valor} ")
print(f"Hay {cont} numeros positivos, {cont2} numeros negativos y {cont1} numeros multiplos de 15")