var _a, _b, _c;
var Book = /** @class */ (function () {
    function Book(title, genre, author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.read = false;
        this.readDate = null;
    }
    return Book;
}());
var BookList = /** @class */ (function () {
    function BookList() {
        this.books = [];
        this.lastBookRead = null;
        this.currentBook = null;
        this.nextBook = null;
    }
    Object.defineProperty(BookList.prototype, "readBooks", {
        get: function () {
            return this.books.filter(function (book) { return book.read; }).length;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(BookList.prototype, "unreadBooks", {
        get: function () {
            return this.books.filter(function (book) { return !book.read; }).length;
        },
        enumerable: false,
        configurable: true
    });
    BookList.prototype.add = function (book) {
        this.books.push(book);
        if (!this.currentBook) {
            this.currentBook = book;
            this.updateNextBook();
        }
    };
    BookList.prototype.finishCurrentBook = function () {
        if (this.currentBook) {
            this.currentBook.read = true;
            this.currentBook.readDate = new Date();
            this.lastBookRead = this.currentBook;
            this.updateNextBook();
            this.currentBook = this.nextBook;
        }
    };
    BookList.prototype.updateNextBook = function () {
        this.nextBook = this.books.find(function (book) { return !book.read; }) || null;
    };
    return BookList;
}());
var myBookList = new BookList();
var book1 = new Book("Book Title 1", "Genre 1", "Author 1");
myBookList.add(book1);
console.log("Read books: ".concat(myBookList.readBooks));
console.log("Unread books: ".concat(myBookList.unreadBooks));
myBookList.finishCurrentBook();
console.log("Read books: ".concat(myBookList.readBooks));
console.log("Unread books: ".concat(myBookList.unreadBooks));
console.log("Current book: ".concat((_a = myBookList.currentBook) === null || _a === void 0 ? void 0 : _a.title));
console.log("Next book: ".concat((_b = myBookList.nextBook) === null || _b === void 0 ? void 0 : _b.title));
console.log("Last book read: ".concat((_c = myBookList.lastBookRead) === null || _c === void 0 ? void 0 : _c.title));
