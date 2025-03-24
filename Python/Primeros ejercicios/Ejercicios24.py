#Calculo de IMC

estatura=float(input("Ingrese la estatura en m "))
peso=int(input("Ingrese su peso "))
imc=peso/((estatura*estatura))
if(imc < 18.5):
    print(f"Peso Bajo: {imc}")
if(imc >= 18.5 and imc <=24.9):
    print(f"Peso Normal: {imc}")
if(imc >= 25):
    print(f"Sobrepeso: {imc}")