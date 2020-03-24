# tester-java
MySQL Tester written on Java

### How to install Java 8

From here: https://www.javahelps.com/2015/03/install-oracle-jdk-in-ubuntu.html

sudo mkdir /usr/lib/jvm
cd /usr/lib/jvm
sudo tar -xvzf ~/Downloads/jdk-8u231-linux-x64.tar.gz
vi /etc/environment

Add the following bin folders to the existing PATH variable:
/usr/lib/jvm/jdk1.8.0_231/bin
/usr/lib/jvm/jdk1.8.0_231/db/bin
/usr/lib/jvm/jdk1.8.0_231/jre/bin

Add the following environment variables at the end of the file:
J2SDKDIR="/usr/lib/jvm/jdk1.8.0_231"
J2REDIR="/usr/lib/jvm/jdk1.8.0_231/jre"
JAVA_HOME="/usr/lib/jvm/jdk1.8.0_231"
DERBY_HOME="/usr/lib/jvm/jdk1.8.0_231/db"

sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.8.0_231/bin/java" 0
sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/jvm/jdk1.8.0_231/bin/javac" 0
sudo update-alternatives --set java /usr/lib/jvm/jdk1.8.0_231/bin/java
sudo update-alternatives --set javac /usr/lib/jvm/jdk1.8.0_231/bin/javac

To verify the setup enter the following commands and make sure that they print the location of java and javac as you have provided in the previous step:
update-alternatives --list java
update-alternatives --list javac

Re-login and test:
java -version



apt-get remove openjdk*
add-apt-repository ppa:webupd8team/java
apt-get update
apt-get install oracle-java8-installer

mkdir java
mv ~/jdk-8u231-linux-x64.tar.gz .
mv jdk-8u231-linux-x64.tar.gz ./java/
cd java
ll
tar zxvf jdk-8uversion-linux-x64.tar.gz
tar zxvf jdk-8u231-linux-x64.tar.gz

cat /etc/environment
JAVA_HOME="/usr/java/jdk1.8.0_231"

find / -name slf4j*
mv slf4j-jdk14-1.7.25.jar /opt/oss/servicemgr/ICAgent/pinpoint
cd /opt/oss/servicemgr/ICAgent/pinpoint
mv slf4j-jdk14-1.7.25.jar ./lib

mysql-connector-java_8.0.18-1ubuntu18.04_all.deb
apt-get install libmysql-java

java -cp .:mysql-connector-java-5.1.45.jar TestMySQL


