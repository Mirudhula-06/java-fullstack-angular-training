
function getNameLength(name)
{
    return name.length
}
function firstCharacter(word)
{
    return word.charAt(0);
}
function lastCharacter(word)
{
    return word.charAt(word.length-1);
}
function removeExtraSpaces(word)
{
    return word.trim();
}
function capitalText(word)
{
    return word.toUpperCase();
}
function smallText(word)
{
    return word.toLowerCase();
}
function checkWord(sentence,word)
{
    if(sentence.includes(word))
    {
        return true;
    }
    else{
        return false;
    }
}
function replaceWord(sentence,old,word)
{
    return sentence.replace(old,word);
}
function extractWord(word,position)
{
    return word.slice(position);
}
function separatefruits(sentence)
{
    return sentence.split(",");
}
console.log(getNameLength("MIRUDHULA"));
console.log(firstCharacter("MIRUDHULA"));
console.log(lastCharacter("MIRUDHULA"));
console.log(removeExtraSpaces("   hi hello   "));
console.log( capitalText("hello"));
console.log(smallText("MIRUDHULA"));
console.log(checkWord("I LOVE PROGRAMS","LOVE"));
console.log(extractWord("MIRUDHULA",6));
console.log(separatefruits("APPLE,BANANA,ORANGE"));



