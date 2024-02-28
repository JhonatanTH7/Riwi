def mostrar_inventario(inventario):
    if not inventario:
        print("\nEl inventario está vacio\n")
    else:
        print("\nLista de productos\n")
        for index, valor in enumerate(inventario):
            print(index,".-",valor["nombre"],"-",valor["cantidad"],"-",valor["precio"])

def agregar_producto(inventario):
    try:
        nombre = input("Ingrese el nombre del producto: ")
        cantidad = input("Ingrese la cantidad del producto: ")
        precio = input("Ingrese la precio del producto: ")

        producto = { "nombre": nombre.capitalize(), "cantidad": int(cantidad), "precio": float(precio) }
        inventario.append(producto)

        print("Producto agregado exitosamente!!\n")
    except:
        print("Los valores ingresados no son validos")


def actualizar_producto(inventario):
    mostrar_inventario(inventario)

    if not inventario:
        return
    else:
        try:
            indice = int(input("Ingrese el indice del producto a actualizar: "))

            if(indice < 0 or indice > len(inventario)):
                print("El indice ingresado no corresponde con ningun producto.")
            else:
                print("Actualizando el producto -",inventario[indice]["nombre"])
                nombre = input("Ingrese el nuevo nombre del producto: ")
                cantidad = input("Ingrese la nueva cantidad del producto: ")
                precio = input("Ingrese el nuevo precio del producto: ")

                inventario[indice]["nombre"] = nombre
                inventario[indice]["cantidad"] = int(cantidad)
                inventario[indice]["precio"] = float(precio)
                print("\nEl producto fue actualizado correctamente!!\n")
        except:
            print("El valor ingresado debe ser un número.")
    

def eliminar_producto(inventario):
    mostrar_inventario(inventario)

    if not inventario:
        return
    else: 
        try:
            indice = int(input("Ingrese el indice del producto a eliminar: "))
            if(indice <0 or indice > len(inventario)):
                print("El indice no corresponde a ningún producto.")
            else: 
                conformacion = input("Esta seguro que desea eliminar este producto? SI o No: ")
                if(conformacion.lower() == "si"):
                    print("Eliminando el producto",inventario[indice]["nombre"])
                    inventario.pop(indice)
                    print("El producto se eliminó correctamente.\n")
        except:
            print("El indice no es válido.")