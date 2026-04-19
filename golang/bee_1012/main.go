package main

import (
	"fmt"
	"math"
)

const PI = 3.14159

func main() {

	var a, b, c float64

	fmt.Scan(&a, &b, &c)

	// rectangle triangle area
	// A = (bxh) / 2
	rectangleTriangleArea := (a * c) / 2
	fmt.Printf("TRIANGULO: %.3f\n", rectangleTriangleArea)

	// radius's circle
	// A = pi * r ^ 2
	radiusCircle := PI * math.Pow(c, 2)
	fmt.Printf("CIRCULO: %.3f\n", radiusCircle)

	// trapezium area
	// A = ((a + b) / 2 ) * h
	trapeziumArea := ((a + b) / 2) * c
	fmt.Printf("TRAPEZIO: %.3f\n", trapeziumArea)

	// square area
	// A = a ^ 2
	squareArea := math.Pow(b, 2)
	fmt.Printf("QUADRADO: %.3f\n", squareArea)

	// rectangle area
	// A = b x h
	rectangleArea := a * b
	fmt.Printf("RETANGULO: %.3f\n", rectangleArea)

}
