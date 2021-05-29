package latihan04;
class A {
    
    private int a;
    public void setA (int nilai)
    {
    a = nilai;    
    }        
    
    public int getA()
    {
    return a;    
    }        
    
    public void tampilkanNilai()
    {
        System.out.println("Nilai a : "+getA());    
    }            
}
class B extends A{
    
    private int b;
    public void setB (int nilai)
    {
    b = nilai;    
    }        
    
    public int getB ()
    {
    return b;    
    }
    
    //melakukan override terhadap method tampilkanNilai ()
    //yang terdapat pada kelas A
    
    public void tampilkanNilai ()
    {
    super.tampilkanNilai (); //memanggil method dalam kelas A
    System.out.println("Nilai b : "+getB());
    }        
}
class DemoOverride2 {
    
    public static void main (String [] args)
    {
        B obj = new B ();
        obj.setA(50);
        obj.setB(150);
        //akan memaggil method yang terdapat pada kelas B
        obj.tampilkanNilai ();
    }        
}

