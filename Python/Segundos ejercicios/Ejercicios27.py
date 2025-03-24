#Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
#Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante. 
# Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.

x=int(input("Ingrese la coordenada X "))
y=int(input("Ingrese la coordenada Y "))
cont=0
cont1=0
cont2=0
if(x > 0 and y >0):
    cont=cont+1
    print("Se encuentra en el 1ºCuadrante ");
elif(x < 0 and y >0):
    cont1=con1+1
    print("Se encuentra en el 2ºCuadrante ")
elif(x > 0 and y <0):
    cont2=cont2+1
    print("Se encuentra en el 3ºCuadrante ");
else:
    print("Se encuentra en otro cuadrante distinto")

print(f"En el 1ºCuadrante hay {cont}, en el 2ºCuadrante: {cont1} y en el 3ºCuadrante: {cont2} ")