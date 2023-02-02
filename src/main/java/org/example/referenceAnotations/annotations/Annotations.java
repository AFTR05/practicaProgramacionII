package org.example.referenceAnotations.annotations;

import javax.security.auth.login.AccountNotFoundException;
import java.lang.annotation.Annotation;

public class Annotations implements interfaceAnnotations{

    public static void main(String[] args) {
        Annotations annotations=new Annotations();
        annotations.proveOwnAnnotation();
    }

    @Override
    public void proveOverwrite() {
        System.out.println("Se sobreescribe funcion de interface");
    }
    @Deprecated
    public void proveDeprecated(){ //Una anotación de este tipo indica que un método, atributo, clase etc. está obsoleto y no se recomienda su uso.
        System.out.println("anotacion Deprecated");
    }

    @SuppressWarnings("Deprecation") //Evita que el entorno de desarrollo y compilador muestren advertencias sobre nuestro código:
    public void proveSupressWarning(Annotations annotations){
        annotations.proveDeprecated();
    }
    @OwnAnnotation("Anotacion")
    public void proveOwnAnnotation(){
        System.out.println("Propia anotacion");
    }
}
