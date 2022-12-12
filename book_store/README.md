# Book Store

This task will require you to have some knowledge of OOP, looping, random, and array to complete.

## The `Book` Class

A class called "Book" should contain:

#### Instance variables

- `id` the variable stores the book id and declare it as private final(type: int)
- `latestId` the variable stores the latest id used by the book object and declares it as private and static (type: int)
- `name` the variable stores the book name and declare it as private and final(type: String)
- `author` the variable stores the book author and declare it as private and final (type: String)
- `price` the variable stores the book price and declare it as private (type: double)

### Constructor

The constructor should do these following task:

- set `id` as `latestId`
- increment `latestId` by 1
- receive the `name`, `author`, and `price`, then assign them to the instance variables

#### Methods

- Getters of variables: `id`, `name`, `author`, and `price`
- Setter of variable: `price`
- `toString():String`

## The `BookStore` Class

A class called "BookStore" should contain:

#### Instance variables

- `id` the variable stores the book id and declare it as private (type: int)
- `latestId` the variable stores the latest id used by the book store object and declares it as private and static (type: int)
- `name` the variable stores the book name and declare it as private (type: String)
- `books` the variable stores the books that are available and declared as private (type: Book[])
- `size` the variable stores the size of bookshelf in the shop and declared as private (type: int)

### Constructor

The constructor should do these following task:

- set `id` as `latestId`
- increment `latestId` by 1
- receive the `name`, and `size`, then assign them to the instance variable

#### Methods

- Getters of variables: `id`, `name`, and `books`
- Setter of variable: `name`
- `addBook(book:Book):boolean` randomize the id and check if the id exists in the `books` array return false, otherwise, add the new book at an index from the id you just random
- `sellBook(id:int):boolean` remove the book from the `books` array
- `getAllBooks():Book[]` return all available books in the store
- `toString():String`
