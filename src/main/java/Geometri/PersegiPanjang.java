package Geometri;

public class PersegiPanjang {
double panjang,lebar;

public PersegiPanjang(double panjang, double lebar){
    
    this.panjang = panjang;
    this.lebar = lebar;
}
public double Lkotak(){
    return panjang * lebar;
}
public double Kkotak(){
    return 2 * (panjang + lebar);
}
}
