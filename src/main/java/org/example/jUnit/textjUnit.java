package org.example.jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class textjUnit {
    @Test
   public void testSummatory(){
        jUnitProve jUnitProve=new jUnitProve();

        Assertions.assertEquals(10,jUnitProve.summatory(5.0,5.0));
        Assertions.assertNotEquals(10,jUnitProve.summatory(5.0,8.0));
   }
    @Test
   public void textMultiplication(){
        jUnitProve jUnitProve=new jUnitProve();
        Assertions.assertEquals(20,jUnitProve.multiplication(2.0,10.0));
   }
}
