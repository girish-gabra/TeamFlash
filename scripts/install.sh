echo 'Installing LoadBalancer' 

rm -r /home/ec2-user/loadBalancer
mv /home/ec2-user/LoadBalancer /home/ec2-user/loadBalancer

cd '/home/ec2-user/loadBalancer/LoadBalancer'

mvn -e clean install >> /var/log/loadBalancer.log
cp target/*.war /usr/share/tomcat7/webapps/ >> /var/log/LoadBalancer.log
cd  /usr/share/tomcat7/bin

sh ./start.sh >> /var/log/tomcat.log 2>&1 &
