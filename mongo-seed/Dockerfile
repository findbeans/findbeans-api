FROM mongo:3.4.7

MAINTAINER Zhang Yangming "283796265@qq.com"

COPY movie.json /movie.json

CMD mongoimport --host mongodb --db findbeans --collection movie --drop --type json --file /movie.json


