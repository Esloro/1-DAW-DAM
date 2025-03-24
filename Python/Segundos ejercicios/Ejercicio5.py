#Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y luego ingrese 
# la longitud de cada perfil; sabiendo que la pieza cuya longitud esté comprendida en el rango de 1.20 y 1.30 son aptas. 
# Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.

piezas = int(input("Ingrese la cantidad de piezas: "))

n=0
cont=0
while n<piezas:
    longitud = float(input("Ingrese la longitud de cada perfil: "))
    n+=1
    if  1.20 <= longitud <= 1.30:
        print("La pieza es apta")
        cont+=1
    else:
        print("La pieza no es apta")
    

print()
print(F"Hay {cont} piezas aptas")      