package main

import "fmt"

func main() {

	var number, hours int16
	var perHour float32

	fmt.Scanln(&number)
	fmt.Scanln(&hours)
	fmt.Scanln(&perHour)

	salary := float32(hours) * perHour

	fmt.Printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, salary)

}
