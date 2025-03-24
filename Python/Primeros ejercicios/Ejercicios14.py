#Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, 
# negativo o nulo (es decir cero)

valor=int(input("Ingrese un numero entero: "))

if valor >0:
    print(f"Es valor es positivo  {valor} ")
elif valor ==0:
  print(f"Es valor es nulo  {valor} ")
elif valor <0:
    print(f"Es valor es negativo  {valor} ")
