package TugasPraktikum;
public class Latihan {
    public String MM = "Matematika";
    public String BI = "Bahasa Indonesia";
    public String IPA = "Ilmu Pengetahuan Alam";
    public String IPS = "Ilmu Pengetahuan Sosial";
    public String RPL = "Rekayasa Perangkat Lunak";
    public String PAI = "Pendidikan Agama Islam";
}    
class Jadwal extends Latihan{
    public static void main(String[] args){
        Latihan Mpl = new Latihan();
        System.out.println("Jadwal Ujian Tengah Semester");
        System.out.println("Senin  : "+Mpl.BI+", "+Mpl.MM);
        System.out.println("Selasa : "+Mpl.IPA+", "+Mpl.IPS);
        System.out.println("Rabu   : "+Mpl.RPL+", "+Mpl.PAI);
    }
}    

