var bank = new Bank();

calculateInterestRateInterface = function() {
    var name = prompt("Introduce el nombre del cliente");
    while (!name || name == "") {
        name = prompt("Introduce el nombre del cliente");
    }
    var years = prompt("Introduce el número de años para el cálculo");
    while (!years || isNaN(years)) {
        years = prompt("Introduce el número de años para el cálculo");
    }
    var quantity = bank.getClientAccountInterestRateQuantity(name, years);
    if (quantity) {
        alert("El dinero en " + years + " años en la cuenta del cliente " + name + " será de " + quantity + "€");
    }
}

createClientInterface = function() {
    var name = prompt("Introduce el nombre del cliente");
    while (!name || name == "") {

    }
    var quantity = prompt("Introduce el deposito inicial para la cuenta");
    while (!quantity || isNaN(quantity)) {
        quantity = prompt("Introduce el deposito inicial para la cuenta");
    }
    bank.createClient(name, quantity);
}

showClientAccountInterface = function() {
    var name = prompt("Introduce el nombre del cliente");
    while (!name || name == "") {
        name = prompt("Introduce el nombre del cliente");
    }

    var quantity = bank.getClientAccountQuantity(name);
    if (quantity) {
        alert("El dinero actual en la cuenta del cliente " + name + " es " + quantity + "€");
    }
}
