package mx.edu.ittepic.www.u3e7_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo1 extends View {
    Main2Activity puntero;
    Image fondo, estado;
    Nave base;
    public Lienzo1(Context context){
        super(context);
        puntero = (Main2Activity) context;
        fondo = new Image(R.drawable.fondo,720,1280,0,0,true,null,this);
        estado = new Image(R.drawable.estado, 454,28,40,40,true,null,this);
        base = new Nave(R.drawable.baseshipa,150,150,285,900,true,this);
    }

    @Override
    public void onDraw(Canvas c){
        Paint p = new Paint();
        puntero.musicaf();
        fondo.pintar(c,p);
        estado.pintar(c,p);
        base.pintar(c,p);
    }
    public boolean onTouchEvent(MotionEvent e){
        float px=e.getX();
        float py=e.getY();

        switch (e.getAction()){
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_DOWN:
                if (base.enArea( px,py )){
                    base.moverX(px);
                }
        }
        invalidate();
        return true;
    }
}
