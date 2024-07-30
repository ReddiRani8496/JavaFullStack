class Customer {
    constructor(public id: number, public name: string) {}
}

class CustomerList {
    private customers: Customer[] = [];

    addCustomer(customer: Customer): void {
        this.customers.push(customer);
    }

    findCustomerById(id: number): Customer | undefined {
        return this.customers.find(customer => customer.id === id);
    }
}

class Order {
    private items: string[] = [];

    addItem(item: string): void {
        this.items.push(item);
    }

    removeItem(item: string): void {
        const index = this.items.indexOf(item);
        if (index > -1) {
            this.items.splice(index, 1);
        }
    }

    getItems(): string[] {
        return this.items;
    }
}

const customerList = new CustomerList();
customerList.addCustomer(new Customer(1, 'Rahul'));
customerList.addCustomer(new Customer(2, 'Rohit'));

const customer = customerList.findCustomerById(1);
if (customer) {
    console.log(`Customer found: ${customer.name}`);
} else {
    console.log('Customer not found');
}

const order = new Order();
order.addItem('Item1');
order.addItem('Item2');
order.addItem('Item3');
console.log('Order items after adding:', order.getItems());

order.removeItem('Item2');
console.log('Order items after removing:', order.getItems());
