#Realizar un programa que lea los lados de n triángulos, e informar:
#a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), 
# o escaleno (ningún lado igual)
#b) Cantidad de triángulos de cada tipo.
n=int(input("Cuantos triangulos vas a introducir"))
cont=0
cont1=0
cont2=0

for i in range(n):
    lado =float(input("Introduce el lado 1 del triangulo: "))
    lado2 =float(input("Introduce el lado 2 del triangulo: "))
    lado3 =float(input("Introduce el lado 3 del triangulo: "))

        
    if(lado==lado2 and lado2==lado3):
            cont=cont+1
            print("El triangulo es equilatero")
    elif(lado==lado2 or lado2==lado3 or lado==lado3):
            cont1=cont1+1
            print("El triangulo es isosceles")
    elif(lado!=lado2 and lado2!=lado3 and lado!=lado3):
            cont2=cont2+1
            print("El triangulo es escaleno")

print(f"Hay {cont} triangulos equilateros, {cont1} triangulos isosceles y {cont2} triangulos escalenos")