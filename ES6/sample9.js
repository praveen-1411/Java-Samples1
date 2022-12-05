function date(d = today()){
    console.log(d);

}
function today(){
    return ( new date().toLocalDateString("en-US"));
}
date();