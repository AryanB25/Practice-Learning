package main

import "fmt"

func main() {
	a := [5]int{1, 2, 3}                            // array that stores 3 given numbers and 2 0's
	var names = [3]string{"ARYAN", "ALEX", "BRYAN"} // array that stores names
	fmt.Println(a)                                  // print array "a"
	fmt.Println(names)                              // print array "names"
	fmt.Println(len(names))                         // print the number of names
}
