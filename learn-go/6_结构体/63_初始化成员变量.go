package main

import "fmt"

type User struct {
	Name string
	age  int
}

func main() {
	// key value 初始化
	user1 := User{
		Name: "zhang",
		age:  10,
	}

	fmt.Println(user1)

	// 使用 list 初始化
	user2 := User{
		"beihai",
		20,
	}
	fmt.Println(user2)

	// 匿名 struct
	user3 := struct {
		index int
		value string
	}{
		index: 10,
		value: "name",
	}
	fmt.Println(user3)
}
