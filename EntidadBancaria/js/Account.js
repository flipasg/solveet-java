Account = function(initialQuantity) {
    this.INTEREST_RATE = 0.05;
    this.initialQuantity = initialQuantity;
    this.actualQuantity = this.initialQuantity;
}

Account.prototype.getActualQuantity = function() {
    return this.actualQuantity;
}

Account.prototype.calculateInterestRate = function(years) {
    // p (1+r) n
    return this.initialQuantity * (1 + this.INTEREST_RATE) * years;
}
