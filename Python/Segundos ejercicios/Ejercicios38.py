"""Ingresar una oración que pueden tener letras tanto en mayúsculas como minúsculas. 
Contar la cantidad de vocales. Crear un segundo string con toda la oración en minúsculas para 
que sea más fácil disponer la condición que verifica que es una vocal."""

oracion=(input("Introduce una oracion "))
minusculas=oracion.lower()
print(minusculas)
cantidad=0
for caracter in minusculas:
    if caracter == "a" or caracter == "e" or caracter== "i" or caracter == "o" or caracter== "u" :
        cantidad += 1


print(f"Contiene {cantidad} vocales")        


