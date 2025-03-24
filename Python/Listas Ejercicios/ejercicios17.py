#Crear y cargar dos listas con los nombres de 5 productos en una y sus respectivos precios en otra. 
# Definir dos listas paralelas. Mostrar cuantos productos tienen un precio mayor al primer producto ingresado.

nombres=[]
precios=[]

for x in range(5):
    nom=input("Ingrese el nombre de los productos: ")
    nombres.append(nom)
    ed=int(input("Ingrese su precio: "))
    precios.append(ed)
  
print("Nombre de los productos con un precio mayor al primer producto: ")
for x in range(5):
    if precios[x]>precios[0]:
        print(nombres[x])

       