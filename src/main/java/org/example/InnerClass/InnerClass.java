package org.example.InnerClass;

public class InnerClass {
    private String secretMessage;
    public class InternalInnerClass{
        public InternalInnerClass(String message){
          secretMessage = message;
        }
        public void seeSecretMessage(){
            System.out.println("El mensaje secreto es : "+secretMessage);
        }
    }
}
