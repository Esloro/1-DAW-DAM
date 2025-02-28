sueldos=[]
print("A continuacicon introduce el sueldo de 5 operarios")
for x in range(5):
    numero=int(input("Introduce sueldo del operario: "))
    sueldos.append(numero)
promedio= sum(numero)/5
print(f"El sueldo promedio de los operarios es : {promedio}")