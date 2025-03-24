#Realizar un programa que pida cargar una fecha cualquiera, luego verificar 
# si dicha fecha corresponde a Navidad.

dia=int(input("Ingrese el día que es hoy en numero:"))
mes=int(input("Ingrese numero de mes:"))

if dia==25 and mes==12:
    print("Corresponde al día de Navidad")
else:
    print(f"La fecha no se correcponde con Navidad{dia, mes}")
