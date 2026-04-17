package main

import "fmt"

func main() {

	var (
		productAId, productAAmount, productBId, productBAmount int8
		productAPrice, productBPrice                           float32
	)

	fmt.Scan(&productAId)
	fmt.Scan(&productAAmount)
	fmt.Scanln(&productAPrice)
	fmt.Scan(&productBId)
	fmt.Scan(&productBAmount)
	fmt.Scanln(&productBPrice)

	total := float32(productAAmount)*productAPrice + float32(productBAmount)*productBPrice

	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", total)

}
