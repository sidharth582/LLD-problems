
##  ✅ When to Use Builder Pattern
	•	When you have a complex object with many optional parameters.
	•	When object creation involves a multi-step process.
	•	When constructors with many parameters are becoming hard to manage (telescoping constructors).



## Real life example 
Imagine you’re ordering a custom burger at a restaurant. You might choose:
	•	Type of bun
	•	Type of patty
	•	Toppings
	•	Sauces
	•	Cheese

Each customer can customize it differently. The builder pattern helps create such a custom object step-by-step.


## ✅ Advantages
	•	Improves code readability and maintainability.
	•	Avoids large telescoping constructors.
	•	Makes object creation more flexible and testable.
	•	You can reuse the builder for creating similar objects.

## ❌ Disadvantages
	•	More boilerplate code.
	•	Not ideal for very simple objects.


## 🛠 Builder Pattern in Libraries
	•	StringBuilder in Java is a real-world usage.
	•	Lombok @Builder annotation simplifies it.
	•	Common in libraries like Jackson (for JSON) and builders for HTTP clients.

