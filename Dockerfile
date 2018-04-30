FROM gcr.io/google_appengine/openjdk
COPY ./target/universal/bugtf-1.0.tgz /bugtf-1.0.tgz
COPY ./docker-entrypoint.bash /docker-entrypoint.bash
COPY ./libgnutls30.deb /libgnutls30.deb
RUN tar -xvf bugtf-1.0.tgz
WORKDIR /bugtf-1.0
RUN dpkg -i /libgnutls30.deb
RUN apt-get -y install wget
RUN chmod 755 /docker-entrypoint.bash
ENTRYPOINT ["/docker-entrypoint.bash"]
CMD ["bin/bugtf", "-Dlogger.file=conf/logback.xml", "-Dconfig.file=conf/production.conf", "-Dhttp.port=8080"]