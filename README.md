
# CodingBat Java Exercises

This repository contains Java solutions for [CodingBat](https://codingbat.com/) exercises, organized by category.  
The project is built using **Maven** and tested using a **TestHarness** class.

---

## Project Structure

```

CodingBat/
├ pom.xml
└ src/
├ main/
│   └ java/
│       └ com/
│           └ codingbat/
│               ├ SleepIn.java
│               ├ SumDouble.java
│               ├ Diff21.java
│               └ ... (other exercises)
└ test/
└ java/
└ com/
└ codingbat/
└ TestHarness.java

````

- All CodingBat classes are in `src/main/java/com/codingbat/`  
- The **TestHarness** is in `src/test/java/com/codingbat/`  
- All methods are **static** for easier testing without creating objects

---

## Categories

- Warmup-1  
- String-1  
- Array-1  
- Logic-1  

---

## How to Run

### 1. Compile the project

```bash
mvn compile
````

### 2. Run the TestHarness

Make sure the exec plugin is configured in your `pom.xml`:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <mainClass>com.codingbat.TestHarness</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Then run:

```bash
mvn exec:java
```

* The console will display test results for all methods in your `TestHarness`.

---

## Notes

* Each exercise class mirrors the CodingBat problem name
* Methods are **static** for easier testing
* The project structure follows **Maven conventions**, making it easy to extend

---

## References

* [CodingBat Java](https://codingbat.com/java)
* [Maven Getting Started](https://maven.apache.org/guides/getting-started/)
* [JUnit 5](https://junit.org/junit5/docs/current/user-guide/) (optional for future automated tests)


