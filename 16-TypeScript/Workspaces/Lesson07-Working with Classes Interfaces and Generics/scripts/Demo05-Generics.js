var Menu = /** @class */ (function () {
    function Menu(itemList, totalPages) {
        this.items = itemList;
        this.pages = totalPages;
    }
    Menu.prototype.displayMenu = function () {
        console.log("Menu for Today");
        for (var _i = 0, _a = this.items; _i < _a.length; _i++) {
            var i = _a[_i];
            console.log(i);
        }
    };
    return Menu;
}());
var menu1Ref = new Menu(["Dosa", "Biryani"], 2);
menu1Ref.displayMenu();
