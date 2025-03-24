"""Se desea saber la temperatura media trimestral de cuatro paises. Para ello se tiene como dato las 
temperaturas medias mensuales de dichos paises. Se debe ingresar el nombre del país y seguidamente las tres 
temperaturas medias mensuales. Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las mismas.
c - Calcular la temperatura media trimestral de cada país.
c - Imprimir los nombres de los paises y las temperaturas medias trimestrales.
b - Imprimir el nombre del pais con la temperatura media trimestral mayor."""

paises=[]
temperaturas=[]

for i in range (4):
    pais=input("Introduce el nombre del pais: ")
    paises.append(pais)
    
    tempPais=[]
    for j in range(3):
        mensual=int(input("Introduce la temperatura media mensual: "))
        tempPais.append(mensual)
    temperaturas.append(tempPais)


tempMedia = []
for i in range(4):
    media = sum(temperaturas[i]) / 3  # Promedio de las tres temperaturas
    tempMedia.append(media)

    
    
print("\nTemperaturas medias mensuales y trimestrales:")
for i in range(4):
    print(f"El pais {pais[i]} tiene un una temperatura media de {tempMedia[i]} ºC")
   
maxTemp = paises[tempMedia.index(max(tempMedia))]
print(f"\nEl país con la temperatura media trimestral mayor es: {maxTemp}")