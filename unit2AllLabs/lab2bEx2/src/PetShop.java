import java.time.LocalDate;
import java.util.*;

public class PetShop {
    private Scanner scanner = new Scanner(System.in);

    private double totalIncomeOfAllSales;
    private int totalAnimalSold;

    private int totalCatsSold;
    private int totalDogsSold;
    private int totalBirdsSold;

    private int catsInStoke;
    private int dogsInStoke;
    private int birdsInStoke;

    public Animal customerAnimalRequest;

    private  ArrayList<Animal> animalsInStore = new ArrayList<>();
    private  ArrayList<Animal> animalsSold = new ArrayList<>();

    public void showAnimalsInStore(){

        if (animalsInStore.isEmpty()) {
            System.out.println("unfortunately, we are out of stock, please try again after a few days.");
            return;
        }

        System.out.println("Animals available in Store as following: ");

        for (Animal animal : animalsInStore) {
            System.out.println(animal.toString());
            System.out.println("-".repeat(20));
        }
    }

    public void AddAnimals(Animal animal){

        if (animal instanceof Dog || animal instanceof Bird || animal instanceof Cat ) {
            if (animal instanceof Dog) {
                dogsInStoke++;
            } else if (animal instanceof Bird){
                birdsInStoke++;
            } else {
                catsInStoke++;
            }
            animalsInStore.add(animal);
        } else {
            System.out.println("error: Not Supported Animal, we only sell dog/cat/birds.");
        }
    }


    public void EnterTheShop() {
        System.out.println("\t\t\tWelcome to our petShop, where you find your beautiful pets as requested!");
        System.out.println("\t\t\tPlease let us know your pet request, and we gladly will provide it to you");

        String petType;
        String petGender;
        int petAge = 0;
        String petColor;
        double petPrice = 0;

        boolean customerInStore = true;

        while (customerInStore) {

            do {
                System.out.println("what pet type you would like to have? please insert (cat, dog or bird)");
                petType = scanner.next().toLowerCase();
                if (petType.length() < 3) {
                    System.out.println("error: please insert (cat, dog or bird) - length cannot be less than 3"); // just to satisfy the lab requirements
                }
                else if (!petType.equals("cat") && !petType.equals("dog") && !petType.equals("bird")) {
                    System.out.println("error: please insert (cat, dog or bird)");
                }
            } while (!petType.equals("cat") && !petType.equals("dog") && !petType.equals("bird"));

            do {
                System.out.println("what pet gender you would like to have? please insert (male or female/ m or f) ");
                petGender = scanner.next().toLowerCase();
                if (petGender.equals("m")) {
                    petGender = "male";
                } else if (petGender.equals("f")){
                    petGender = "female";
                }
                if (!petGender.equals("male") && !petGender.equals("female")) {
                    System.out.println("error: please insert (male or female/ m or f) ");
                }
            } while (!petGender.equals("male") && !petGender.equals("female"));

            do {

                System.out.println("what pet age in month you would like to have? please insert (age between 1 month to 24 months) ");

                try {
                    petAge = scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("error: invalid entry, you must insert a number");
                }

                if (petAge < 1 || petAge > 24) {
                    petAge = 0;
                    System.out.println("error: please insert (age between 1 month to 24 months)");
                }

            } while (petAge == 0);

            do {
                System.out.println("what pet color you would like to have? please insert (black or white) ");
                petColor = scanner.next().toLowerCase();
                if (!petColor.equals("black") && !petColor.equals("white")) {
                    petColor = "";
                    System.out.println("errors: please insert (black or white)");
                }
            } while (petColor.isEmpty());

            do {
                System.out.println("How much your budget? please insert a (price cannot be less than 100BD) ");

                try {
                    petPrice = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("error: input must be a number");
                    scanner.next();
                }

                if (petPrice < 100) {
                    System.out.println("pet price cannot be less than 100BHD");
                }

            } while (petPrice < 100);

            Animal animalBuff;

            if (petType.equals("cat")) {
                Cat newCat = new Cat("newCatRequested", petGender, petAge, petColor, petPrice);
                AddAnimals(newCat);
                animalBuff = newCat;
            } else if (petType.equals("dog")) {
                Dog newDog = new Dog("newDogRequested", petGender, petAge, petColor, petPrice);
                AddAnimals(newDog);
                animalBuff = newDog;
            } else {
                Bird newBird = new Bird("newBirdRequested", petGender, petAge, petColor, petPrice);
                AddAnimals(newBird);
                animalBuff = newBird;
            }

            System.out.println("\nGuess What!!! we got exactly what you want!\n");
            System.out.println(animalBuff.toString() + "\n");

            System.out.println("We will deduct from your account pet price: " + animalBuff.getPrice() + "BHD");
            buyAnimal(animalBuff);
            System.out.println("You will receive your pit within 3 working days.");

            System.out.println("-".repeat(20));

            do {
                System.out.println("\nWould you like to have another pit? (yes/no) or (y/n)");
                String morePits = scanner.next().toLowerCase();

                if (morePits.equals("no") ||  morePits.equals("n")) {
                    customerInStore = false;
                    System.out.println("Thank you for choosing us, have a great day!");
                    break;
                } else if (morePits.equals("yes") || morePits.equals("y")) {
                    break;
                } else {
                    System.out.println("error: unknown option");
                }
            } while (true);

        }

    }


    public void buyAnimal(Animal animal) {
        animalsInStore.remove(animal);
        animalsSold.add(animal);
        if (animal instanceof Dog) {
            dogsInStoke--;
            totalDogsSold++;
        } else if (animal instanceof Bird){
            birdsInStoke--;
            totalBirdsSold++;
        } else {
            catsInStoke--;
            totalCatsSold++;
        }
        totalAnimalSold++;
        totalIncomeOfAllSales += animal.getPrice();
    }

    public void showShopReport(){
        System.out.println("\t\t\t HERE'S THE REPORT OF OUR SHOP, DATE: " + LocalDate.now());

        System.out.println("\t\t\t\t\t  total Income Of All Sales ".toUpperCase() + totalIncomeOfAllSales + " BHD");

        double avgSales = getAveragePriceOfSales();

        System.out.println("\t\t\t\t\t  average price Of All Sales ".toUpperCase() + avgSales + " BHD");

        System.out.println("\t\t\t\t\t  total Animal Sold ".toUpperCase() + totalAnimalSold);

        System.out.println("\t\t\t\t\t  total Cats Sold ".toUpperCase() + totalCatsSold);
        System.out.println("\t\t\t\t\t  total Dogs Sold ".toUpperCase() + totalDogsSold);
        System.out.println("\t\t\t\t\t  total Birds Sold ".toUpperCase() + totalBirdsSold);

        System.out.println("\t\t\t\t\t  cats In Stoke ".toUpperCase() + catsInStoke);
        System.out.println("\t\t\t\t\t  dogs In Stoke ".toUpperCase() + dogsInStoke);
        System.out.println("\t\t\t\t\t  birds In Stoke ".toUpperCase() + birdsInStoke);

        System.out.println("-".repeat(20));
    }

    private double getAveragePriceOfSales() {
        if (animalsSold.isEmpty()) {return 0;}
        double total = 0;
        for (Animal ani: animalsSold) {
            total += ani.getPrice();
        }
        return total / animalsSold.size();
    }


}
