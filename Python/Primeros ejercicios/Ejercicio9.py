nota = int(input("Ingrese una nota: "))


if 0<= nota <5:
    print(f"Estas suspenso, tu nota es: {nota} ")
elif 5<= nota <=6:
   print(f"Tienes un bien, tu nota es: {nota} ")
elif 7<= nota <=8:
    print(f"Tienes un notable, tu nota es: {nota} ")
elif 9<= nota <=10:
    print(f"Tienes un sobresaliente, tu nota es: {nota} ")
else:
    print("La nota introducida no es correcta.")