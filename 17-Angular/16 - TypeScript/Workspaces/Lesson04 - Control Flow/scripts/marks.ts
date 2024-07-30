let david:number[] = [90,95,85,87];
let vinoth:number[] = [96,91,89,88];
let divya:number[] = [79,94,90,81];
let ishitha:number[] = [84,80,93,90];
let thomas:number[] = [94,83,80,99];
let davidtotalmarks = 0;
for(let da of david) {
    davidtotalmarks += da;
}

let vinothtotalmarks = 0;
for(let j of vinoth) {
    vinothtotalmarks += j;
}

let divyatotalmarks = 0;
for(let d of divya) {
    divyatotalmarks += d;
}

let ishithatotalmarks = 0;
for(let i of ishitha) {
    ishithatotalmarks += i;
}

let thomastotalmarks = 0;
for(let t of thomas) {
    thomastotalmarks += t;
}

function displayresults() {
    console.log("Student                 Marks");
    console.log(`David                   ${davidtotalmarks}`);
    console.log(`Vinoth                  ${vinothtotalmarks}`);
    console.log(`Divya                   ${divyatotalmarks}`);
    console.log(`Ishitha                 ${ishithatotalmarks}`);
    console.log(`Thomas                  ${thomastotalmarks}`); 
}

let davidGrade = findGrade(davidtotalmarks)
let vinothGrade =findGrade(vinothtotalmarks);
let divyaGrade = findGrade(divyatotalmarks);
let ishithaGrade=findGrade(ishithatotalmarks);
let thomasGrade=findGrade(thomastotalmarks);
function findGrade(mark:number):string {
    if(mark < 60)
        return 'F';
    else if(mark < 70)
        return 'D';
    else if(mark < 80)
        return 'C';
    else if(mark < 90)
       return 'B';
    else 
        return 'A';
}

console.log(`David grade: ${davidGrade}`);
console.log(`vinoth grade: ${vinothGrade}`);
console.log(`divya grade: ${divyaGrade}`);
console.log(`ishitha grade: ${ishithaGrade}`);
console.log(`thomas grade: ${thomasGrade}`);





