from datetime import datetime as d
nombre=str(input("Ingrese el nombre "))
if ((d.now().hour>=12)and(d.now().hour<=18)):
    print(f"Buenas tardes, {nombre}")
elif ((d.now().hour>5)and(d.now().hour<12)):
    print(f"Buenos dias, {nombre}")
else:
    print(f"Buenas noches, {nombre}")