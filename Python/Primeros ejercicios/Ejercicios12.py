#Se pide el suelo del empleado y su antiguedad y se clasificacn en funcion de si el sueldo es > o < de 500
sueldo = int(input("Ingrese el sueldo del empleado "))
antiguedad = int(input("Ingrese su antiguedad en años "))
if sueldo < 500 and antiguedad >10:
    aumento=sueldo*0.20
    sueldoTotal= sueldo + aumento
    print(f"El sueldo a pagar es: {sueldoTotal}")
    
else: 
    if sueldo < 500:
        aumento = sueldo *0.50
        sueldoTotal = sueldo + aumento
        print(f"El sueldo a pagar es: {sueldoTotal}")
    else:
        print("Sueldo a pagar: ", sueldo)
              
              