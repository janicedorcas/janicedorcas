
FROM openjdk:17

WORKDIR /app

COPY . .

RUN javac Hotel/*.java realconstruction/*.java Traffic/*.java

CMD ["java", "-cp", "out", "realconstruction.Main"]

