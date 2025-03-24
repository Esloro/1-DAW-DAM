#En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea 
# los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos 
# cobran más de $300. Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.

empleados = int (input("Introduce el numero de empleados de la empresa "))
print(empleados)

cont=0
cont1=0
cont2=0
suma=0
while cont < empleados:
    sueldo = int (input("Introduce el sueldo del empleado "))
    suma+= sueldo
    cont+=1
    if 100 <= sueldo <=300:
       cont1+=1
    elif sueldo >300:
        cont2+=1

print()
print(f"El total que gasta la empresa en sueldos es {suma}$")
print(f"El numero de empleados que ganan mas de 300$ es {cont2}")
print(f"El numero de empleados que ganan entre 100$ y 300$ es {cont1}")