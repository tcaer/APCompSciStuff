# Errors that occur based on the code

## Scope
If you try to refer to a local variable outside of its scope, then you get a `Cannot resolve symbol` 
````
class Foo {
	
	private int a = 0;

	public Foo(int bar) {
		test();
	}

	public void test() {
		a += bar; // Not allowed since int bar is not in this scope
	}

}
````

Parameters have precendence over fields
````
class Foo {
	
	private int bar = 0;

	public Foo(int bar) {
		bar = bar; // The paramater bar is used instead of the field bar, instead use this.bar = bar;
	}

}
````