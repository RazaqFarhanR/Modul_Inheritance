package latihan02;
public class Person {
    
    private String nama;
    private int usia;
    
    //konstruktor
    public Person (String nama, int usia)
    {
        this.nama = nama;
        this.usia = usia;
    }        
    //Metode
        public void info ()
        {
        System.out.println("Nama:"+this.nama);
        System.out.println("Usia:"+this.usia);
        }
}

class Employ extends Person
{
    private String noKaryawan;
    // Konstruktor
    public Employ (String noKaryawan, String nama,int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    // Metode
    public void info ()
    {
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }    
}//Akhir kelas Employ
