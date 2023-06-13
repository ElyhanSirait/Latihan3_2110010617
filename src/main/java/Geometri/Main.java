package Geometri;

public class Main {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(6.0);
      
        System.out.println("Lingkaran : ");
        System.out.println("Luas Lingkaran : "+ Lingkaran.luas);
        System.out.println("Keliling Lingkaran : "+Lingkaran.keliling);
        
        PersegiPanjang PersegiPanjang = new PersegiPanjang(8.0,9.0);
        
        System.out.println("Persegi Panjang : ");
        System.out.println("Luas Persegi Panjang : "+ PersegiPanjang.luas);
        System.out.println("Keliling Persegi Panjang : "+PersegiPanjang.keliling); 
    }
        
    }
