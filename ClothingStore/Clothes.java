package ClothingStore;
import java.util.Scanner;

public class Clothes {
    private String brand;
    private String size;
    private String color;
    private int many;
    
    public Clothes(String brand, String size, String color, int many) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.many = many;
    }
    public String getBrand() {
        return brand;
    }
    public String getSize(){
        return size;
    }
    public String color(){
        return color;
    }
    public int getMany(){
        return many;
    }
    public void displayinfo(){
        System.out.println("Brand:"+ brand);
        System.out.println("Size"+ size);
        System.out.println("Color"+ color);
        System.out.println("Bought:"+ many);
    }
     class Under extends Clothes {
        private String type;
        private String pantSize;
        private String HasPants;
        public Under(String brand,String size,String color,int many,String type,String pantSize,String HasPants) {
            super(brand,size,color,many);
            this.type = type;
            this.pantSize = pantSize;
            this.HasPants = HasPants;
        }
        public String getType(){
            return type;
        }
        public String getPantSize(){
            return pantSize;
        }
        public String getHasPants(){
            return HasPants;
        }
        @Override
        public void displayinfo(){
            super.displayinfo();
            System.out.println("Brand:"+ type);
            System.out.println("Size:" + pantSize);
            System.out.println("Do you want to add some pants?:" + HasPants);
            
            
        }
        public void main(String[] args){
            Scanner sc = new Scanner(System.in);

         System.out.println("Enter the brand that you want to buy:"+ brand);
            brand = sc.nextLine();
            System.out.println("Enter the size that you want to buy:"+ size);
            size = sc.nextLine();
            System.out.println("Enter the color you prefer to buy:"+ color);
            color = sc.nextLine();
            System.out.println("How many Shirts will you buy?"+ many);
            many = sc.nextInt();
        }
        
     }
}
