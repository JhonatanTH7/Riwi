#Sistema de inventario para una tienda
from funciones_inventario import actualizar_producto,agregar_producto,eliminar_producto,mostrar_inventario


def main():
    inventario = [
        {"nombre": "arroz", "cantidad": 34, "precio":2700},
        {"nombre": "pan", "cantidad": 23, "precio": 700},
    ]
    while True:
        input("Presione enter para continuar...")
        print("\n====== Sistema de inventario ========")
        print("1. Mostrar todos los productos")
        print("2. Agregar producto")
        print("3. Actualizar producto")
        print("4. Eliminar producto")
        print("5. Exportar a excel")
        print("6. Salir")

        opcion = input("Elija una opción: ")

        if(opcion == "1"):
            mostrar_inventario(inventario)
        
        elif(opcion == "2"):
            agregar_producto(inventario)

        elif(opcion == "3"):
            actualizar_producto(inventario)
        
        elif(opcion == "4"):
            eliminar_producto(inventario)

        elif(opcion == "5"):
            #Se los quedo debiendo
            return
        elif(opcion == "6"):
            break


main()











