package main

import "fmt"

const (
	aWeight     float32 = 2
	bWeight     float32 = 3
	cWeight     float32 = 5
	totalWeight float32 = 10
)

func main() {

	var aInput, bInput, cInput float32

	fmt.Scanln(&aInput)
	fmt.Scanln(&bInput)
	fmt.Scanln(&cInput)

	average := (aInput*aWeight + bInput*bWeight + cInput*cWeight) / totalWeight

	fmt.Printf("MEDIA = %.1f\n", average)

}
