var Customer = /** @class */ (function () {
    function Customer(id, name) {
        this.id = id;
        this.name = name;
    }
    return Customer;
}());
var CustomerList = /** @class */ (function () {
    function CustomerList() {
        this.customers = [];
    }
    CustomerList.prototype.addCustomer = function (customer) {
        this.customers.push(customer);
    };
    CustomerList.prototype.findCustomerById = function (id) {
        return this.customers.find(function (customer) { return customer.id === id; });
    };
    return CustomerList;
}());
var Order = /** @class */ (function () {
    function Order() {
        this.items = [];
    }
    Order.prototype.addItem = function (item) {
        this.items.push(item);
    };
    Order.prototype.removeItem = function (item) {
        var index = this.items.indexOf(item);
        if (index > -1) {
            this.items.splice(index, 1);
        }
    };
    Order.prototype.getItems = function () {
        return this.items;
    };
    return Order;
}());
var customerList = new CustomerList();
customerList.addCustomer(new Customer(1, 'Rahul'));
customerList.addCustomer(new Customer(2, 'Rohit'));
var customer = customerList.findCustomerById(1);
if (customer) {
    console.log("Customer found: ".concat(customer.name));
}
else {
    console.log('Customer not found');
}
var order = new Order();
order.addItem('Item1');
order.addItem('Item2');
order.addItem('Item3');
console.log('Order items after adding:', order.getItems());
order.removeItem('Item2');
console.log('Order items after removing:', order.getItems());
