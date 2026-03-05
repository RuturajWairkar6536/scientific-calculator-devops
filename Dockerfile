FROM eclipse-temurin:17

WORKDIR /app

COPY Calculator.java .

RUN javac Calculator.java

CMD ["java", "Calculator"]
