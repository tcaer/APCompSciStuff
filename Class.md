# Class Hierarchies & Interfaces

## Class hierarchies and polymorphism

### Inheritance
 - Two pieces of information: superclass and subclass
 - Super class is known as baseclass, subclass is known as derived class
 - Subclass normally extends your superclass
 - `Subclass extends Superclass`
 - Inheritance represents an IS-A relationship between two classes
 - Subclass inherits all the fields and the methods of its superclass, but not the constructors
 - You can use inheritance to define a hierarchy of classes

### Polymorphism
 - Ensures that the correct method is called for an object of a specific type, even when that object is disguised as a reference fo a more generic type
 - Once you define a common superclass, polymorphism is just there - you don't need to do anything special
 - Implemented through a technique in Java known as late (or dynamic) method binding => which method is called is determined at runtime not compiletime

## Abstract classes
 - Some methods in a class can be declared as abstract and only require a method signature defined
 - If you have more than one abstract method then the entire class has to be declared abstract
 - `public abstract void draw( ... );`
 - An abstract class doesn't need to only compose of abstract methods
 - Absrtact classes server normally as superclasses for more specific classes
 - Abstract classes are closer to the root of the hierarchy
 - Java does not allow you to create abstract objects, another class extending the abstract class must be used
 - Abstract classes can have constructors, but they are called from the constructor of a subclass
 - A class with no abstract method is called concrete

## Invoking Superclass's Constructors
 - Use the `super` keyword

## Syntax for calling superclass constructors and methods

## Interfaces
 - Any mechanism that connects two devices or entities and defines the rules for their interaction
 - A class can implement many interfaces
 - An interface supplies a secondary data type to objects of a class that implements the interface
 - An inteface cannot have fields (except, some public static final constants)
 - 