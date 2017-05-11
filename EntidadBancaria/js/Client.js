Client = function(name, initialQuantity) {
    this.name = name;
    this.account = new Account(initialQuantity);
}

Client.prototype.getAccount = function() {
    return this.account;
}
