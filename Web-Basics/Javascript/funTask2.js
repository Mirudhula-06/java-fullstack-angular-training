let getFullName=(fullname)=>{
    name=fullname.trim().toLowerCase();
    return name.replace(" ","_");
}
console.log(getFullName("Miru dhula   "));

//validate email
let checkmail=(mail)=>{
    if(mail.includes("@")&&mail.includes("."))
        return true;
    else
        return false;
}
console.log(checkmail("mirudhula.j06@gmail.com"));

//validate password
let checkPassword=(pwsd)=>{
    if(pwsd.includes("@"))
        return true;
    else
        return false;
}
console.log(checkPassword("Miru@2004"));

//return first and last letter

let letter=(word)=>{
   console.log("First letter :" +word.charAt(0)+"Last letter :"+word.charAt(word.length-1)) 
}

//extract domain
let extract=(mail)=>{
    return mail.slice(mail.indexOf("@")+1);
}
console.log(extract("mirudhula@gmail.com"));

let sentence=(sen)=>{
    return sen.trim().toUpperCase();
}
console.log(sentence("  ahughs  "));
