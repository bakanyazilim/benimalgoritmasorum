package algoritmavize;
import java.time.Year;
import java.util.Scanner;

public class Algoritmavize {
   

    
    public static void main(String[] args) {    
          otomobil oto= new otomobil(1995,5.0,"Renk",10,130);
          System.out.println(oto.yasBul());
    }
    
}
     class otomobil {  
        public int uretimYıl;
        private double uretimNo;   
        public String renk;         
        public double agirlik;
        public double guc;
        public int fiyat;
    public otomobil(int uretimYıl, double uretimNo,String renk,double agirlik,double guc){
        this.agirlik=agirlik;
        this.uretimYıl=uretimYıl;
        this.renk=renk;
        this.guc=guc;
        this.uretimNo=uretimNo;
  }
        public void ozellikGoster(){
           
            System.out.println("Üretim No:"+uretimNo);
            System.out.println("Renk:"+ renk);
            System.out.println("Agırlık:"+agirlik);
            System.out.println("Güç="+guc);
        }
         class model1 extends otomobil{
           public int uretimYıl;
           private double uretimNo;  
           public String renk; 
           public double agirlik;
           public double guc;
           

            public model1(int uretimYıl, double uretimNo, String renk, double agirlik, double guc) {
                super(uretimYıl, uretimNo, renk, agirlik, guc);
            }
          
         
           public void ozellikYaz(){
            System.out.println("Üretim No:"+uretimNo);
            System.out.println("Renk:"+ renk);
            System.out.println("Agırlık:"+agirlik);
            System.out.println("Güç="+guc);
           }
                 
        }
         class model2 extends otomobil{
           public int uretimYıl;
           private double uretimNo;  
           public String renk; 
           public double agirlik;
           public double guc;

            public model2(int uretimYıl, double uretimNo, String renk, double agirlik, double guc) {
                super(uretimYıl, uretimNo, renk, agirlik, guc);
            }
          }
         public int yasBul(){
             return Year.now().getValue()-uretimYıl;
         }
         public int getYil(){
             return uretimYıl;
         }
         public int setYil(int uretimYıl){
             
          return  this.uretimYıl=uretimYıl;
      }
         public int genelFiyat(){
                return (int)(yasBul()*0.5);  
        }
         public int maxHız(){
             return (int)(guc*1.5);
         }
    }
