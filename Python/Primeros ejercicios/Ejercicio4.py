horas = float (input("Introduce el numero de horas trabjadas "))
precio = float (input("Introduce el precio de cada hora "))
totalBruto = horas*precio
irpf= totalBruto*(0.15)
totalNeto=totalBruto-irpf

print(f"El sueldo mensual según las horas trabajadas es: {totalBruto}")
print(f"El IRPF del 15%: {irpf}")
print(f"El total neto con un IRPF del 15% es: {totalNeto}")