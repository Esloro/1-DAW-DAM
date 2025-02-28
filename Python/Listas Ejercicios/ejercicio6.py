personas=["Ana", "Luis", "Maria", "Pedro", "Juan"]
count = sum (1 for char in personas if len(char) >=5)
print(f"El total de numeros de la lista mayores que 100 es: {count}")