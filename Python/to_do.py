
#SW crear lista con las tareas diarias, se debe poder consultar agregar eliminar y actualizar
#Fecha(mes,dia)-nombre de la actividad-estado(pendiente,finalizado)-prioridad(escala de valor 0 a 5)
lista_tareas=[{'actividad':"Trabajo habilidades para la vida",'fecha':"10/10",'estado':"Pendiente",'prioridad':"3"}]

def mostrar_lista(lista):
    print("")
    if not lista:
        print("La lista esta vacia")
    else:
        print("==== Lista de actividades ===")
        print("")
        for indice, valor in enumerate(lista):
            print(f"{indice} - {valor}")
        print("")

def agregar_actividad(lista):
    if not lista:
        print("La lista esta vacia")
    else:
        actividad=str(input("Ingrese el nombre de la actividad: "))
        fecha=str(input("Ingrese la fecha de la actividad Formato(DD/MM): "))
        estado=str(input("Ingrese el estado de la actividad: "))
        prioridad=str(input("Ingrese el numero correspondiente a la prioridad de la actividad   1.Baja  2.Intermedia  3.Alta: "))
        
        tarea={'actividad':actividad,'fecha':fecha, 'estado':estado, 'prioridad':prioridad}
        lista_tareas.append(tarea)
        print("")
        print(f"La actividad{actividad} se guardo exitosamente")

def eliminar(lista):
    mostrar_lista(lista)
    if not lista:
        print("La lista esta vacia")
    else:
        try:
            print("")
            indice=int(input("Ingrese el indice de la actividad a eliminar: "))
            print("")
            if indice<0 or indice>len(lista):
                print("El indice ingresado no es valido")
            else:
                lista_tareas.pop(indice)
                print("La actividad fue eliminada exitosamente ")

        except:
            print("El valor ingresado no es valido")

def actualizar(lista):
        mostrar_lista(lista)
        indice=int(input("Ingrese el indice de la actividad a modificar: "))
        print("")
        if indice<0 or indice>len(lista):
            print("El indice ingresado no es valido")
        else:
            actividad=str(input("Ingrese el nombre de la actividad: "))
            fecha=str(input("Ingrese la fecha de la actividad Formato(DD/MM): "))
            estado=str(input("Ingrese el estado de la actividad: "))
            prioridad=str(input("Ingrese el numero correspondiente a la prioridad de la actividad   1.Baja  2.Intermedia  3.Alta: "))
            lista[indice]["actividad"] = actividad
            lista[indice]["fecha"] = fecha
            lista[indice]["estado"] = estado
            lista[indice]["prioridad"] = prioridad
            print("")
            print("La actividad se modifico satisfactoriamente")

def main():

    while True:
        print("")
        input("Presione enter para mostrar el menu...")
        print("")
        print("=============================")
        print("======== Lista to do ========")
        print("=============================")
        print("")
        print("  1. Lista de actividades")
        print("  2. Agregar actividad")
        print("  3. Eliminar actividad")
        print("  4. Actualizar actividad")
        print("  5. Salir")
        print("")

        opcion=input("Ingrese la operación que desea realizar: ")
        if opcion=="1":
            mostrar_lista(lista_tareas)
        elif opcion=="2":
            agregar_actividad(lista_tareas)
        elif opcion=="3":
            eliminar(lista_tareas)
        elif opcion=="4":
            actualizar(lista_tareas)
        elif opcion=="5":
            break
        else:
            print("La opción ingresada no es valida, ingresela nuevamente")

main()

