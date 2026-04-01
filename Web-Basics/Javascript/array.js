let product=["watergun","watch","gun","hello","apple",10,3.5,0.2,false,true];
console.log(product.at(0));
console.log(product.includes(0.2));

console.log(product.shift());//remove the value
console.log(product.unshift());//add the removed value
//inserts new elements at the start of an array, and returns the new length of the array.
// console.log(product.join("01"));
// console.log(product.reverse());
// console.log(product.sort());
console.log(product.splice(0,2));
console.log(product.splice(0,1,"mirudhula","madhumita"));
console.log(product);


