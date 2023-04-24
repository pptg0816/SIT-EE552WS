public class DewPoint {
    public static void main(String[] args) {
        double RH ;
        double T ;
        double h;
        double Tdp;
        for(T = 30; T>=16; T--){
            for(RH = 50; RH<=95; RH = RH+5){
                h = Math.log(RH/100) + (17.62*T)/(243.12+T);
                Tdp = 243.12*h/(17.62 -h);
                System.out.print(Math.round(Tdp));
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}
