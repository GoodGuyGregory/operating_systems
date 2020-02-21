package main

import (
	"fmt"
	"time"
)

func makeThread() {
	fmt.Println("Active Thread in GO")
}

func main() {
	fmt.Println("main execution started")

	// GO Routine to represent thread in GO Language Engine
	go makeThread()

	// Test Execution in Go Routine
	time.Sleep(25 * time.Millisecond)

	fmt.Println("main exection stopped")
}
