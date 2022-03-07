
package logica;

import java.util.Random;

public class GenerarContraseña {
    private int tamaño;
    private String contraseña;
    
    public GenerarContraseña(int tam)
    {
        tamaño=tam;
        contraseña="";
    }
    
    public GenerarContraseña(String clave)
    {
        tamaño = clave.length();
        contraseña = clave;
        
    }
    
    public String generarContra()
    {
        int valor;
        for(int i = 0; i<tamaño; i++)
        {
            Random rnd = new Random();
            valor = rnd.nextInt(4);
            switch(valor)
            {
                case 0:
                    contraseña+=generarLetraMayuscula();
                    break;
                case 1:
                    contraseña+=generarLetraMinuscula();
                    break;
                case 2:
                    contraseña+=generarNumeros();
                    break;
                case 3:
                    contraseña+=generarCaracterEspecial();
                   break;
            }
        }
        return contraseña;
    }
    
    public char generarLetraMayuscula()
    {
        return(char)(int)(Math.random()*26+65);
    }
    
    public char generarLetraMinuscula()
    {
        return(char)(int)(Math.random()*26+97);
    }
    
    public int generarNumeros()
    {
        return (int)(Math.random()*9+0);
    }
    
    public char generarCaracterEspecial()
    {
        char[] caracteresEspeciales = {',', '@', '#', '$', '%', '^', '&', '(', ')', '?','<','>','!'};
        return caracteresEspeciales[(int)(Math.random()*13+0)];
    }
}
