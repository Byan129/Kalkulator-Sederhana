import java.util.Scanner;
class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Kalkulator-----");
        System.out.println("List Operasi Matematika");
        System.out.println("Penjumlahan : 1");
        System.out.println("Pengurangan : 2");
        System.out.println("Perkalian : 3");
        System.out.println("Pembagian : 4");
        System.out.println("Modulus : 5");
        System.out.println("Semua Operasi : 6");
        System.out.println("--------------------");
    //Input
        System.out.print("Bilangan Pertama : ");
        int bilanganPertama = input.nextInt();
        System.out.print("Bilangan Kedua : ");
        int bilanganKedua = input.nextInt();
    //Operasi
        int hasilJumlah = bilanganPertama+bilanganKedua,
            hasilKurang = bilanganPertama-bilanganKedua,
            hasilKali = bilanganPertama*bilanganKedua,
            hasilMod = bilanganPertama%bilanganKedua;
        float hasilBagi = (float)bilanganPertama/bilanganKedua;
    //Output
        System.out.print("Pilih Operasi : ");
        int pilihOperasi = input.nextInt();
        System.out.println("========Hasil========");
        switch (pilihOperasi) {
            case 1 :System.out.println("Penjumlahan : "+hasilJumlah); break;
            case 2 :System.out.println("Pengurangan : "+hasilKurang); break;
            case 3 :System.out.println("Perkalian : "+hasilKali); break;
            case 4 :if(bilanganKedua!=0) {
                        System.out.println("Pembagian : "+hasilBagi);
                    }
                    else {
                        System.out.println("Pembagian : Tidak Terdefinisi");
                    } break;
            case 5 :System.out.println("Modulus : "+hasilMod); break;
            case 6 :System.out.println("Penjumlahan : "+hasilJumlah);
                    System.out.println("Pengurangan : "+hasilKurang);
                    System.out.println("Perkalian : "+hasilKali);
                    if(bilanganKedua!=0) {
                        System.out.println("Pembagian : "+hasilBagi);
                    }
                    else {
                        System.out.println("Pembagian : Tidak Terdefinisi");
                    }
                    System.out.println("Modulus : "+hasilMod); break;
            default: System.out.println("Baca list Operasi!!!, Silahkan coba lagi");
        }
    }
}