public class app{
    public static void main(String[] args){
        System.out.println("sealamat datang di aplikasi ini");
        Mobil objmobil = new Mobil();
        objmobil.merk = "toyota avanza";
        objmobil.maju();

        Mobil bmw = new Mobil();
        bmw.merk = "bmw 330I";
        bmw.maju();

        Segitiga segitigaA = new Segitiga(); // inisisi object / pembuatan object
        segitigaA.alas = 10;
        segitigaA.tinggi = 15;
        segitigaA.hitungLuas();

        Segitiga segitigaB = new Segitiga();
        segitigaB.alas = 25;
        segitigaB.tinggi = 30;
        segitigaB.hitungLuas();

        }
}

class Mobil{
    String merk;
    int jumlahroda;
    String warna;
    
    public void maju(){
        System.out.println("mobil "+this.merk+" maju. Bremmm!!!!");
    }
}

class Segitiga{
      //atribut / ciri - ciri
      int alas;
      int tinggi;

      //method / perilaku
      public void hitungLuas(){
          double luas = this.alas *this.tinggi/2;
          System.out.println(luas);
      }
}
