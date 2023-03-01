package house;

public class LivingRoom {
    public static void main(String[] args) {
        // squaremeters
        int squareMeters;
        // pricePerSquareMeter
        double pricePerSquareMeter;
        // adress
        String address;
        //Print out cost of the house (squareMeters + pricePerSquareMeter) at (address)
        squareMeters = 500;
        pricePerSquareMeter = 10.5;
        address = "Hill Street 17";
        System.out.println("The price of the house at " + address + " is: " + squareMeters*pricePerSquareMeter );
    }
}


