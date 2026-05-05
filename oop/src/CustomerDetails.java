import java.util.Scanner; // import the Scanner class

class Customer { // represents the customer, with a given name and age

    private String name; // stores the name of the customer
    private int age; // stores the age of the customer

    // constructor (define the customer)
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // returns the customer's name
    }

    public int getAge() {
        return age; // returns the customer's age
    }

    public void setName(String name) {
        this.name = name; // sets the customer's name to the given name
    }

    public void setAge(int age) {
        this.age = age; // sets the customer's age to the given age
    }
}

public class CustomerDetails {

    public static void main(String[] args) {

        Customer customer; // creates an instance or object of the class representing a unique customer
        String name; // stores the user's name
        int age; // stores the user's age
        char choice; // stores the user's choice
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine(); // input the customers name

        System.out.print("Enter your age: ");
        age = input.nextInt(); // input the customers age

        customer = new Customer(name, age); // creates a new customer with the name and age given

        System.out.println("Welcome " + customer.getName() + "!");
        System.out.println("Your age is: " + customer.getAge());

        System.out.println("Would you like to change your name? (Y for yes, N for no)");
        choice = input.next().charAt(0); // input the choice from the user
        input.nextLine();

        if (choice == 'Y' || choice == 'y') {
            System.out.print("Enter your new name: ");
            name = input.nextLine(); // input the customers name
            customer.setName(name); // set the name of the customer to the new name provided
            System.out.println("Welcome " + customer.getName() + "!");
        }

        System.out.println("Thank you!");

        input.close(); // closes the Scanner class
    }
}
