function getProfile(){
    return[
        'John',
        'Doe',
        ['Red','green','Blue']
    ];
}

let[
    firstName,
    lastName,
    [
        color1,
        color2,
        color3
    ]
] = getProfile();

console.log(color1, color2, color3);
console.log(firstName, lastName);