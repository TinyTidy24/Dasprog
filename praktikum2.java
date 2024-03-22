package dasprog;

public class praktikum2 {

    public static void main(String[] args) {
        // Do not change
        
        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        //task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        task2("Wanda");
        task3();
        task4("5,8,9,11,10");
    }
    
    public static String task1(String data){
        // Your code here
        // ...
        
        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String firstName = name.substring(name.indexOf(" ")+1, slashPosition);
        String lastName = name.substring(0, name.indexOf(" "));
        //get the first character of first and last name
        String initial = ""+ firstName.charAt(0) + lastName.charAt(0); 

        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6);
        //count the age 
        int age = 2024 - (Integer.parseInt(birthYear));
        
        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the place of birth
        String birthPlace = data.substring(0, slashPosition);
        
        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition, slashPosition);
        //change M to Male and F to Female
        sex= sex.replace("M", "Male");
        sex= sex.replace("F", "Female");
        
        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition, slashPosition);
        
        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition, slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.equals("WNI");
        //change true or false to Yes or No
        String isLocalCitizen ="" + isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true", "Yes");
        isLocalCitizen = isLocalCitizen.replace("false", "No");
        
        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition + 1);
        //chop the marital status data
        String maritalStatus = data.substring(startPosition);
        
        //generating the output
        String line1 = "Full Name: " + firstName + " "+ lastName+ " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;
        
        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7;
        
        //print out the output
        System.out.println(output);
  
        return output; 
    }
    public static String task2(String name){
        // Your code here
        // ...
        
        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        //change the input to lowercase, since tha alphabets are all in lowercase
        String input = name.toLowerCase();
        
        //set the key
        
        int key = 5;
        
        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = ""+alphabet.charAt((alphabet.indexOf(input.charAt(0)) + key) % 26);
        String k2 = ""+alphabet.charAt((alphabet.indexOf(input.charAt(1)) + key) % 26);
        String k3 = ""+alphabet.charAt((alphabet.indexOf(input.charAt(2)) + key) % 26);
        String k4 = ""+alphabet.charAt((alphabet.indexOf(input.charAt(3)) + key) % 26);
        String k5 = ""+alphabet.charAt((alphabet.indexOf(input.charAt(4)) + key) % 26);
        
        //change the first character to upper case
        String e1 = k1.toUpperCase();
        
        //generate the output
        String output = e1 + k2 + k3 + k4 + k5;
        
        //print out the output
        System.out.println(output);
        
        //return the output
        return output;
    }
    public static void task3(){
        
        //declare and initialize the variables
        
        int priceOfCoffee = 15000;
        int priceOfTea = 10000;
        int priceOfPizza = 45000;
        String currency = "$";
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1; 
        String nameOfCustomer ="Albert";
        
        double discountOfCoffee = 0.10;
        double discountOfTea = 0.15;
        double discountOfPizza = 0.05;
        double priceOfDiscountCoffee = (priceOfCoffee - (priceOfCoffee * discountOfCoffee)) * numOfCoffee;
        double priceOfDiscountTea = (priceOfTea - (priceOfTea * discountOfTea)) * numOfTea;
        double priceOfDiscountPizza = (priceOfPizza - (priceOfPizza * discountOfPizza)) * numOfPizza;
        double cashInHand = 200000;
        
        // count number of items
        int numOfItems = numOfCoffee + numOfTea + numOfPizza;

        // count the total price
        double totalPrice = priceOfDiscountCoffee + priceOfDiscountTea + priceOfDiscountPizza;
        // count the total price after tax
        double totalPriceAfterTax = totalPrice + (totalPrice * 0.11);
        // print total price
        System.out.println("Total Price: "+ currency + totalPrice);
        
        // count the change 
        double change = cashInHand - totalPriceAfterTax;
        //printing the change
        System.out.println("Change: " + currency + change);

        // count amount of donation
        double donation = change % 1000;
        System.out.println("Donation: " + currency + donation);

         
        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+ nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of Items: "+ numOfItems);
        System.out.println("Tea \t|\t" + numOfTea + "\t|\t"  + priceOfDiscountTea);
        System.out.println("Coffee\t|\t" + numOfCoffee + "\t|\t"  + priceOfDiscountCoffee);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + priceOfDiscountPizza);
        System.out.println("Total Before Tax: "+ currency + totalPrice);
        System.out.println("Tax: " + 11 +"%");
        System.out.println("Total After Tax: "+ totalPriceAfterTax);
        System.out.println("Amount Paid: "+ currency + cashInHand);
        System.out.println("Change: " + currency + change);
        System.out.println("Donation Amount: " + currency + donation);
        System.out.println("-----------------------------------");
    }
    public static void task4(String row) {
        int startPosition = 0;
        int commaPosition = row.indexOf(",");
        String firstNum = row.substring(startPosition, commaPosition);
        double firstNum1 = Double.parseDouble(firstNum);
    
        String row1 = row.substring(commaPosition + 1);
        commaPosition = row1.indexOf(",");
        String secondNum = row1.substring(startPosition, commaPosition);
        double secondNum1 = Double.parseDouble(secondNum);

        String row2 = row1.substring(commaPosition + 1);
        commaPosition = row2.indexOf(",");
        String thirdNum = row2.substring(startPosition, commaPosition);
        double thirdNum1 = Double.parseDouble(thirdNum);

        String row3 = row2.substring(commaPosition + 1);
        commaPosition = row3.indexOf(",");
        String fourthNum = row3.substring(startPosition, commaPosition);
        double fourthNum1 = Double.parseDouble(fourthNum);

        String row4 = row3.substring(commaPosition + 1);
        commaPosition = row4.indexOf(",");
        String fifthNum = row4.substring(startPosition);
        double fifthNum1 = Double.parseDouble(fifthNum);


        double average = (firstNum1 + secondNum1 + thirdNum1 + fourthNum1 + fifthNum1) / 5;

        System.out.println(average);
    }
}
    