"""Solicitar el ingreso de una clave por teclado y almacenarla en una cadena de caracteres. 
Controlar que el string ingresado tenga entre 10 y 20 caracteres para que sea válido,
en caso contrario mostrar un mensaje de error."""

clave=(input("Introduce una clave "))
longitud=len(clave)
print(longitud)

if (10 <= longitud <=20):
    print("La clave es valida")
elif (longitud <10):
    print("La clave es demasiado corta")
else:
    print("La clave es demasiado larga")


       


