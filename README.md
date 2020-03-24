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

### How to install MySQL connector

From here: https://dev.mysql.com/doc/connector-j/5.1/en/connector-j-installing.html  

Download from OBS or from here:  
https://dev.mysql.com/downloads/connector/j/  
I used 5.1.47  

Put it to a desired location.  

Modify /etc/profile:  
export CLASSPATH=/path/mysql-connector-java-ver-bin.jar:$CLASSPATH  

### Required tables

use demo;  
create table logs (entry varchar(19));  

### Fix SLF4J issue

Download slf4j-jdk14-1.7.25.jar from OBS.  
mv slf4j-jdk14-1.7.25.jar /opt/oss/servicemgr/ICAgent/pinpoint/lib  

