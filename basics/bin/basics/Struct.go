package main

import "fmt"

type Person struct {
	name      string // stores the name of the person
	age       int    // stores the age of the person
	income    int    // stores the income of the person
	isMarried bool   // stores true or false if the person is married
}

func main() {
	var person1 Person // represents the first person
	var person2 Person // represents the second person

	// define the first person
	person1.name = "Aryan"
	person1.age = 18
	person1.isMarried = false

	// define the second person
	person2.name = "Alex"
	person2.age = 20
	person2.income = 20
	person2.isMarried = true

	printPerson(person1) // print the details of the first person
	printPerson(person2) // print the details of the second person
}

func printPerson(person Person) {
	fmt.Println("Name: ", person.name)     // prints the name of the person
	fmt.Println("Age: ", person.age)       // prints the age of the person
	fmt.Println("Income: ", person.income) // prints the income of the person
	if person.isMarried {                  // checks if the person is married
		fmt.Println(person.name, " is Married")
	} else {
		fmt.Println(person.name, " is NOT Married")
	}
}
