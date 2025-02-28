#Imprimir todos los números impares que hay entre 1 y 100.
for x in range(1,101):
    if x%2!=0:
        print(x, end=("-"))
