package main

import "fmt"

func main() {
	nums := [4]int{1, 2, 3, 5}
	original_slice := nums[1:] // slice of the nums array from index 1

	for idx, val := range original_slice {
		fmt.Println("Element ", idx+1, ": ", val) // prints the elements of the array
	}

	copied_slice := make([]int, len(nums))
	copy(copied_slice, original_slice)

	copied_slice = append(copied_slice, 40) // add 40 to the copied_slice

	fmt.Println(copied_slice)      // prints the new slice
	fmt.Println(cap(copied_slice)) // capacity is doubled to accomodate more
}
