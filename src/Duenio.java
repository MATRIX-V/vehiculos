public class Duenio {
    String genero="";
    int edad=0;
    int cedula=0;
    String nombre="";
    double peso=0;
    String tiposangre="";

    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println(my);
        }else{
            my="Es menor de edad";
            System.out.println(my);
        }


    }

}
