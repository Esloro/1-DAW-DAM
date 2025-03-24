#Codificar un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000 
# (n se carga por teclado) Este tipo de problemas también se puede resolver empleando la estructura repetitiva for. 
# Lo primero que se hace es cargar una variable que indique la cantidad de valores a ingresar. 
# Dicha variable se carga antes de entrar a la estructura repetitiva for.
cont=0
cont2=0

for i in range(10):
    numero = int(input("Introduce un numero entero: "))
 
    if (numero >=1000):
        cont= cont+1
        
    elif numero <1000:
        cont2= cont2+1
    
        
print()
print(f"Numeros mayores o igual a 1000 = {cont}")
print(f"Numeros inferiores a 1000 = {cont2}")