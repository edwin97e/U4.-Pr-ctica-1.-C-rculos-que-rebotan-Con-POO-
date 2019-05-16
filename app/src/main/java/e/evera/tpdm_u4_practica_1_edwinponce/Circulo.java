package e.evera.tpdm_u4_practica_1_edwinponce;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circulo {
    int x,y,colorR,colorG,colorB,tamano,desplazamientoX,desplazamientoY;

    public Circulo(Lienzo lienzo,int posx, int posy) {
        x = posx;
        y = posy;
        tamano = (int) (Math.random()*300)+20;//Crea el tamaño del circulo
        colorR = (int) (Math.random()*255)+1;//Crea el tamaño del circulo
        colorG = (int) (Math.random()*255)+1;//Crea el tamaño del circulo
        colorB = (int) (Math.random()*255)+1;//Crea el tamaño del circulo
        if(Math.random()*10<5){//asigna un desplazamineto random si es mañor, es hacia la derecha
            desplazamientoX=10;
        }else{
            desplazamientoX=-10;//izquierda
        }
        if(Math.random()*10<5){//arriba
            desplazamientoY=10;
        }else{
            desplazamientoY=-10;//abajo
        }
    }

    public void mover(int ancho,int alto){
        if(x<=0) desplazamientoX=10;
        if(y<=0) desplazamientoY=10;
        if(x>=ancho) desplazamientoX=(desplazamientoX*-1);
        if(y>=alto) desplazamientoY=(desplazamientoY*-1);
        x+=desplazamientoX;
        y+=desplazamientoY;
    }

    public void dibujar(Canvas c, Paint p) {
        c.drawCircle(x,y,tamano,p);
    }

}

