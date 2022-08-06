# StreamTraining
JavaStream101
 > In this tutorial,
    We’ll learn about What are Intermediate Operations in Java 8 Stream.
    All these operations are in package java.util.stream.Stream.

 > Here is the list of all Stream intermediate operations:

- filter()
- map()
- flatMap()
- distinct()
- sorted()
- peek()
- limit()
- skip()

>Java 8 Stream intermediate operations return another Stream which
allows you to call multiple operations in the form of a query.

>Stream intermediate operations do not get executed until a terminal operation is invoked.

>map() wrpper types are also comes under intermediate operations category.
mapToDouble(), mapToLong(), mapToInt()


- -----------------------------------------------
> This section helps you discover the folllowing terminal operations provided by Java Stream API in details:
1. The allMatch() operation
2. The anyMatch() operation
3. The noneMatch() operation
4. The collect() operation
5. The count() operation
6. The forEach() operation
7. The min() operation
8. The max() operation
9. The reduce() operation

Remember the following two key characteristics of terminal operations:
They can return a primitive value (booleanor long), a concrete type (Optional value object), or void (creating side effect).
They are eagerly executed, and a terminal operation is always the last operation in a Stream pipeline.


 > The distinct() operation returns a stream consisting of the distinct elements (no duplicates) by comparing objects via
their equals() method
 
- https://www.techiedelight.com/convert-int-array-list-integer/

- ALL MATCH : Note that if the stream is empty, the method returns true and the predicate is not evaluated.