#Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar 
# del mismo (los primeros 12 términos) Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, 
# hasta el 36.

x= 1

i= int(input("Introduce un valor del 1 al 10: "))
print (f"tabla de multilpicar (12 primeros numeros) del numero {i}")
while x<=12:
    print(i," x ",x, "=", x*i)
    x=x+1