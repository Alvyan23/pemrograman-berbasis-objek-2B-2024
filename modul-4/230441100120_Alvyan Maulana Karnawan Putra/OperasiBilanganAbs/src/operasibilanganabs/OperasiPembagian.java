/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operasibilanganabs;

/**
 *
 * @author TOSHIBA
 */
public class OperasiPembagian extends OperasiBilanganAbs{
    @Override
    protected void set_A(double a){
        this.a=a;
    }
    @Override
    protected void set_B(double b){
        this.b=b;
    }
    @Override
    protected void set_C(double c){
        this.c = this.a / this.b;    
    }
    @Override
    protected double get_A(){
        return this.a;
    }
    @Override
    protected double get_B(){
        return this.b;
    }
    @Override
    protected double get_C(){
        return this.c;
    }
    @Override
    protected void tampil(){
        System.out.println(" Hasil Pembagian " +this.a + " : " + this.b + " adalah " +this.c);
    }
    
}
