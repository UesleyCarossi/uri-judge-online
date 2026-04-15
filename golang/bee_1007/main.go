package main

import "fmt"

func main() {

	var a, b, c, d int8

	fmt.Scanln(&a)
	fmt.Scanln(&b)
	fmt.Scanln(&c)
	fmt.Scanln(&d)

	diff := (a * b) - (c * d)

	fmt.Printf("DIFERENCA = %d\n", diff)

}
