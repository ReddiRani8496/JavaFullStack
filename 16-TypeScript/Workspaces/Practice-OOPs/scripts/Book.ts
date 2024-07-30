class Book {
    title: string;
    genre: string;
    author: string;
    read: boolean;
    readDate: Date | null;
 
    constructor(title: string, genre: string, author: string) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.read = false;
        this.readDate = null;
    }
}
 
class BookList {
    books: Book[];
    lastBookRead: Book | null;
    currentBook: Book | null;
    nextBook: Book | null;
 
    constructor() {
        this.books = [];
        this.lastBookRead = null;
        this.currentBook = null;
        this.nextBook = null;
    }
 
    get readBooks(): number {
        return this.books.filter(book => book.read).length;
    }
 
    get unreadBooks(): number {
        return this.books.filter(book => !book.read).length;
    }
 
    add(book: Book): void {
        this.books.push(book);
        if (!this.currentBook) {
            this.currentBook = book;
            this.updateNextBook();
        }
    }
 
    finishCurrentBook(): void {
        if (this.currentBook) {
            this.currentBook.read = true;
            this.currentBook.readDate = new Date();
            this.lastBookRead = this.currentBook;
            this.updateNextBook();
            this.currentBook = this.nextBook;
        }
    }
 
    private updateNextBook(): void {
        this.nextBook = this.books.find(book => !book.read) || null;
    }
}

const myBookList = new BookList();
 
const book1 = new Book("Book Title 1", "Genre 1", "Author 1");

myBookList.add(book1);

 
console.log(`Read books: ${myBookList.readBooks}`);
console.log(`Unread books: ${myBookList.unreadBooks}`);
 
myBookList.finishCurrentBook();
 
console.log(`Read books: ${myBookList.readBooks}`);
console.log(`Unread books: ${myBookList.unreadBooks}`);
 
console.log(`Current book: ${myBookList.currentBook?.title}`);
console.log(`Next book: ${myBookList.nextBook?.title}`);
console.log(`Last book read: ${myBookList.lastBookRead?.title}`);