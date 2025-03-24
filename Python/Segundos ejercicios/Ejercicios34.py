"""Solicitar la carga del nombre de una persona en minúsculas. Mostrar un mensaje si comienza con 
vocal dicho nombre."""

nombre=input("Ingrese su nombre:")
if nombre[0]=="a" or nombre[0]=="e" or nombre[0]=="i" or nombre[0]=="o" or nombre[0]=="u":
    print("El nombre ingresado comienza con vocal")
else:
    print("El nombre ingresado no comienza con vocal")
