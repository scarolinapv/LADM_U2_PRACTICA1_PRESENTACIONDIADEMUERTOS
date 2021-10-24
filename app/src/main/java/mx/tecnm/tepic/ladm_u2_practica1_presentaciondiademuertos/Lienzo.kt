package mx.tecnm.tepic.ladm_u2_practica1_presentaciondiademuertos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.View




class Lienzo (p:MainActivity) : View(p){
    val principal = p
    val lapida = BitmapFactory.decodeResource(principal.resources,R.drawable.lapida)
    val catrina= BitmapFactory.decodeResource(principal.resources,R.drawable.catrina)
    val catrin= BitmapFactory.decodeResource(principal.resources,R.drawable.catrin)
    var posX = 50f
    var posXC = 1500f
    val moverCatrina = object : CountDownTimer(2000,80){
        override fun onTick(p0: Long) {
            posX +=10f

            if(posX==1500f)
                posX =50f
                invalidate()

        }

        override fun onFinish() {
            start()
        }
    }
    val moverCatrin = object: CountDownTimer(2000,80){
        override fun onTick(p0: Long) {
            posXC -=10f
            if(posXC==50f )
                posXC =1500f
            invalidate()
        }

        override fun onFinish() {
            start()
        }

    }

    init {
        moverCatrina.start()
        moverCatrin.start()
    }

    override fun onDraw(c:Canvas) {
        super.onDraw(c)
        val p=Paint()
        c.drawColor(Color.BLACK)
        //luna
        p.color = Color.WHITE
        c.drawCircle(950f,200f,100f,p)
        p.color = Color.BLACK
        c.drawCircle(975f,235f,75f,p)

        //montañas
        p.color = Color.GREEN
        c.drawOval(-200f,500f,290f,2100f,p)
        c.drawOval(-300f,1100f,400f,2100f,p)
        c.drawOval(-400f,-200f,200f,1000f,p)
        p.style = Paint.Style.STROKE
        p.color = Color.BLACK
        p.strokeWidth = 5F
        c.drawOval(-200f,500f,290f,2100f,p)
        //lapidas
        c.drawBitmap(lapida,100f,680f,p)
        c.drawBitmap(lapida,20f,880f,p)
        c.drawBitmap(lapida,50f,1080f,p)
        c.drawBitmap(lapida,60f,1380f,p)
        c.drawBitmap(lapida,140f,1220f,p)
        c.drawBitmap(lapida,10f,1580f,p)
        //arbol1 izquierdo
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(145f,100f,300f,50f,p)
        p.color = Color.GREEN
        c.drawOval(250f,10f,350f,150f,p)
        c.drawOval(310f,10f,410f,150f,p)

        //arbol2 izquierdo
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(100f,200f,250f,250f,p)
        p.color = Color.GREEN
        c.drawOval(200f,150f,280f,300f,p)
        c.drawOval(250f,150f,330f,300f,p)

        //arbol3 izquierdo
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(180f,420f,300f,470f,p)
        p.color = Color.GREEN
        c.drawOval(300f,370f,360f,520f,p)
        c.drawOval(330f,370f,400f,520f,p)

        //arbol4 arbol derecho
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(380f,1700f,550f,1750f,p)
        p.color = Color.GREEN
        c.drawOval(520f,1650f,580f,1800f,p)
        c.drawOval(550f,1650f,620f,1800f,p)

        //arbol5 arbol derecho
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(360f,1400f,500f,1450f,p)
        p.color = Color.GREEN
        c.drawOval(480f,1340f,550f,1500f,p)
        c.drawOval(510f,1340f,580f,1500f,p)

        //arbol6 medio
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(250f,1050f,400f,1100f,p)
        p.color = Color.GREEN
        c.drawOval(370f,1000f,450f,1150f,p)
        c.drawOval(400f,1000f,480f,1150f,p)

        //arbol7 medio
        p.color = Color.rgb(180,114,20)
        p.style = Paint.Style.FILL
        c.drawRect(200f,900f,330f,950f,p)
        p.color = Color.GREEN
        c.drawOval(300f,850f,370f,1000f,p)
        c.drawOval(350f,850f,420f,1000f,p)

        //nuves
        p.color = Color.GRAY
        c.drawCircle(1000f,500f,50f,p)
        c.drawCircle(1005f,550f,50f,p)
        c.drawCircle(1010f,600f,50f,p)

        //nuves
        p.color = Color.GRAY
        c.drawCircle(900f,800f,50f,p)
        c.drawCircle(901f,850f,50f,p)
        c.drawCircle(900f,900f,50f,p)

        //nuves
        p.color = Color.GRAY
        c.drawCircle(1000f,1100f,50f,p)
        c.drawCircle(1005f,1150f,50f,p)
        c.drawCircle(1010f,1200f,50f,p)

        //nuves
        p.color = Color.GRAY
        c.drawCircle(900f,1400f,50f,p)
        c.drawCircle(901f,1450f,50f,p)
        c.drawCircle(900f,1500f,50f,p)

        //estrellitas
        p.color = Color.YELLOW
        c.drawCircle(1000f,400f,5f,p)
        c.drawCircle(1000f,200f,5f,p)
        c.drawCircle(900f,100f,5f,p)
        c.drawCircle(700f,400f,5f,p)
        c.drawCircle(550f,50f,5f,p)
        c.drawCircle(601f,550f,5f,p)
        c.drawCircle(900f,700f,5f,p)
        c.drawCircle(700f,900f,5f,p)
        c.drawCircle(930f,1100f,5f,p)
        c.drawCircle(650f,1200f,5f,p)
        c.drawCircle(730f,1450f,5f,p)
        c.drawCircle(1000f,1700f,5f,p)

        //catrina
        c.drawBitmap(catrina,10f,posX,p)
        c.drawBitmap(catrin,160f,posXC,p)
    }
}