lista=[10, 4, 8, 200, 580, 5, 4, 1]
count = sum (1 for num in lista if num >100)
print(f"El total de numeros de la lista mayores que 100 es: {count}")
