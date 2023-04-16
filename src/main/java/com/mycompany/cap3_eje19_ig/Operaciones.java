
package com.mycompany.cap3_eje19_ig;

public class Operaciones {
    public Operaciones(){
    }
    public float setPerimetro(float lado){
        return 3*lado;
    }
    public float setAltura(float lado){
        return (float) ((lado*Math.sqrt(3))/2);
    }
    public float setArea(float lado){
        return (float) ((Math.pow(lado,2)*Math.sqrt(3))/4);
    }
}
