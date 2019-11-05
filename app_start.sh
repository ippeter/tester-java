java -javaagent:/opt/oss/servicemgr/ICAgent/pinpoint/pinpoint-bootstrap.jar -Dapm_application=testmysql -Dapm_tier=testmysql-service -Dapm_noport=true -Xmx512m TestMySQL > apm.log 2>&1 &
