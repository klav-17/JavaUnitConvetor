 A simple Java-based Command Line Interface (CLI) application to convert units of Length, Mass, and Temperature.

📌 Features
Convert between:

📏 Length: meter, kilometer, mile, foot, inch, centimeter

⚖️ Mass: kilogram, gram, pound, ounce

🌡️ Temperature: Celsius, Fahrenheit, Kelvin

Clean and interactive CLI prompts

Input validation with clear error messages

Accurate unit conversions

🛠️ Built With
Java (JDK 8+)

No third-party libraries

🚀 Getting Started
📦 Prerequisites
Make sure Java is installed:

bash
Copy
Edit
java -version
🔧 Setup & Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/java-unit-converter-cli.git
cd java-unit-converter-cli
Compile the Java file:

bash
Copy
Edit
javac UnitConverter.java
Run the program:

bash
Copy
Edit
java UnitConverter
💡 Example Usage
text
Copy
Edit
Welcome to the Java Unit Converter CLI!
Please choose a category:
1. Length
2. Mass
3. Temperature
Enter your choice: 1

You selected: Length
Available units: meter, kilometer, mile, foot, inch, centimeter
Enter value: 1000
From unit: meter
To unit: kilometer

Result: 1000 meter = 1 kilometer
📂 Project Structure
bash
Copy
Edit
java-unit-converter-cli/
├── UnitConverter.java     # Main Java file
└── README.md              # Project documentation
✅ Supported Units
Length
meter (m)

kilometer (km)

mile (mi)

foot (ft)

inch (in)

centimeter (cm)

Mass
kilogram (kg)

gram (g)

pound (lb)

ounce (oz)

Temperature
Celsius (°C)

Fahrenheit (°F)

Kelvin (K)

🧩 Enhancements (Optional)
Add support for additional units (e.g., volume, speed)

Add conversion history

Unit abbreviation recognition (e.g., “kg” for kilogram)

