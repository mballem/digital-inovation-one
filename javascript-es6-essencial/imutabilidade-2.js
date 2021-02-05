const students = [
    {name: 'Bill', grade: 5},
    {name: 'Bud', grade: 6},
    {name: 'Amy', grade: 7},
    {name: 'Jess', grade: 7.5},
    {name: 'Ted', grade: 8},
    {name: 'Mia', grade: 6.8}
];

function getApprovedStudents(students) {
    return students.filter(student => student.grade >= 7);
}

function getReprovedStudents(students) {
    return students.filter(student => student.grade < 7);
}

console.log('Lista de Alunos: ');
console.log(students);

console.log('\nAlunos Aprovados:');
console.log(getApprovedStudents(students));

console.log('\nAlunos Reprovados:');
console.log(getReprovedStudents(students));
