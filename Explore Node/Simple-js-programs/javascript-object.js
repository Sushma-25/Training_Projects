var personalInfo={
    name: "sushma",
    emp_id: 125,
    dept: "Software development",
    location: "Bangalore",
    emp_type: true,
    salary: 25000,

    empDetails(){
        console.log(this.name+" : "+this.salary)
    }
}
console.log(personalInfo.name)
console.log(personalInfo.dept)
personalInfo.empDetails()

console.log(personalInfo)


personalInfo ={
    project:"micro services"
}
console.log(personalInfo)