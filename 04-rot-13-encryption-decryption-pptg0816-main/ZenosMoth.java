public class ZenosMoth {
    double a;
    double b;
    double c;
    int A;
    int B;
    int C;
    double x;
    double y;
    double z;

    public ZenosMoth(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void moveToTheLight(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
        x =(this.A+this.a)/2;
        y=(this.B+this.b)/2;
        z=(this.C+this.c)/2;
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public String getPos(){
        return String.format("<%1.2f,%1.2f,%1.2f>",x,y,z);
    }

    public static void main(String[] args) {
        ZenosMoth moth = new ZenosMoth(0,0,0);
        //step 1
        moth.moveToTheLight(20,20,20);
        System.out.println(moth.getPos());

        //step 2
        System.out.println(moth.a);
        System.out.println(moth.x);
        moth.moveToTheLight(20,20,20);
        System.out.println(moth.getPos());

        System.out.println(moth.a);
        System.out.println(moth.x);
        moth.moveToTheLight(50,50,50);
        System.out.println(moth.getPos());
    }
}
