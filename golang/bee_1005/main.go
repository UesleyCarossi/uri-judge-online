package main

import "fmt"

const (
	aWeight     float32 = 3.5
	bWeight     float32 = 7.5
	totalWeight float32 = 11
)

func main() {

	var aInput, bInput float32

	fmt.Scanln(&aInput)
	fmt.Scanln(&bInput)

	average := (aInput*aWeight + bInput*bWeight) / totalWeight

	fmt.Printf("MEDIA = %.5f\n", average)

}
