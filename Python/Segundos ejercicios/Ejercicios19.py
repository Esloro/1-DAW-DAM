#Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron 
# múltiplos de 3 y cuántos de 5. Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5 a la vez.

cont=0
cont2=0
cont3=0

for i in range(10):
    numero =int(input("Ingrese un numeros entero: "))
 
    if numero % 3 ==0:
        cont2= cont2+1   
    if numero % 5 ==0:
        cont3= cont3+1
    if numero % 3 ==0 and numero % 5 ==0:
        cont= cont+1
    
    
        
print()
print(f"Numeros multiplos de 3 y 5 = {cont}")
print(f"Numeros multiplos de 3 = {cont2}")
print(f"Numeros multiplos de 5 = {cont3}")