package e.evera.tpdm_u4_practica_1_edwinponce;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Lienzo extends View {
    Circulo c1,c2,c3,c4,c5,c6,c7,c8;
    Timer timer;
    int width= this.getResources().getDisplayMetrics().widthPixels;
    int height= this.getResources().getDisplayMetrics().heightPixels;
    public Lienzo(final Context context) {
        super(context);
        c1 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c2 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c3 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c4 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c5 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c6 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c7 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);
        c8 = new Circulo(this,(int) (Math.random()*(width))+5,(int) (Math.random()*(height))+5);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                c1.mover(width,height);
                c2.mover(width,height);
                c3.mover(width,height);
                c4.mover(width,height);
                c5.mover(width,height);
                c6.mover(width,height);
                c7.mover(width,height);
                c8.mover(width,height);
            }
        },0,30);

    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        p.setColor(Color.rgb(c1.colorR,c1.colorG,c1.colorB));
        c1.dibujar(c,p);
        p.setColor(Color.rgb(c2.colorR,c2.colorG,c2.colorB));
        c2.dibujar(c,p);
        p.setColor(Color.rgb(c3.colorR,c3.colorG,c3.colorB));
        c3.dibujar(c,p);
        p.setColor(Color.rgb(c4.colorR,c4.colorG,c4.colorB));
        c4.dibujar(c,p);
        p.setColor(Color.rgb(c5.colorR,c5.colorG,c5.colorB));
        c5.dibujar(c,p);
        p.setColor(Color.rgb(c6.colorR,c6.colorG,c6.colorB));
        c6.dibujar(c,p);
        p.setColor(Color.rgb(c7.colorR,c7.colorG,c7.colorB));
        c7.dibujar(c,p);
        p.setColor(Color.rgb(c8.colorR,c8.colorG,c8.colorB));
        c8.dibujar(c,p);
        invalidate();
    }



}