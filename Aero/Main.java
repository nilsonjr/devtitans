public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Fokker Dr.I", "Baron");
    
        aviao.imprimaOk();
        aviao.descreve();

        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.desligarMotor();
        aviao.imprimeEstadoMotor();
    }
}