let userDetail:[number|string,string,string,string,boolean]=[101,"Mirudhula","mirudhula@gmail.com","Miru@2004",true]
console.log(userDetail);

//this is also alias
interface UserType{
    name:string,
    email:string
}
let emp1:UserType={
    name:'mirudhula',
    email:'mirudhula@gmail.com'
}
console.log(emp1);

//code repetition and duplication
function Demo(a:string)
{
    console.log(a); 
}
function Demo1(a:number)
{
    console.log(a); 
}
//Generics
function Demo2<T>(para:T)
{
    console.log(para); 
}
Demo2(<string>("hi everyone!"));
Demo2(<number>(20000));
// Demo2(<number>("20000"));-->error
Demo2(<boolean>(true))

//Decorator

function logger(cons:Function)
{
    console.log("Welcome to Angular");
}

@logger
class login
{
    name="Mirudhula";
}

let user1=new login();
console.log(user1);
