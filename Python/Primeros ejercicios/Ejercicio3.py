#Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma 
# de los dos primeros y el producto del tercero y el cuarto.

nota1= float (input("Introduce la primera nota "))
nota2= float (input("Introduce la segunda nota "))
nota3= float (input("Introduce la tercera nota "))
nota4= float (input("Introduce la cuarta nota "))

suma = nota1+nota2+nota3+nota4
media = (suma)/4

#Tres formas de mostrar el resultado
print("La media de las notas es: ")
print(media)
print("La media de las notas es: ", media)
print(f"La media de las notas es: {media}")