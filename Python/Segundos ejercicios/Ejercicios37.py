"""Cargar una oración por teclado. Mostrar luego cuantos espacios en blanco se ingresaron. 
Tener en cuenta que un espacio en blanco es igual a " ", en cambio una cadena vacía es ""  """

oracion=(input("Introduce una oracion "))
cantidad=0
for caracter in oracion:
    if caracter == " ":
        cantidad += 1

print(f"Contiene {cantidad} espacios en blanco")        

