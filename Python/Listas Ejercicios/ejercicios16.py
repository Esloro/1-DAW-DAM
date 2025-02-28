nombres=[]
edades=[]

for x in range(5):
    nom=input("Ingrese el nombre de la persona: ")
    nombres.append(nom)
    ed=int(input("Ingrese la edad de dicha persona: "))
    edades.append(ed)
    promedio=edades[x]
print("Nombre de las personas mayores de edad: ")
for x in range(5):
    if edades[x]>=18:
        print(nombres[x])
    

