function sbi(balance,amount)
{
    if(amount<=balance)
    {
        console.log(`successfully withdrawed : ${amount}`)
    }
    else{
        console.log(`insufficient amount`);
        
    }
}
sbi(10000,2000)

function add(sum1,sum2){
    return sum1+sum2;
}
console.log(add(100,200));

//arrow function
let add1=(a,b)=>{
    console.log(a+b);
}
add1(10,20)
let get=name=>name;
console.log(get("mirudhula"));

