public class Tokopedia{
    public String namaBarang;
    public String deskripsi;
    public String asalBarang;
    public int hargaBarang;
    public int stockBarang;

    public Tokopedia(){

    }

    public Tokopedia(String nBarang, String des, String aBarang, int hBarang, int sBarang ){
        this.namaBarang = nBarang;
        this.deskripsi = des;
        this.asalBarang = aBarang;
        this.hargaBarang = hBarang;
        this.stockBarang = sBarang;


    }


    public String getnamaBarang(){
        return this.namaBarang;
    }
    public String getdeskripsi(){
        return this.deskripsi;
    }
    public String getasalBarang(){
        return this.asalBarang;
    }
    public Int gethargaBarang(){
        return this.hargaBarang;
    }
    public int getstockBarang(){
       return this.stockBarang; 
    }

}

    




