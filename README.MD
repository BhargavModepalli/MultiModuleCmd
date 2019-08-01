java 11 multimodule project with cmd 

javac -d mods/arithmeticoperations  arithmeticoperations/src/com/team/addition/AdditionUtils.java arithmeticoperations/src/com/team/subtraction/SubtractionUtils.java  arithmeticoperations/src/module-info.java

javac --module-path mods  -d mods/main  main/src/com/team/Testing.java  main/src/module-info.java

java --module-path mods -m  main/com.team.Testing

http://openjdk.java.net/projects/jigsaw/quick-start#multimodulecompile

https://dzone.com/articles/java-9-modules-introduction-part-1

javac -d mods --module-source-path src $(find src -name "*.java") to compile both modules