public class ScubaGear {

    /* You must be between 62 and 78 inches tall and weigh less than 220lbs to rent a diving equipment at the resort */


    public static void main(String[] args) {

        int height = 70;
        int weight = 200;

        if ((height >= 62 && height <= 78) && weight <= 220){
            System.out.println("You can rent scuba gear");
    }else {
            System.out.println("You cannot rent scuba gear");
        }



}
    }
