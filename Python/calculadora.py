try:
    opcion = ""
    resultado_actual = 0
    def mostrarMenu():
        print()
        print("=======================================")
        print("======== Menú de opciones =============")
        print("=======================================")
        print("1.sumar")
        print("2.restar")
        print("3.multiplicar")
        print("4.dividir")
        print("5.salir")
        print()

    def sumar(lista):
        total = 0
        numeros_sumados = ""
        for indice in lista:
            total += indice
            numeros_sumados +=  str(indice) + "+"
        print("La suma de", numeros_sumados[0:len(numeros_sumados)-1]," es: ",total)

    def restar(lista):
        total = lista[0]
        numeros_restados = ""
        for indice in lista[1:]:
            total =  total - indice
            numeros_restados +=  str(indice) + "-"
        print("La resta de",lista[0],"-", numeros_restados[0:len(numeros_restados)-1]," es: ",total)

    def multiplicar(lista):
        total=1
        numeros_multiplicados=""
        for indice in lista:
            total=total*indice
            numeros_multiplicados+=str(indice)+"*"
        print("La multiplicaciòn de",numeros_multiplicados[0:len(numeros_multiplicados)-1],"es: ",total)

    def dividir(lista):
        total=lista[0]
        numeros_divididos=""
        for indice in lista[1::]:
            total=total/indice
            numeros_divididos+=str(indice)+"/"
        print("La división de",numeros_divididos[0:len(numeros_divididos)-1],"es: ",total)

    flag = True
    flag2 = True
    flag3 = True
    flag4 = True
    flag5 = True

    while flag:
        mostrarMenu()
        opcion = input("Ingrese una opción: ")
        print()
        if(opcion ==  "1"):
            lista_numeros = []
            while flag2:
                nuevo_numero = int(input("Ingrese el número a sumar: "))
                lista_numeros.append(nuevo_numero)
                seguir = input("Desea continuar? SI o NO: ")
                if(seguir.lower() == "no"):
                    flag2 = False
                    sumar(lista_numeros)
        if(opcion == "2"):
            lista_numeros = []
            while flag3:
                nuevo_numero = int(input("Ingrese el número a restar: "))
                lista_numeros.append(nuevo_numero)
                seguir = input("Desea continuar? SI o NO: ")
                if(seguir.lower() == "no"):
                    flag3 = False
                    restar(lista_numeros)
        if(opcion == "3"):
            lista_numeros = []
            while flag4:
                nuevo_numero = int(input("Ingrese el número a multiplicar: "))
                lista_numeros.append(nuevo_numero)
                seguir = input("Desea continuar? SI o NO: ")
                if(seguir.lower() == "no"):
                    flag4 = False
                    multiplicar(lista_numeros)
        if(opcion == "4"):
            lista_numeros = []
            while flag5:
                nuevo_numero=0
                while nuevo_numero==0:
                    nuevo_numero = int(input("Ingrese el número a dividir: "))
                    if(nuevo_numero==0):
                        print("División por cero no admitida, ingrese un numero distinto de cero")
                lista_numeros.append(nuevo_numero)
                seguir = input("Desea continuar? SI o NO: ")
                if(seguir.lower() == "no"):
                    flag5 = False
                    dividir(lista_numeros)
        if(opcion ==  "5"):
            flag = False
except:
    print("El numero ingresado NO es valido")