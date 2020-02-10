package main

import (
	"fmt"
	"io/ioutil"
)

func main() {
	// reads the local contents of the datadump
	data, err := ioutil.ReadFile("localfile.data")
	// Catch possible errors
	if err != nil {
		fmt.Println(err)
	}

	// Upon sucessfully finding the file
	// Prints the contents as a string
	fmt.Print(string(data))
}
