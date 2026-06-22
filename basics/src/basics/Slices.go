package main

import "fmt"

func main() {
	a := [4]int{1, 2, 3, 4}
	fmt.Println("Array", a)           // print the array of numbers
	fmt.Println("Length: ", len(a))   // prints the length of the array
	fmt.Println("Capacity: ", cap(a)) // prints the capacity of the array

	original_slice := a[1:3] // creates a slice of the array from index 1 to 3

	copied_slice := make([]int, len(original_slice)) // makes a new slice

	fmt.Println(original_slice) // prints the original slice
	fmt.Println(copied_slice)   // prints the new slice

	copy(copied_slice, original_slice)      // creates a modifiable version of original_slice wihtout affecting it
	copied_slice = append(copied_slice, 32) // adds 32 to the copied_slice

	fmt.Println(original_slice) // prints the original slice (not modified)
	fmt.Println(copied_slice)   // prints the new modified slice
}
