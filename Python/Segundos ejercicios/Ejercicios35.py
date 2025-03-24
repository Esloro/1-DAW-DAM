"""Ingresar un mail por teclado. Verificar si el string ingresado contiene solo un caracter "@"."""

mail=input("Ingrese un mail:")
cantidad=0
x=0
while x<len(mail):
    if mail[x]=="@":
        cantidad=cantidad+1
    x=x+1
if cantidad==1:
    print("Contiene solo un caracter @ el mail ingresado")
else:
    print("Incorrecto")
