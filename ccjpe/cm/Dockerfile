FROM cloudbees/jenkins-enterprise:1.625.3.2
ENV JENKINS_UC http://jenkins-updates.cloudbees.com
COPY plugins.txt /plugins.txt
RUN /usr/local/bin/plugins.sh /plugins.txt

COPY ref /usr/share/jenkins/ref
