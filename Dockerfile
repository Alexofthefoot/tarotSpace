FROM ubuntu:trusty
RUN sudo apt-get -y update
RUN sudo apt-get -y upgrade
RUN sudo apt-get install -y sqlite3 libsqlite3-dev
RUN mkdir /db
RUN /usr/bin/sqlite3 /db/test.db
# this copies all files in current directory
COPY . /
# Run the script that builds sqlite db
RUN ./scripts/setupdatabase.sh
CMD /bin/bash