import os
class alumno:
    def __init__(self):
        print("soy el constructor")
        self.nombre=""
        self.edad=0
        self.promedio=0.0
    def darexamen(self):
        return print("da examen")
    
def main():
    os.system('cls')
    alumno1=alumno()
    print("alumno")
    alumno1.darexamen()
if __name__ =="__main__":
    main()