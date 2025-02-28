

import random
numero = random.randint(1, 3)  # número entre 1 y 3 incluidos


if numero == 1:
    print("Has elegido piedra")
elif numero == 2:
    print("Has elegido papel")
elif numero == 3:
    print("Has elegido tijera")
usuario = input ("Elige 1.Piedra 2.Papel 3.Tijera")
print(f"El usuario elige {usuario}")
maquina = numero 

print(f"La máquina eligió {maquina}")
if usuario == maquina:
    print("Empate")
elif (usuario == 1 and maquina ==3) or (usuario == 2 and maquina ==1) or (usuario == 3 and maquina ==2):
    print("Gana el usuario")
else:
    print ("Has perdido, gana la máquina")