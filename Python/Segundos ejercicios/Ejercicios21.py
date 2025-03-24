#Escribe un programa en Python que pida al usuario cuántos valores va a ingresar. Luego, solicita esos 
# valores uno por uno y al final muestra cuántos números negativos se ingresaron.

n=int(input("Cuantos valores vas a ingresar: "))
cont=0
cont2=0

for i in range (n):
    valor=int(input("Introduce el valor "))

    if (valor >=0):
        cont=cont+1
    elif(valor<0):
        cont2=cont2+1


print(f"Se han introducido {cont2} numeros negativos y {cont} numeros positivos")