#Escribir un programa que solicite por teclado 10 notas de alumnos y nos informe cuántos tienen 
# notas mayores o iguales a 7 y cuántos menores.

cont=0
cont2=0

for i in range(10):
    notas =int(input("Ingrese las notas de los alumnos: "))
 
    if notas >=7:
        cont= cont+1
        
    elif notas <7:
        cont2= cont2+1
    
        
print()
print(f"Alumnos con notas mayores o iguales a 7 = {cont}")
print(f"Alumnos con notas menores a 7 = {cont2}")
