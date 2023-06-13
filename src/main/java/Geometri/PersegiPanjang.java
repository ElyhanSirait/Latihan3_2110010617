package Geometri;

public class PersegiPanjang {

    static String luas;
    static String keliling;
    
    double panjang,lebar;
     
    
    
    public PersegiPanjang(double panjang,double lebar){
     this.panjang = panjang;
     this.lebar = lebar;
 }
 
 public double luas(){
     return panjang * lebar;
 }
 
 public double keliling(){
     return 2*(panjang + lebar);
 }
    
}
