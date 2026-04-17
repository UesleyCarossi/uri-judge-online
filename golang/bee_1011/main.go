package main

import (
	"fmt"
	"math"
)

// (4/3) * PI
const PI43 = 4.188786666666667

func main() {

	var radius float64

	fmt.Scanln(&radius)

	// V = (4/3) * PI * r^3
	volume := PI43 * math.Pow(radius, 3)

	fmt.Printf("VOLUME = %.3f\n", volume)

}
