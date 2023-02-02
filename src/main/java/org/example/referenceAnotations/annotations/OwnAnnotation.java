package org.example.referenceAnotations.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//Especifica el nivel de retención de la anotación (cuándo se puede acceder a ella).
/*      RetentionPolicy.SOURCE — Retenida sólo a nivel de código; ignorada por el compilador.
        RetentionPolicy.CLASS — Retenida en tiempo de compilación, pero ignorada en tiempo de ejcución.
        RetentionPolicy.RUNTIME — Retenida en tiempo de ejecución, sólo se puede acceder a ella en este tiempo.*/

@Target(ElementType.METHOD) //Especifica el tipo de elemento al que se va a asociar la anotación,
//      ElementType.TYPE – se puede aplicar a cualquier elemento de la clase.
/*      ElementType.FIELD – se puede aplicar a un miebro de la clase.
        ElementType.METHOD – se puede aplicar a un método
        ElementType.PARAMETER – se puede aplicar a parámetros de un método.
        ElementType.CONSTRUCTOR – se puede aplicar a constructores
        ElementType.LOCAL_VARIABLE – se puede aplicar a variables locales
        ElementType.ANNOTATION_TYPE – indica que el tipo declarado en sí es un tipo de anotación.*/

@Documented //Hará que la anotación se mencione en el javadoc.

@Inherited /*Indica que la anotación será heredada automáticamente.
En nuestro caso hemos dicho que sea en tiempo de ejecución y que se aplique a métodos.
        También le hemos añadido un valor por defecto con la palabra default*/
public @interface OwnAnnotation {
    String value() default "";
}
