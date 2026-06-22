package main

import "fmt"

func main() {
	a := 8
	b := 9

	if a > b { // if the value of a is greater than b
		fmt.Println(a, " is greater than ", b)
	} else if b > a { // if the value of a is greater than b
		fmt.Println(b, " is greater than ", a)
	} else { // if the value of a is equal to b
		fmt.Println("EQUAL!")
	}
}
