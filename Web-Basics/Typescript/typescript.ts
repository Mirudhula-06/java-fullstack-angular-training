// //type annotation -we are going to mention type explicitly


// // let message:string ="this is typescript";

// //type annotation:
// //typescript users can use type annotation to explicitly specify types for identifiers such as variable,function,object

// //!type inference:
// //there is no need to mention specific type for identifiers 
// //perform in primitive data type

// // //! array:
// // let languages:string[]=["tamil","english","hindi","chinese"]

// //object
// let student={
//     sname:"miru",
//     age:21
// }
// //type annonation
// //restrict using data type
// let studentDetails:{
//     name:string;
//     age:number
// }={
//     name:"miru",
//     age:21
// }
// console.log(studentDetails);
// //! primitive data type
// //number,string,boolean
// let userId=12;
// // userId="mirudhula"-->Type 'string' is not assignable to type 'number'.

// // let isStudent=true;
// // isStudent=false;

// // function addNumber(num1:number,num2:number):number
// // {
// //     return num1+num2;
// // }
// // console.log(addNumber(20,30));

// // //void will not return anything
// // function msg():void
// // {
// //     console.log("helllo typescript !!");
    
// // }

// //-------------------------------
// //!optional
// //?-->optional(used inside parameters)
// //nickname is optional so use ?-->'nickname' is declared but its value is never read.
// // function printName(firstname:string,nickname?:string)
// // {
// //     console.log(`firstName : ${firstname}`);
// // }
// // printName("madhumita")

// //---------------------------------
// //! type aliases is used to give a new name/nickname to an existing type by using type keyword.

// type name=string
// let studentName:name="Mirudhula"

// //object

// type candidate={
//     name:string;
//     age:number;
//     course:string;
// }
// let candidate={
//     name:"buji",
//     age:40,
//     course:"IT"
// }

// //function 

// type AddFunction=(a:number,b:number)=>number;

// const add:AddFunction=(x,y)=>{
//     return x+y;
// }
// console.log(add(10,20));

// //union type (|)

// //it can satisfy either any one datatype

// //type user=string|boolean;
// let myBoolean:string|boolean =true

// // type  user=string|boolean|number;

// // let User:user=6;
// // type user={
// //     name:string;
// //     password:string|number;
// //     isRole:Boolean|string
// // // }
// // function greet(container:user)
// // {
// //     return container
// // }
// // console.log(greet({name:"mirudhula",password:"miru@2004",isRole:true}));

// //Intersection (&)
// //both the values should be satisfied
// // type person={
// //     name:String;
// // }
// // type employee={
// //     id:number;
// // }

// // type staff=person&employee;
// // let staff1:staff={
// //     name:"madhu",
// //     id:101

// // }

// //!ENUM
// //enum is a special type that represents a set of predefined constant values.

// // enum Direction
// // {
// //     up,
// //     down,
// //     left,
// //     right
// // }
// // let move:Direction=Direction.right;
// // console.log(move);
// // console.log(Direction[2]);


// // //customize the enum values

// // enum Status
// // {
// //     success=1,
// //     error=2,
// //     loading=3
// // }
// // console.log(Status.loading);

// // enum Role{
// //     Admin="Madhu",
// //     user="buji",
// //     guest="aparna"
// // }
// // console.log(Role.guest);
// // let userRole:Role=Role.Admin
// // console.log(userRole);

// // //OOPS

// // //class
// // // class Student
// // // {
// // //     display()
// // //     {
// // //         console.log("this is one student");
        
// // //     }
// // // }

// // // let s1=new Student();
// // // console.log(s1.display());

// // //contructor

// // class Student {
// //   name: string;
// //   age: number;

// //   constructor(name: string, age: number) {
// //     this.name = name;
// //     this.age = age;
// //   }
// // }

// // let s1 = new Student("Buji", 21);

// // console.log(s1.name);
// // console.log(s1.age);

// // // //INHERITANCE
// // // class Animal {
// // //   sound() {
// // //     console.log("Animal makes sound");
// // //   }
// // // }

// // // class Dog extends Animal {
// // //   bark() {
// // //     console.log("Dog barks");
// // //   }
// // // }

// // // let d = new Dog();
// // // d.sound();
// // // d.bark();

// // //INTERFACE
// // interface Animal {
// //   makeSound(): void;
// // }

// // class dog implements Animal {
// //   makeSound() {
// //     console.log("Bark");
// //   }
// // }
// // let res = new dog();
// // res.makeSound();