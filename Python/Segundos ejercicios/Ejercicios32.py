"""Realizar la carga de dos nombres por teclado. Mostrar cual de los dos es mayor alfabéticamente 
o si son iguales. """

nombre1=input("Ingrese el primer nombre:")
nombre2=input("Ingrese el segundo nombre:")
if nombre1==nombre2:
    print("Ingreso dos nombre iguales")
else:
    if nombre1>nombre2:
        print(nombre1)
        print("es mayor alfabeticamente")
    else:
        print(nombre2)
        print("es mayor alfabeticamente")
