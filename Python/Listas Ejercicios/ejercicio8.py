numeros=[]
numero=int(input("Introduce un numero entero: (0 para finalizar)"))
while numero !=0:
    numeros.append(numero)
    numero=int(input("Introduce un numero entero: "))
    

print(f"El tamaño de la lista es: {len(numeros)}")