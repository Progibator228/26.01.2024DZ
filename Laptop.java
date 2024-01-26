public class Laptop {

    private  String name;
    private int ram;
    private int hhd;
    private  int price;
    private String os;
    private String color;
    private String manufacturercountry;


    public Laptop (String name ,int ram ,int hhd,int price,String os,String color,String manufacturercountry ){
        this.name = name;
        this.ram = ram;
        this.hhd = hhd;
        this.price = price;
        this.os = os;
        this.color = color;
        this.manufacturercountry = manufacturercountry;
    }
    public String getName(){return name;}
    public int getRam (){
        return ram ;
    }
    public int getHhd(){
        return hhd;
    }
    public  int getPrice () {return price;}
    public String getOs(){
        return os;
    }
    public String getColor(){
        return color;
    }
    public String getManufacturerCountry(){
        return manufacturercountry;
    }


    public  void  setName( String name ){this.name = name ;}
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setHhd(int hhd){
        this.hhd = hhd;
    }
    public  void setPrice(int price ){this.price = price;}
    public void setOs(String os){
        this.os = os;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setManufacturerCountry(String manufacturercountry){
        this.manufacturercountry = manufacturercountry;
    }

    @Override
    public String toString() {
        return String.format("Название товара: %s RAM: %d Размер HDD: %d Стоиомсть: %d ОС: %s Цвет: %s Произведенно : %s",name ,ram,hhd,price,os,color,manufacturercountry);
    }

}


