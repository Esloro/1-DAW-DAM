#Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas
contaltura=0
suma=0
while contaltura <10:
    altura =int(input("Ingrese la altura de las personas: "))
    suma+=altura
    contaltura+=1

 
print()
print(f"Altura promedio de las personas {suma/10}")

