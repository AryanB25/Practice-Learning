package main

import "fmt"

func main() {
	a := 34
	b := 2

	product_answer := productOfNumbers(a, b)
	printProduct(product_answer)
}

func productOfNumbers(a int, b int) (result int) {
	result = a * b
	return
}

func printProduct(result int) {
	fmt.Println("Product: ", result)
}
