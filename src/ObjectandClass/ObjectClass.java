package ObjectandClass;

public class ObjectClass {
    public  static void main(String [] args){
//        Lens lensone =new Lens(
//                brand:"Sonny",
//               focalLength:"85",
//               isPrime:"true"
//                );

    }


    static class  Lens{
        String brand;
        String focalLength;
        boolean isPrime;
        Lens(String brand, String focalLength,   boolean isPrime){
            this.brand = brand;
            this.focalLength=focalLength;
            this.isPrime= isPrime;
        }
    }


}
