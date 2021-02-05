const user = {
    name: 'Beltrano',
    surname: 'da Silva'
}

function getUserWithFullName(user) {
    return {
        ...user,
        fullName: `${user.name} ${user.surname}`
    }
}

const userFullName = getUserWithFullName(user);

console.log(userFullName, user);