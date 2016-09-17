# idk-game
The Java version of the idk game. You need Java to run it (obviously).

## How to compile and run
If you already have Oracle JDK or any other JDK such as OpenJDK, skip this step. If you are on Windows or would like to install the official Oracle JDK, download and install Oracle JDK by going [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html "Oracle JDK install site"), selecting your OS and architecture, and running the installer. If you would like OpenJDK, recommended if you are on any Linux distribution as it is much easier to install and free software (as in free speech AND free beer), just run the following command:  

    <PACKAGE INSTALLER> <OpenJDK PACKAGE>

For example, if I were on Debian or a Debian derivative, such as Ubuntu, Kali Linux, etc., you would run:  

    sudo apt-get install openjdk-8-jdk

Or if you are on Arch Linux:  

    sudo pacman -S jdk8-openjdk

Clone this repository locally with the following command:  

    git clone --recursive https://github.com/Kill-Man/idk-game.git

Build it with the following command:  

    javac idk.java

Since all of the other classes are referenced to somehow through idk.java, it is the only *.java file you need to compile.

Run it with `java idk`
