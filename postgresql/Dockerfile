FROM centos:6.6
MAINTAINER jack<jack@is-land.com.tw>

RUN yum install -y epel-release
RUN yum install -y supervisor
RUN yum install -y postgresql postgresql-server
RUN service postgresql initdb
ADD pg_hba.conf /var/lib/pgsql/data/pg_hba.conf
ADD postgresql.conf /var/lib/pgsql/data/postgresql.conf
RUN chmod 777 /var/lib/pgsql/data/pg_hba.conf
RUN chmod 777 /var/lib/pgsql/data/postgresql.conf

ADD ./start.sh /start.sh
CMD ["/bin/bash", "/start.sh"]
