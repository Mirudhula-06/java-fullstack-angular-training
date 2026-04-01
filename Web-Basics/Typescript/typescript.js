//type annotation -we are going to mention type explicitly
var message = "this is typescript";
//type annotation:
//typescript users can use type annotation to explicitly specify types for identifiers such as variable,function,object
//!type inference:
//there is no need to mention specific type for identifiers 
//perform in primitive data type
//! array:
var languages = ["tamil", "english", "hindi", "chinese"];
//object
var student = {
    sname: "bavan",
    age: 21
};
//type annonation
//restrict using data type
var studentDetails = {
    name: "bavan",
    age: 21
};
console.log(studentDetails);
//! primitive data type
//number,string,boolean
var userId = 12;
// userId="mirudhula"-->Type 'string' is not assignable to type 'number'.
var isStudent = true;
isStudent = false;
function addNumber(num1, num2) {
    return num1 + num2;
}
console.log(addNumber(20, 30));
//void will not return anything
function msg() {
    console.log("helllo typescript !!");
}
//-------------------------------
//!optional
//?-->optional(used inside parameters)
//nickname is optional so use ?-->'nickname' is declared but its value is never read.
function printName(firstname, nickname) {
    console.log("firstName : ".concat(firstname));
}
printName("madhumita");
var studentName = "Mirudhula";
var candidate = {
    name: "buji",
    age: 40,
    course: "IT"
};
var add = function (x, y) {
    return x + y;
};
console.log(add(10, 20));
//union type (|)
//it can satisfy either any one datatype
//type user=string|boolean;
var myBoolean = true;
function greet(container) {
    return container;
}
console.log(greet({ name: "mirudhula", password: "miru@2004", isRole: true }));
var staff1 = {
    name: "madhu",
    id: 101
};
//!ENUM
//enum is a special type that represents a set of predefined constant values.
var Direction;
(function (Direction) {
    Direction[Direction["up"] = 0] = "up";
    Direction[Direction["down"] = 1] = "down";
    Direction[Direction["left"] = 2] = "left";
    Direction[Direction["right"] = 3] = "right";
})(Direction || (Direction = {}));
var move = Direction.right;
console.log(move);
console.log(Direction[2]);
//customize the enum values
var Status;
(function (Status) {
    Status[Status["success"] = 1] = "success";
    Status[Status["error"] = 2] = "error";
    Status[Status["loading"] = 3] = "loading";
})(Status || (Status = {}));
console.log(Status.loading);
var Role;
(function (Role) {
    Role["Admin"] = "Madhu";
    Role["user"] = "buji";
    Role["guest"] = "aparna";
})(Role || (Role = {}));
console.log(Role.guest);
var userRole = Role.Admin;
console.log(userRole);
//class
var Student = /** @class */ (function () {
    function Student() {
    }
    Student.prototype.display = function () {
        console.log("this is one student");
    };
    return Student;
}());
var s1 = new Student();
console.log(s1.display());
