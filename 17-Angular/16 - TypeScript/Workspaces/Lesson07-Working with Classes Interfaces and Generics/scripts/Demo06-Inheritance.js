var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var InventoryItem = /** @class */ (function () {
    function InventoryItem(codition, price) {
        this.codition = codition;
        this.price = price;
        console.log("parameterised constructor from inventory item..");
    }
    InventoryItem.prototype.showDetails = function () {
        return "Inventory Item[ Price: ".concat(this.price, ",\n            condition: ").concat(this.codition);
    };
    return InventoryItem;
}());
var Movie = /** @class */ (function (_super) {
    __extends(Movie, _super);
    function Movie(givenCondition, givenPrice, id, title, rating) {
        var _this = _super.call(this, givenCondition, givenPrice) || this;
        _this.id = id;
        _this.title = title;
        _this.rating = rating;
        return _this;
    }
    Movie.prototype.showDetails = function () {
        var inventoryDetails = _super.prototype.showDetails.call(this);
        return "".concat(inventoryDetails, ", Movie [id : ").concat(this.id, "\n            , Title: ").concat(this.title, ", Rating: ").concat(this.rating, " ]");
    };
    return Movie;
}(InventoryItem));
var mov1Ref = new Movie("Available", 250, 1, "ABC", "Awesome");
console.log(mov1Ref.showDetails());
var baseRef = new Movie("Not Available", 300, 2, "XYZ", "Fabulous");
console.log(baseRef.showDetails());
