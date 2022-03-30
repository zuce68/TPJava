package TP3;

public class Point2D {
    protected float x;
    protected float y;

    public Point2D(){
        x=0;
        y=0;
    }

    public String toString(){
        return "("+x+","+y+")" ;
    }

    public float[] Get()
    {
        float[] result = new float[1];
        result[0]=x;
        result[1]=y;
        return result;
    }

    public void Set(float X,float Y){
        x=X;
        y=Y;
    }
}
