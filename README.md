## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Complile and run Java code
//compiling: javac --source-path src -d bin src/*
//running compiled file: java -cp bin App (run inside bin folder)
//run the jar file package: java -cp bin/day02Lecture. Jar App (run in project root)
//slide 12, packaging to jar: jar -c -v -f day02Lecture.jar -e App. (without going into the class file)


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
