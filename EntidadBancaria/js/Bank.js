Bank = function() {
    this.clients = [];
}

Bank.prototype.getClientAccountInterestRateQuantity = function(name, years) {
    var client = this.getClient(name);
    if (!client) {
        alert("No es un cliente del banco.");
        return;
    }
    return client.getAccount().calculateInterestRate(years);
}

Bank.prototype.getClientAccountQuantity = function(name) {
    var client = this.getClient(name);
    if (!client) {
        alert("No es un cliente del banco.");
        return;
    }
    return client.getAccount().getActualQuantity();
}

Bank.prototype.createClient = function(name, quantity) {
    var client = new Client(name, quantity);
    this.addClient(client);
}

Bank.prototype.addClient = function(client) {
    this.clients.push(client);
}

Bank.prototype.getClient = function(name) {
    for (var i = 0; i < this.clients.length; i++) {
        var client = this.clients[i];
        if (client.name == name) {
            return client;
        }
    }
    return false;
}
