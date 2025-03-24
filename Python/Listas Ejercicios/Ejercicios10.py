"""Cargar por teclado y almacenar en una lista las alturas de 5 personas (valores float)
Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas."""

alturas=[]
cont=0
cont1=0
for i in range (5):
    valor=float(input("Introduce la altura"))
    alturas.append(valor)
promedio= sum(alturas)/5
print(promedio)

for i in range(5):
    if alturas[i] > promedio:
        cont += 1
    elif alturas[i] < promedio:
        cont1 += 1
print(f"Personas mas altas que la media {cont}, personas mas bajas {cont1}")