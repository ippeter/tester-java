# tester-java
MySQL Tester written on Java

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


