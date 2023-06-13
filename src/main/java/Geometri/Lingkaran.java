
package Geometri;

public class Lingkaran {
 
    double radius,phi;
    
   
public Lingkaran(double radius){
    
    this.radius = radius;
    this.phi = 3.14;
}

public double luas(){
    return phi * radius * radius;
}
public double keliling(){
    return 2 * 3.14 * radius;
}

}


