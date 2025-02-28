edad=int(input("Ingrese su edad: "))


if 0<= edad <=10:
    print(f"Es un niño, tiene  {edad} años")
elif 11<= edad <=18:
   print(f"Eres adolescente, tienes  {edad} años ")
elif 19<= edad <=65:
    print(f"Eres joven, tienes {edad} años")
elif 66<= edad <100:
    print(f"Perteneces a la tercera edad, tienes  {edad} años")
elif edad <=100:
    print(f"Enhorabuena eres centenario, tienes {edad} años")
else: 
    print("El numero introducido no es correcto")